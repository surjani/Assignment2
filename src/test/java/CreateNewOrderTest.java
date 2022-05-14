import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;

public class CreateNewOrderTest {

	String key = "8489c1f236aced96fce12b55308acfe023944c9e2812affe94d21e79f29a6fc5";
	String url = "https://simple-tool-rental-api.glitch.me";

	@Test
	public void createNewOrder() {
		orderDetail order = new orderDetail(4643, "xyz");
		given().baseUri(url).header("Authorization", key).contentType(ContentType.JSON).body(order).when()
				.post("/orders").then().log().all().assertThat().statusCode(201);

		System.out.println("Order Created");

	}

}
