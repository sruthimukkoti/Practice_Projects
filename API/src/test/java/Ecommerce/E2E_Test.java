package Ecommerce;
import POJO.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class E2E_Test {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Login login=new Login();
		login.setUserEmail("sruthimukkoti123@gmail.com");
		login.setUserPassword("Second@123");
		given().body(login).contentType("application/json").when().post("/api/ecom/auth/login").then().log().all();
	}
}
