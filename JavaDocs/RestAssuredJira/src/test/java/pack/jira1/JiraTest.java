package pack.jira1;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

public class JiraTest {

	public static void main(String[]args) {
		
		
		
		RestAssured.baseURI = "http://localhost:8080";
		SessionFilter session = new SessionFilter();
		//get session id
	String resp=	given().header("Content-Type","application/json").body("{ \"username\": \"vijay.chaitanya44\", \"password\": \"Javahub44#testing\" }").log().all().
		filter(session).when().post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
	//add comment
		String jiraComment = "Happy birthday";
		String comment=given().pathParam("id", "10201").log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\": \""+jiraComment+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(session).
		when().post("/rest/api/2/issue/{id}/comment").
		then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath js = new JsonPath(comment);
		String commentID=js.getString("id");
		
	//add attachment
		given().pathParam("id", "10201").header("X-Atlassian-Token","no-check").filter(session).header("Content-Type","multipart/form-data")
		.multiPart("file",new File("D:\\Eclipse WS\\Interview_Prep\\RestAssuredJira\\src\\test\\resources\\file3.txt")).when().post("rest/api/2/issue/{id}/attachments").
		then().log().all().assertThat().statusCode(200);
		
		
		//get Issue
		
		String ticketDetails =given().filter(session).pathParam("id", "10201").when().get("/rest/api/2/issue/{id}").
		then().assertThat().statusCode(200).extract().response().asString();
		//System.out.println(ticketDetails);
		
		//get issue only fields
		String onlyFields =given().filter(session).pathParam("id", "10201").queryParam("fields","comment").when().get("/rest/api/2/issue/{id}").
				then().assertThat().statusCode(200).extract().response().asString();
				System.out.println(onlyFields);
				
				
		JsonPath js1 = new JsonPath(onlyFields);
		int commentCount =js1.getInt("fields.comment.comments.size()");
		
		for(int i=0;i<commentCount;i++) {
			String cId =js1.get("fields.comment.comments["+i+"].id").toString();
			
			if(cId.equalsIgnoreCase(commentID)) {
				String actualComment= js1.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(actualComment);
				
				Assert.assertEquals(jiraComment, actualComment);
			
			}
		}
		
		
	}
	

	
	
	
	
}
