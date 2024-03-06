package main.java.pojoFiles;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "users",
        "posts",
        "comments"
})
@Generated("jsonschema2pojo")
public class Users {

    @JsonProperty("users")
    private List<User> users;
    @JsonProperty("posts")
    private List<Post> posts;
    @JsonProperty("comments")
    private List<Comment> comments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @JsonProperty("posts")
    public List<Post> getPosts() {
        return posts;
    }

    @JsonProperty("posts")
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}