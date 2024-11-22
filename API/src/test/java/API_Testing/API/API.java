package API_Testing.API;
import java.util.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OWU4NjM0MzU4ZGZhZTAwMDg4MTcwNzAiLCJpYXQiOjE3MjE5Mjg5MTgsImV4cCI6MTcyMTkzMjUxOH0.KkB13-gvorxS7uBQ23YZ2x_74iSv5hCQ4THrKuq9kMM9dPxUrANKHx7wNLFSX9C1nq2bC6f-zwgjYCihlJtfVg";
		RestAssured.baseURI="https://cms-api-ui-hlv0.coralsports.nonprod.cloud.ladbrokescoral.com/";
		/*given().header("Authorization","Bearer "+token).header("Content-Type","application/json")
		.body(payload.Payload()).when().post("v1/api/home-module/").then().log().all();
			*/
		given().header("Authorization","Bearer "+token).header("Content-Type","application/json").when().delete("v1/api/home-module/66a296aaa91bfc2a8e54a943");
		
		

	}

}
