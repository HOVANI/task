package com.example.admin.myapplication;

public class User {
    String name;
    String lastname;
    boolean gender;
    String email;
    String passwd;

    public User(String name, String lastname, boolean gender, String email, String passwd) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.email = email;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}



