package com.qa.rest.JIRAspec;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.qa.rest.JIRAJsons.LoginCredBody;
import com.qa.rest.JIRAJsons.LoginInfo;
import com.qa.rest.JIRAJsons.ResponseJessionBody;
import com.qa.rest.JIRAJsons.Session;

public class JiraDemo1 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:8080/";
		SessionFilter session = new SessionFilter();

		//Session s = new Session();
		//LoginInfo lg = new LoginInfo();
		LoginCredBody l = new LoginCredBody();
		l.setUsername("itguy.gamer");
		l.setPassword("Javahub44@test#");
/**
		Response resp = given().log().all().header("Content-Type", "application/json").body(l).when()
				.post("rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response();

		String res = resp.asString();
		System.out.println(res);
**/
		ResponseJessionBody js = given().header("Content-Type", "application/json").body(l).expect()
				.defaultParser(Parser.JSON).when().post("rest/auth/1/session").then().assertThat()
				.statusCode(200).extract().as(ResponseJessionBody.class);

		String name = js.getSession().getName();
		String value = js.getSession().getValue();

		System.out.println(name);
		System.out.println(value);

	}
}
