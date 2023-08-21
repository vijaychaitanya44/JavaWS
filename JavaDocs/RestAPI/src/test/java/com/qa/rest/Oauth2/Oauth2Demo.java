package com.qa.rest.Oauth2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import com.qa.rest.files.Utils;

public class Oauth2Demo {

	public static void main(String[] args) {
		
		String url ="https://rahulshettyacademy.com/getCourse.php?code=4%2F0Adeu5BW1KP6XrofoJQih_vYjBaRHgPlvPFI-mGIRw8baobUkaef8EDivUg71BbGBHimubw&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=none";
			String pcode =url.split("code=")[1];
			String code = "4%2F0Adeu5BUgBrgxzty1wWUWcVs1VuhOIrHCO3BlvGpSOejoUZOmEEgtoa6DOkpx9KQZo4bvzw";
			System.out.println(code);
			
			
		String accessTokenResponse = given().urlEncodingEnabled(false)
				.queryParams("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js = Utils.rawToJson(accessTokenResponse);
		
		
		String accessToken = js.getString("access_token");
		System.err.println(accessToken);
		String response = given().queryParam("access_token", accessToken).when().log().all()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();

		System.out.println(response);

	}

}
