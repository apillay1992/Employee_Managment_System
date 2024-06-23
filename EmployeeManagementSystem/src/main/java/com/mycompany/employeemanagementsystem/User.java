/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

import java.io.Serializable;

/**
 *
 * @author ashley
 */
public class User implements Serializable {
    
    private String name;
    private String surname;
    private String securityQuestion;
    private String username;
    private String password;
    
    public User(String name, String surname, String securityQuestion, String username, String password){
        this.name = name;
        this.surname = surname;
        this.securityQuestion = securityQuestion;
        this.username = username;
        this.password = password;
       
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
