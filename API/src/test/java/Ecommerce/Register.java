package Ecommerce;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Register {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		//Static body payload
		String res= given().log().all().header("Content-Type","application/json")
		.body("{\"firstName\":\"sruthi\",\"lastName\":\"Mukkoti\","
				+ "\"userEmail\":\"sruthimukkoti123@gmail.com\",\"userRole\":\"customer\",\"occupation\":\"Engineer\","
				+ ""
				+ "\"gender\":\"Female\",\"userMobile\":\"9878965432\",\"userPassword\":\"Second@123\","
				+ "\"confirmPassword\":\"Second@123\",\"required\":true}")
		.when().post("/api/ecom/auth/register").then().log().all().extract().response().asString();
		JsonPath js=new JsonPath(res);
		System.out.println(js.get("message"));
	}

}
