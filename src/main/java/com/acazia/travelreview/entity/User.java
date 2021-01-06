package com.acazia.travelreview.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "email")
    private String email;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "phone")
    private char phone;

    public User(long id, String name, String userName, String userPassword, String email, String facebook, char phone) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.facebook = facebook;
        this.phone = phone;
    }

    public User(String name, String userName, String userPassword, String email, String facebook, char phone) {
        this.name = name;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.facebook = facebook;
        this.phone = phone;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public char getPhone() {
        return phone;
    }

    public void setPhone(char phone) {
        this.phone = phone;
    }
}
