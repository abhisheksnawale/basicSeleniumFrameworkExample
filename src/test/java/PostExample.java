package test.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import main.java.pojoFiles.User;
import org.testng.Assert;

public class PostExample {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    public static void postAPI(){

        User u1 = new User();
        u1.setId(5);
        u1.setUsername("Minnie");
        u1.setEmail("minnie@gmail.com");
        u1.setAge(17);

        String url = "http://localhost:3000/users";
        String json = null;
        try {
            json = MAPPER.writeValueAsString(u1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        Response response = RestAssured.given().contentType("application/json").
                log().all().body(json).post(url).andReturn();

        Assert.assertEquals(response.getStatusCode(), 201, "HTTP Message");

    }
}
