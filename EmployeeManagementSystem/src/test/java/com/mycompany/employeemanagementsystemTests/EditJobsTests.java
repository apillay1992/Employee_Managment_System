/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystemTests;
import com.mycompany.employeemanagementsystem.EditJobs;
import com.mycompany.employeemanagementsystem.Job;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
/**
 *
 * @author wtc
 */
public class EditJobsTests {
    

    private EditJobs editJobs;

    @BeforeEach
    void setUp() {
        editJobs = new EditJobs();
        editJobs.clearJobs();
    }

    @Test
    void testPopulateJobsComboBox() {
        editJobs.addJob(new Job(50000, "Developer"));
        editJobs.addJob(new Job(60000, "Manager"));

        String[] expectedJobsArray = {
            "Developer, R50,000.00",
            "Manager, R60,000.00"
        };

        String[] actualJobsArray = new String[editJobs.getJobs().size()];
        for (int i = 0; i < editJobs.getJobs().size(); i++) {
            Job job = editJobs.getJobs().get(i);
            actualJobsArray[i] = job.getNameOfJob() + ", R" + editJobs.getFormatter().format(job.getSalary());
        }

        assertArrayEquals(expectedJobsArray, actualJobsArray);
    }

    @Test
    void testEditJob() {
        Job job = new Job(50000, "Developer");
        editJobs.addJob(job);

        // Simulate editing the job
        job.setNameOfJob("Senior Developer");
        job.setSalary(70000);

        ArrayList<Job> jobs = editJobs.getJobs();
        assertEquals("Senior Developer", jobs.get(0).getNameOfJob());
        assertEquals(70000, jobs.get(0).getSalary());
    }

    @Test
    void testDeleteJob() {
        editJobs.addJob(new Job(50000, "Developer"));
        editJobs.addJob(new Job(60000, "Manager"));

        // Simulate deleting a job
        editJobs.removeJob(0);

        ArrayList<Job> remainingJobs = editJobs.getJobs();
        assertEquals(1, remainingJobs.size());
        assertEquals("Manager", remainingJobs.get(0).getNameOfJob());
    }

    @Test
    void testFormatterFormat() {
        double salary = 50000.50;
        String formattedSalary = editJobs.getFormatter().format(salary);
        assertEquals("50,000.50", formattedSalary);
    }
    
}
