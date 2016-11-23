package cse110group4.devnet;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jamesbombeelu on 11/6/16.
 */

public class Post {
    private String title;
    private String description;
    private String body;
    private String userId;
    private String postId;
    private int starCount;

    public Map<String, Boolean> stars = new HashMap<>();

    public Post() {}

    public Post(String title, String description, String body, String userId, String postId) {

        this.title = title;
        this.description = description;
        this.body = body;
        this.userId = userId;
        this.postId = postId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public int getStarCount() {
        return starCount;
    }

    public Map<String, Boolean> getStars() {
        return stars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setStars(Map<String, Boolean> stars) {
        this.stars = stars;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostId() {
        return this.postId;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("title", title);
        result.put("description", description);
        result.put("body", body);
        result.put("starCount", starCount);
        result.put("stars", stars);
        result.put("userId", userId);
        result.put("postId", postId);

        return result;
    }
}
