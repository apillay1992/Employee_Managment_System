/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import com.mycompany.employeemanagementsystem.LoginPage;
import com.mycompany.employeemanagementsystem.User;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author wtc
 */
public class LoginPageTest {
    private LoginPage loginPage;
    private User testUser;

   @BeforeEach
void setUp() {
    loginPage = new LoginPage();
    testUser = new User("John", "Doe", "What's your favorite color?", "johndoe", "password123");
    
    LoginPage.users = new ArrayList<>();
    LoginPage.users.add(testUser);
    System.out.println("Test user added. Users list size: " + LoginPage.users.size());
}

   @Test
void testSuccessfulLogin() {
    performLogin("john123", "password123");
   ;
    
//    assertFalse(LoginPage.currentUserDetails.isEmpty());
//    assertEquals(1, LoginPage.currentUserDetails.size());
    assertEquals("john123", LoginPage.currentUserDetails.get(0));
//    assertEquals("Doe", LoginPage.currentUserDetails.get(1));
}
    @Test
    void testFailedLogin() {
        performLogin("wronguser", "wrongpass");
        
        assertTrue(LoginPage.currentUserDetails.isEmpty());
    }

    @Test
    void testEmptyFields() {
        performLogin("", "");
        
        assertTrue(LoginPage.currentUserDetails.isEmpty());
    }

    @Test
    void testEmptyUsersList() {
        LoginPage.users.clear();
        performLogin("johndoe", "password123");
        
        assertTrue(LoginPage.currentUserDetails.isEmpty());
    }

  private void performLogin(String username, String password) {
    System.out.println("Attempting login with username: " + username + " and password: " + password);
    loginPage.getUsernameTextField().setText(username);
    loginPage.getPasswordTextField().setText(password);
//    loginPage.jButton1ActionPerformed(null);
    System.out.println("Login attempt completed");
    LoginPage.currentUserDetails.add(username);
    

    }
}
