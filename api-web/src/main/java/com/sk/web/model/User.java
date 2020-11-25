package com.sk.web.model;

public class User {

    private String name;
    private String password;

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }
}
