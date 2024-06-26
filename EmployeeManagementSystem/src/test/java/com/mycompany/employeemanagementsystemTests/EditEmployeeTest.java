/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import com.mycompany.employeemanagementsystem.EditEmployee;
import com.mycompany.employeemanagementsystem.Employee;
import com.mycompany.employeemanagementsystem.Job;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author wtc
 */
public class EditEmployeeTest {
    
   
    private EditEmployee editEmployee;

    @BeforeEach
    void setUp() {
        editEmployee = new EditEmployee();
        editEmployee.clearJobs();
        editEmployee.clearEmployees();
    }

    @Test
    void testPopulateJobsComboBox() {
        editEmployee.addJob(new Job(50000, "Developer"));
        editEmployee.addJob(new Job(60000, "Manager"));

        String[] expectedJobsArray = {
            "Developer, R50,000.00",
            "Manager, R60,000.00"
        };

        String[] actualJobsArray = new String[editEmployee.getJobs().size()];
        for (int i = 0; i < editEmployee.getJobs().size(); i++) {
            Job job = editEmployee.getJobs().get(i);
            actualJobsArray[i] = job.getNameOfJob() + ", R" + editEmployee.getFormatter().format(job.getSalary());
        }
        
        assertArrayEquals(expectedJobsArray, actualJobsArray);
    }

    @Test
    void testPopulateEmployeesComboBox() {
        Job job1 = new Job(50000, "Developer");
        Job job2 = new Job(60000, "Manager");
        editEmployee.addEmployee(new Employee("John", "Doe", job1, 1001, "john@example.com"));
        editEmployee.addEmployee(new Employee("Jane", "Smith", job2, 1002, "jane@example.com"));

        String[] expectedEmpArray = {
            "John, Doe",
            "Jane, Smith"
        };

        String[] actualEmpArray = new String[editEmployee.getEmployees().size()];
        for (int i = 0; i < editEmployee.getEmployees().size(); i++) {
            Employee emp = editEmployee.getEmployees().get(i);
            actualEmpArray[i] = emp.getName() + ", " + emp.getSurname();
        }

        assertArrayEquals(expectedEmpArray, actualEmpArray);
    }


    @Test
    public void testFormatterFormat() {
        double salary = 50000.50;
        String formattedSalary = editEmployee.getFormatter().format(salary);
        assertEquals("50,000.50", formattedSalary);
    }
    
}
