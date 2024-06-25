/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import com.mycompany.employeemanagementsystem.Employee;
import com.mycompany.employeemanagementsystem.Job;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author ashley
 */
public class EmployeeTest {
    
    
    @Test
    public void testConstructorAndGetters() {
        Job job = new Job(50000, "Developer");
        Employee employee = new Employee("John", "Doe", job, 1001, "john.doe@example.com");

        assertEquals("John", employee.getName());
        assertEquals("Doe", employee.getSurname());
        assertEquals(job, employee.getJob());
        assertEquals(1001, employee.getStaffNr());
        assertEquals("john.doe@example.com", employee.getEmail());
    }
    
   @Test
    public void testConstructor() {
        Job job = new Job(50000, "Developer");
        Employee employee = new Employee("John", "Doe", job, 1001, "john.doe@example.com");
        
        assertNotNull(employee);
    }

    @Test
    public void testGetName() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        assertEquals("John", employee.getName());
    }

    @Test
    public void testGetSurname() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        assertEquals("Doe", employee.getSurname());
    }

    @Test
    public void testGetJob() {
        Job job = new Job(50000, "Developer");
        Employee employee = new Employee("John", "Doe", job, 1001, "john.doe@example.com");
        assertEquals(job, employee.getJob());
    }

    @Test
    public void testGetStaffNr() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        assertEquals(1001, employee.getStaffNr());
    }

    @Test
    public void testGetEmail() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    public void testSetName() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        employee.setName("Jane");
        assertEquals("Jane", employee.getName());
    }

    @Test
    public void testSetSurname() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        employee.setSurname("Smith");
        assertEquals("Smith", employee.getSurname());
    }

    @Test
    public void testSetJob() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        Job newJob = new Job(60000, "Manager");
        employee.setJob(newJob);
        assertEquals(newJob, employee.getJob());
    }

    @Test
    public void testSetStaffNr() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        employee.setStaffNr(1002);
        assertEquals(1002, employee.getStaffNr());
    }

    @Test
    public void testSetEmail() {
        Employee employee = new Employee("John", "Doe", null, 1001, "john.doe@example.com");
        employee.setEmail("john.doe@newcompany.com");
        assertEquals("john.doe@newcompany.com", employee.getEmail());
    }
    
}
