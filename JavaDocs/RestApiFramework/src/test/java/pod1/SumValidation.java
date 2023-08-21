package pod1;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	@Test
	public void sumOfCourses() {
		
		
		JsonPath js = new JsonPath(PayLoad.coursePrice());
		
		int courseSize =js.getInt("courses.size()");
		int sum=0;
		for(int i=0;i<courseSize;i++) {
			
			int copies = js.getInt("courses["+i+"].copies");
			int price = js.getInt("courses["+i+"].price");
			
			int amount = copies*price;
			
			System.out.println("total amount for course "+js.getString("courses["+i+"].title") +" "+amount);
			sum = sum+amount;
			
		}
		System.out.println("Total purchase amount: "+sum);
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseAmount);
	
	}

}
