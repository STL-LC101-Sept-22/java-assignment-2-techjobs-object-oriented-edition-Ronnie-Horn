package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.sql.SQLOutput;
import java.util.Objects;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {



    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getId() > 0);
        assertTrue(Objects.equals(testJob.getEmployer().getValue(), "ACME"));
        assertTrue(Objects.equals(testJob.getLocation().getValue(), "Desert"));
        assertTrue(Objects.equals(testJob.getPositionType().getValue(), "Quality control"));
        assertTrue(Objects.equals(testJob.getCoreCompetency().getValue(), "Persistence"));
        assertTrue(Objects.equals(testJob.getName(), "Product tester"));
//        System.out.println(Objects.equals(testJob.getEmployer().getValue(),"ACME"));
//        System.out.println(testJob.getEmployer().getValue());

        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
//        System.out.println(testJob.getCoreCompetency().getValue());

    }
// TODO : Test the full constructor    Each Job object should contain six fields—id, name, employer, location, positionType, and coreCompetency.
//  The data types for these fields are int, String, Employer, Location, PositionType, and CoreCompetency, respectively.
//  Declare and initialize a new Job object with the following data:  new Job("Product tester", new Employer("ACME"), new Location("Desert"),
//  new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
//        Your test should have 5 assert statements of each type.





    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());


    }
    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob2.equals(testJob1));
    }
}


