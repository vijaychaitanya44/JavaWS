package com.qa.rest.JiraAPI;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.slf4j.helpers.Util;
import org.testng.Assert;

import com.qa.rest.files.Utils;

public class JiraAPIDemo {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:8080/";
		SessionFilter sessionID = new SessionFilter();

		String resp = given().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"itguy.gamer\", \"password\": \"Javahub44@test#\" }").filter(sessionID).when()
				.post("rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

		JsonPath js = Utils.rawToJson(resp);
		String jsessionID = js.getString("session.name");
		String jseesionValue = js.getString("session.value");
		System.out.println(jsessionID + ": " + jseesionValue);

		String actMsg="Hello Ia m fine are you";
//update comments		
		String resp1 = given().log().all().pathParam("key", "LEG-3").header("Content-Type", "application/json")
				.body("{\r\n" + "    \"body\": \""+actMsg+"\",\r\n"
						+ "    \"visibility\": {\r\n" + "        \"type\": \"role\",\r\n"
						+ "        \"value\": \"Administrators\"\r\n" + "    }\r\n" + "}")
				.filter(sessionID).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201)
				.extract().response().asString();
		
		JsonPath commId=Utils.rawToJson(resp1);
		int cId = commId.getInt("id");
		System.err.println(cId);
		
//Add attachMents
		given().header("X-Atlassian-Token", "no-check").filter(sessionID).multiPart("file",new File("D:\\Eclipse WS\\JavaDocs\\Interview_Prep-prep1\\RestAPI\\src\\test\\resources\\jira.txt"))
		.pathParam("key", "LEG-3").header("Content-Type","multipart/form-data").when().post("rest/api/2/issue/{key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		
	//Get issue	
		String issuedetails=given().filter(sessionID).pathParam("key", "LEG-3").queryParam("fields", "comment")
		.when().get("/rest/api/2/issue/{key}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(issuedetails);
		
		JsonPath js1 = Utils.rawToJson(issuedetails);
		
		int commentCount =js1.getInt("fields.comment.comments.size()");
		System.out.println(commentCount);
		
		for(int i=0;i<commentCount;i++) {
		
			int cCid = js1.getInt("fields.comment.comments["+i+"].id");
			System.out.println(cCid);
			
			if(cCid==cId) {
				String msg = js1.getString("fields.comment.comments["+i+"].body");
				System.out.println(msg);
				Assert.assertEquals(actMsg, msg);
			}
			
		}
		
	
		
		
		

	}
	

		
		

}
