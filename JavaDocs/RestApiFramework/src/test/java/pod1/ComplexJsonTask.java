package pod1;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonTask {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(PayLoad.coursePrice());

		int purchase_amount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchase_amount);
		System.out.println(js.getString("dashboard.website"));
		int coursesCount = js.getInt("courses.size()");

		System.out.println(coursesCount);

		String firstCourse = js.getString("courses[0].title");
		System.out.println(firstCourse);

		for (int i = 0; i < coursesCount; i++) {

			System.out.print(js.getString("courses[" + i + "].title"));
			System.out.println(" " + js.getString("courses[" + i + "].price"));

		}

		for (int i = 0; i < coursesCount; i++) {

			String courseTitle = js.getString("courses[" + i + "].title");
			if (courseTitle.equalsIgnoreCase("Appium")) {
				System.out.println(js.getInt("courses[" + i + "].copies"));
				break;
			}
		}
	}

}
