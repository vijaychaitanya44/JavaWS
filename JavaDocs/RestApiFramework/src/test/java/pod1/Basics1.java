package pod1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.PayLoad;
import files.Util;

public class Basics1 {

	public static void main(String[] args) {
	
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String resp = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(PayLoad.AddPlace()).
				when().post("maps/api/place/add/json").
				then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

		System.out.println(resp);

		//JsonPath js = new JsonPath(resp);
		JsonPath js =Util.convertToJson(resp);
		
		String place_Id=js.get("place_id");
		System.out.println(place_Id);
		System.out.println("++++++++++++++++++++++++++++++++++********************************************++++++++++++++++++++++++++++++++++");
		// Add place ->> Update place with new Address ->> Get place to validate if new address is present
		
		String newAddress ="5th cross, INDIA";
		String updateAddress=given().log().all().queryParam("key", "qaclick123 ").header("Content-Type","application/json").body("{\r\n"
				+ "\"place_id\":\""+place_Id+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("maps/api/place/update/json").
		then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();
		System.out.println(updateAddress);
		System.out.println("++++++++++++++++++++++++++++++++++********************************************++++++++++++++++++++++++++++++++++");
		//Get place
		String getPlaceResp = given().queryParam("key", "qaclick123").queryParam("place_id", place_Id).
		when().get("maps/api/place/get/json").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
		JsonPath js1 = Util.convertToJson(getPlaceResp);
		String actualAddress =js1.getString("address");
		System.out.println(actualAddress);
		
	Assert.assertEquals(actualAddress, newAddress);}
	

	

}
