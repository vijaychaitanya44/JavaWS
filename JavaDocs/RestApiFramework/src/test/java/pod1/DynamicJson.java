package pod1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.PayLoad;
import files.Util;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DynamicJson {

	@Test(enabled= false)
	public void addBook() {

		RestAssured.baseURI = "http://216.10.245.166";
		String addBookRep = given().log().all().header("Content-Type", "application/json")
				.body(PayLoad.addBookPayLoad()).when().post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();
		System.out.println(addBookRep);

		JsonPath js = Util.convertToJson(addBookRep);
		String bookId = js.getString("ID");
		System.out.println(bookId);
	}
	@Test(enabled= false)
	public void addBookDynamic() {

		RestAssured.baseURI = "http://216.10.245.166";
		String addBookRep = given().log().all().header("Content-Type", "application/json")
				.body(PayLoad.addBookPayLoad("SBI",56)).when().post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();
		System.out.println(addBookRep);

		JsonPath js = Util.convertToJson(addBookRep);
		String bookId = js.getString("ID");
		System.out.println(bookId);
	}
	@Test(dataProvider="bookList")
	public void addBookDynamic(String isbn,int aisle) {

		RestAssured.baseURI = "http://216.10.245.166";
		String addBookRep = given().header("Content-Type", "application/json")
				.body(PayLoad.addBookPayLoad(isbn,aisle)).when().post("Library/Addbook.php").then().assertThat()
				.statusCode(200).extract().response().asString();
		System.out.println(addBookRep);

		JsonPath js = Util.convertToJson(addBookRep);
		String bookId = js.getString("ID");
		System.out.println(bookId);
	}
	
	
	@DataProvider(name="bookList")
	public Object[][] getBookList() {
		
		return new Object[][] {{"Iroenman",3},{"BBgusn",32},{"GrofOT",71},{"Rd56GB",627}};
	}
}
