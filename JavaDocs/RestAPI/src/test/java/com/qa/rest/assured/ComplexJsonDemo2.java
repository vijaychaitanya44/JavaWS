package com.qa.rest.assured;

import com.qa.rest.files.Payload;
import com.qa.rest.files.Utils;

import io.restassured.path.json.JsonPath;

public class ComplexJsonDemo2 {

	public static void main(String[] args) {
		JsonPath js = Utils.rawToJson(Payload.getCourses());
		//print no of courses;
		int courseCount = js.getInt("courses.size()");
		System.out.println(courseCount);
		//Print purchase amount
		int purchaseAmout = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmout);
		//Print first course
		//String fCourse = js.getString("courses.get(0).title");
		String fCourse = js.getString("courses[0].title");
		System.out.println(fCourse);
		
		String courseName ="RPA";
	
		for(int i=0;i<courseCount;i++ ) {
			
			String cTitle = js.getString("courses.get("+i+").title");
			
			if(cTitle.equalsIgnoreCase(courseName)) {
				
				int cPrice = js.getInt("courses.get("+i+").price");
				int  cCopies=js.getInt("courses.get("+i+").copies");
				System.out.println(cTitle+": "+cPrice);
				System.out.println(cCopies);
				//break;
			}
			
			
			
			
			
		}
		
		
	}
}
