/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.employeemanagementsystem.AddNewJob;
import com.mycompany.employeemanagementsystem.Job;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.util.ArrayList;
/**
 *
 * @author ashley
 */
public class AddJobTest {
    
    private AddNewJob addNewJob;

    @BeforeEach
    public void setUp() {
        // Initialize AddNewJob without populating from file
        addNewJob = new AddNewJob() {
            @Override
            public void populateArrayList() {
                // Do nothing to prevent populating from file
            }
        };
        addNewJob.setVisible(true); // Ensure the JFrame is visible for testing
    }

    @AfterEach
    public void tearDown() {
        addNewJob.dispose(); // Clean up after each test
    }

    @Test
    public void testInitialGuiComponents() {
        assertNotNull(addNewJob.getJobName()); // Ensure jobName JTextField is initialized
        assertNotNull(addNewJob.getJobSalary()); // Ensure jobSalary JTextField is initialized
        assertNotNull(addNewJob.getSaveButton()); // Ensure saveButton JButton is initialized
    }
//
//    @Test
//    public void testJobSaving() {
//        JTextField jobNameTextField = addNewJob.getJobName();
//        JTextField jobSalaryTextField = addNewJob.getJobSalary();
//        JButton saveButton = addNewJob.getSaveButton();
//
//        jobNameTextField.setText("Software Engineer");
//        jobSalaryTextField.setText("80000");
//
//        saveButton.doClick();
//
//        // Check if the job was added to the jobs list (without saving to file)
//        ArrayList<Job> jobs = addNewJob.getJobs();
//        boolean jobFound = false;
//        for (Job job : jobs) {
//            if (job.getNameOfJob().equals("Software Engineer") && job.getSalary() == 80000.0) {
//                jobFound = true;
//                break;
//            }
//        }
//        assertTrue(jobFound, "Job was not added to the ArrayList<Job>");
//    }
//
//    @Test
//    public void testFieldValidation() {
//        JTextField jobNameTextField = addNewJob.getJobName();
//        JTextField jobSalaryTextField = addNewJob.getJobSalary();
//        JButton saveButton = addNewJob.getSaveButton();
//
//        jobNameTextField.setText("");
//        jobSalaryTextField.setText("80000");
//
//        saveButton.doClick();

        // Verify that a message dialog appears indicating fields are empty
        // (This requires mocking JOptionPane, which is not covered in this basic example)

        // In a real application, you would mock JOptionPane and verify the message
    }

//    @Test
//    public void testJobComboBoxNotEmpty() {
//        JComboBox<String> jobComboBox = addNewJob.getJobComboBox();
//        assertNotNull(jobComboBox); // Ensure jobComboBox is initialized
//        assertTrue(jobComboBox.getItemCount() > 0); // Check that jobComboBox has items
//    }
    
//}
