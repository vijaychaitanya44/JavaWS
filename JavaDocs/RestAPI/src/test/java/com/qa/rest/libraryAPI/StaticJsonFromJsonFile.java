package com.qa.rest.libraryAPI;

import org.testng.annotations.Test;

import com.qa.rest.files.Utils;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StaticJsonFromJsonFile {

	@Test

	public void addGoolgePlace() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		try {
			String resp = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
					.body(new String(Files.readAllBytes(Paths.get(
							"D:\\Eclipse WS\\JavaDocs\\Interview_Prep-prep1\\RestAPI\\src\\test\\resources\\location.JSON"))))
					.when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract()
					.asString();
			JsonPath js = Utils.rawToJson(resp);

			String palceid = js.getString("place_id");
			System.out.println(palceid);
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
