package com.qa.rest.POJODeserilzation;

import static io.restassured.RestAssured.given;

import java.util.List;

import com.qa.rest.files.Utils;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class OathPojoDemo {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0Adeu5BW1KP6XrofoJQih_vYjBaRHgPlvPFI-mGIRw8baobUkaef8EDivUg71BbGBHimubw&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=none";
		String pcode = url.split("code=")[1];
		String code = "4%2F0Adeu5BUNXi2GVhAZVF3aoTT4l7CkmHUpNUUd9hRUFhitgDx5qI5dd-kMmw_9BwV-8BxDQg";
		System.out.println(code);

		String accessTokenResponse = given().urlEncodingEnabled(false).queryParams("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js = Utils.rawToJson(accessTokenResponse);

		String accessToken = js.getString("access_token");
		System.err.println(accessToken);

		MainCourses mc = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(MainCourses.class);
		
		System.out.println(mc.getLinkedIn());
		System.out.println(mc.getCourses().getWebAutomation().get(2).getPrice());
		
	List<WebAutomation> webs=mc.getCourses().getWebAutomation();
	
	for(int i=0;i<webs.size();i++) {
	String title=	webs.get(i).getCourseTitle();
	String price=	webs.get(i).getPrice();
	System.out.println(title+": "+price);
	}
	}

}
