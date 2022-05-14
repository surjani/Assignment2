import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetAllToolsTest {
	@Test
	public void getAllToolDetails() {

		String resp = given().baseUri("https://simple-tool-rental-api.glitch.me").when().get("/tools").then()
				.assertThat().statusCode(200).extract().response().asString();
		System.out.println(resp);
	}

}
