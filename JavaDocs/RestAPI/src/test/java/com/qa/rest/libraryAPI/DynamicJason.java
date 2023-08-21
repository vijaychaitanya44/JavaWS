package com.qa.rest.libraryAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.rest.files.Payload;
import com.qa.rest.files.Utils;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJason {
	
	@Test(enabled=false)
	
	public void addBook() {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response =given().log().all().header("Content-Type","application/json").body(Payload.addBook())
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = Utils.rawToJson(response);
		
		String id = js.get("ID");
		System.out.println(id);
			
	}
	
	@Test
	
	public void addAuthorBookAise() {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response =given().log().all().header("Content-Type","application/json").body(Payload.addBook("Skd", "556", "Hari"))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = Utils.rawToJson(response);
		
		String id = js.get("ID");
		System.out.println(id);
	}
	
	@Test(dataProvider = "books")
	
	public void addAuthorBookAiseList(String isbn, String aisle, String author) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response =given().log().all().header("Content-Type","application/json").body(Payload.addBook(isbn,aisle,author))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = Utils.rawToJson(response);
		
		String id = js.get("ID");
		System.out.println(id);
	}

	
	@DataProvider(name="books")
	public Object getBooksList() {
		
		return new Object [][] {{"Loop","899","Looper"}, {"Hope","22","Joker"}, {"Lost","012","Loser"}};
		}
		}

