package test.java;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import main.java.pojoFiles.User;
import java.lang.reflect.Type;
import java.util.List;

public class GetExample {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    public static void getAPI(){

        String url = "http://localhost:3000/users";

        Type type = new TypeReference<List<User>>() {}.getType();

        List<User> userList = RestAssured.get(url).as(type);

        System.out.println(userList.toString());
    }
}
