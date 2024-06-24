/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import com.mycompany.employeemanagementsystem.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author wtc
 */
public class UserTest {
    
    @Test
    public void testUserConstructor() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");

        assertEquals("John", user.getName());
        assertEquals("Doe", user.getSurname());
        assertEquals("What is your pet's name?", user.getSecurityQuestion());
        assertEquals("johndoe", user.getUsername());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testSetName() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        user.setName("Jane");
        assertEquals("Jane", user.getName());
    }

    @Test
    public void testSetSurname() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        user.setSurname("Smith");
        assertEquals("Smith", user.getSurname());
    }

    @Test
    public void testSetSecurityQuestion() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        user.setSecurityQuestion("What is your mother's maiden name?");
        assertEquals("What is your mother's maiden name?", user.getSecurityQuestion());
    }

    @Test
    public void testSetUsername() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        user.setUsername("janedoe");
        assertEquals("janedoe", user.getUsername());
    }

    @Test
    public void testSetPassword() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());
    }

    @Test
    public void testGetName() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        assertEquals("John", user.getName());
    }

    @Test
    public void testGetSurname() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        assertEquals("Doe", user.getSurname());
    }

    @Test
    public void testGetSecurityQuestion() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        assertEquals("What is your pet's name?", user.getSecurityQuestion());
    }

    @Test
    public void testGetUsername() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        assertEquals("johndoe", user.getUsername());
    }

    @Test
    public void testGetPassword() {
        User user = new User("John", "Doe", "What is your pet's name?", "johndoe", "password123");
        assertEquals("password123", user.getPassword());
    }
    
}
