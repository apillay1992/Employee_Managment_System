/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;

import com.mycompany.employeemanagementsystem.AddEmployee;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author ashley
 */
public class AddEmployeeTest {

    @Test
    public void testConstructor() {
        AddEmployee addEmployee = new AddEmployee();
        assertNotNull(addEmployee);
    }

    @Test
    public void testInitialFieldsEmpty() {
        AddEmployee addEmployee = new AddEmployee();
        assertTrue(addEmployee.getEmployeeNameTextField().getText().isEmpty());
        assertTrue(addEmployee.getEmployeeSurnameTextField().getText().isEmpty());
        assertTrue(addEmployee.getStaffNumberTextField().getText().isEmpty());
        assertTrue(addEmployee.getEmailTextField().getText().isEmpty());
    }

    @Test
    public void testJobComboBoxNotEmpty() {
        AddEmployee addEmployee = new AddEmployee();
        assertNotNull(addEmployee.getJobComboBox());
        assertTrue(addEmployee.getJobComboBox().getItemCount() > 0);
    }

    @Test
    public void testSaveButtonEnabled() {
        AddEmployee addEmployee = new AddEmployee();
        assertTrue(addEmployee.getSaveButton().isEnabled());
    }
}