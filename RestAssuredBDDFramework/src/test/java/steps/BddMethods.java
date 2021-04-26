package steps;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hamcrest.core.Is;

import io.restassured.http.ContentType;
import model.Address;
import model.FirstUser;

public class BddMethods {
	
    public static void PerformPOSTWithBodyParameter() {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("userId", "1");
        postContent.put("id", "102");
        postContent.put("title", "Title is making post 1");
        postContent.put("body", "A short story about the social gathering");
        given()
                .contentType(ContentType.JSON).
        with()
                .body(postContent).
        when()
                .post("https://jsonplaceholder.typicode.com/posts").
        then()
        		.assertThat()
        		.statusCode(201).
        and()		
                .body("title", Is.is("Title is making post 1")).
        and()
         		.body("body", Is.is("A short story about the social gathering"));
    }
    
    public static void PerformPOSTWithCommentAPI() {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("postId", "1");
        postContent.put("id", "1");
        postContent.put("name", "Manoj KR");
        postContent.put("email", "Manoj@gardner.biz");
        postContent.put("body", "This is a short story about me 1");
        given()
                .contentType(ContentType.JSON).
        with()
                .body(postContent).
        when()
                .post("https://jsonplaceholder.typicode.com/comments").
        then()
        		.assertThat()
        		.statusCode(201).
        and()		
                .body("name", Is.is("Manoj KR")).
        and()
         		.body("body", Is.is("This is a short story about me 1"));
    }
    
    public static void PerformPOSTWithUsersAPI() {
        Address address=new Address();
        address.setStreetAddress("St Albans");
        address.setPhone(12345678);
        address.setEmail("manu@gmail.com");
        
        FirstUser user=new FirstUser();
        user.setFirstName("Manoj");
        user.setLastName("Rajan");
        user.setAddressObject(address);     
                   
        given()
                .contentType(ContentType.JSON).
        with()
                .body(user).
        when()
                .post("https://jsonplaceholder.typicode.com/users").
        then()
        		.assertThat()
        		.statusCode(201).
        and()		
                .body("id", Is.is("11"));
    }

}
