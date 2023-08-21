package com.qa.rest.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.rest.files.Payload;
import com.qa.rest.files.Utils;

import io.restassured.path.json.JsonPath;

public class SumValidation {

	
	@Test
	
	public void sumOfCourses() {
		
		JsonPath js = Utils.rawToJson(Payload.getCourses());
		
		int courseCount = js.getInt("courses.size()");
		int expAmount = 5065;
		int actAmount = 0;

		for (int i = 0; i < courseCount; i++) {

			int amt = js.getInt("courses[" + i + "].copies") * js.getInt("courses[" + i + "].price");

			actAmount = actAmount + amt;

		}
		System.out.println(actAmount);

		Assert.assertEquals(actAmount, expAmount);
		
	}
	@Test
	public void getCopies() {
		JsonPath js = Utils.rawToJson(Payload.getCourses());
		
		int courseCount = js.getInt("courses.size()");
		
		for(int i=0;i<courseCount;i++) {
			
			String course = js.getString("courses["+i+"].title");
			int copies = js.getInt("courses["+i+"].copies");
			System.out.println(course+": "+copies);
		}
	}
}
