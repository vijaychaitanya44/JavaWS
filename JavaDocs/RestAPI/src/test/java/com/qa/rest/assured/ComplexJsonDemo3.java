package com.qa.rest.assured;

import org.testng.Assert;

import com.qa.rest.files.Payload;
import com.qa.rest.files.Utils;

import io.restassured.path.json.JsonPath;

public class ComplexJsonDemo3 {

	public static void main(String[] args) {
		JsonPath js = Utils.rawToJson(Payload.getCourses());
		// print no of courses;
		int courseCount = js.getInt("courses.size()");
		System.out.println(courseCount);
		// Print purchase amount
		int purchaseAmout = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmout);
		// Print first course
		// String fCourse = js.getString("courses.get(0).title");
		String fCourse = js.getString("courses[0].title");
		System.out.println(fCourse);
		int expAmount = 5065;
		int actAmount = 0;

		for (int i = 0; i < courseCount; i++) {

			int amt = js.getInt("courses[" + i + "].copies") * js.getInt("courses[" + i + "].price");

			actAmount = actAmount + amt;

		}
		System.out.println(actAmount);

		Assert.assertEquals(actAmount, expAmount);

	}

}
