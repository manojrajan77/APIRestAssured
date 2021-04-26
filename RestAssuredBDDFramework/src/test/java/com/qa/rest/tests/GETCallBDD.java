package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GETCallBDD {
	
	@Test
	public void test_total_users_count() {
		given().
		when().
			get("https://jsonplaceholder.typicode.com/users/").
		then().
			assertThat().
			statusCode(200).
			and().
			body("id",hasSize(10)).
			and().
			header("content-length",equalTo("155"));	
			
	}

}
