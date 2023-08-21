package files;

import io.restassured.path.json.JsonPath;

public class Util {
	
	
	public static JsonPath convertToJson(String response) {
		
		JsonPath js1 = new JsonPath(response);
		return js1;
	}

}
