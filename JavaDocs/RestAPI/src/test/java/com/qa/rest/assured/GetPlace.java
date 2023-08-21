package com.qa.rest.assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.qa.rest.files.Payload;
import com.qa.rest.files.Utils;

public class GetPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Post adding palce
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.addPlace()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response()
				.asString();
		System.out.println(response);

		JsonPath js = new JsonPath(response);
		String placeID = js.getString("place_id");
		System.out.println(placeID);
		// Update Place

		String newAddress = "Takgasi,Japan";
		given().log().all().queryParam("key", "prob123").headers("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeID + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Get Place

		String getPlace = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID).when()
				.get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

		JsonPath js2 = Utils.rawToJson(getPlace);

		String updatePlace = js2.getString("address");
		System.out.println(updatePlace);
		Assert.assertEquals(updatePlace, newAddress);
	}

}
