package cse110group4.devnet;

import java.util.ArrayList;

/**
 * Created by jamesbombeelu on 11/6/16.
 */

public class User {

    private String email;
    private String password;
    private String name;
    private boolean isDeveloper;
    private boolean isClient;
    private ArrayList<Project> projects = new ArrayList<Project>();
    private ArrayList<Post> posts = new ArrayList<Post>();

    public User() {}

    public User(String email, String password, String name, boolean isDev, boolean isClient) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.isDeveloper = isDev;
        this.isClient = isClient;
    }

    public boolean isClient() {
        return isClient;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public String getPassword() {
        return password;
    }
}
