/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.employeemanagementsystem.AddNewJob;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ashley
 */
public class AddNewJobTest {
    
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
    
     @Test
    public void testConstructor() {
        AddNewJob addNewJob = new AddNewJob();
        assertNotNull(addNewJob);
    }

    @Test
    public void testInitialFieldsEmpty() {
        AddNewJob addNewJob = new AddNewJob();
        assertTrue(addNewJob.getJobName().getText().isEmpty());
        assertTrue(addNewJob.getJobSalary().getText().isEmpty());
    }

    @Test
    public void testSaveButtonEnabled() {
        AddNewJob addNewJob = new AddNewJob();
        assertTrue(addNewJob.getSaveButton().isEnabled());
    }
    
    @Test
    public void testPopulateArrayList() {
        AddNewJob addNewJob = new AddNewJob();
        addNewJob.populateArrayList();
    }

}
