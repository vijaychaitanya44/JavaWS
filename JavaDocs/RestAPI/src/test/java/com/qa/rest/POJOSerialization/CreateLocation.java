package com.qa.rest.POJOSerialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
public class CreateLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		GooglePlaces g = new GooglePlaces();
		
		g.setAccuracy(50);
		g.setName("Frontline Aplle house");
		g.setPhone_number("(+91) 983 893 3937");
		g.setAddress("29, side layout, cohen 09");
		g.setWebsite("https//google.com");
		g.setLanguage("Telugu-IN");
		
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		g.setLocation(l);
	
		List<String> list = new ArrayList<>();
		list.add("shoe park");
		list.add("shop");
		g.setTypes(list);
		
		
		
		
	Response resp=	given().log().all().  queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(g)
		.when().post("maps/api/place/add/json")
		.then().log(). all(). assertThat().statusCode(200).extract().response();

	String s = resp.asString();
	System.out.println(s);
	}

}
