import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ClientRegistrationTest {

	@Test
	public void create_New_Client() {

		clientDetail client = new clientDetail("xyz", "xyz@example.com");

		String token = given().baseUri("https://simple-tool-rental-api.glitch.me").contentType(ContentType.JSON)
				.body(client).when().post("/api-clients").then().statusCode(201).log().all().extract().asString();

		System.out.println("Token:" + token);
		//return token;
	}

}
