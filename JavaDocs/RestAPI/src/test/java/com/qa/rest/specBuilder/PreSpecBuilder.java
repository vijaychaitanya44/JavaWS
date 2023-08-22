package com.qa.rest.specBuilder;

import java.util.ArrayList;
import java.util.List;

import com.qa.rest.POJOSerialization.GooglePlaces;
import com.qa.rest.POJOSerialization.Location;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PreSpecBuilder {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		GooglePlaces g = new GooglePlaces();

		g.setAccuracy(50);
		g.setName("Frontline Aplle house");
		g.setPhone_number("(+91) 983 893 3937");
		g.setAddress("29, side layout, cohen 09");
		g.setWebsite("https//avis.com");
		g.setLanguage("Hindi-IN");

		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);

		g.setLocation(l);

		List<String> list = new ArrayList<>();
		list.add("shoe park");
		list.add("shop");
		g.setTypes(list);
/***
		String resp = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(g).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.extract().response().asString();

		System.out.println(resp);
*/
		RequestSpecification incoming = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		ResponseSpecification  outgoing= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		RequestSpecification query = given().spec(incoming).body(g);
		
		Response result = query.when().post("maps/api/place/add/json").then().spec(outgoing).extract().response();

			String rString = result.asString();
			System.out.println(rString);
	}
}
