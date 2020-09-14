package com.quy.learnretrofit;

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public int getUserId() {
        return postId;
    }

    public void setUserId(int userId) {
        this.postId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
