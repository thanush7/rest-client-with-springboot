package com.kgisl.restcli.entity;

public class Post {
    private int id;
    private String uname;
    private String email;

    public Post() {
    }

    public Post(int id, String uname, String email) {
        this.id = id;
        this.uname = uname;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
