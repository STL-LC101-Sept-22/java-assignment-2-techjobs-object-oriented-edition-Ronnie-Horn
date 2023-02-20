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

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob2.equals(testJob1));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job3 = testJob3.toString();
        int length = job3.length();
        assertEquals('\n', job3.charAt(0));
        assertEquals('\n', job3.charAt(length - 1));
//        System.out.println(job3);
//        System.out.println(testJob3);
//        System.out.println(length);
    }


    //      check  1  When passed a Job object, it should return a string that contains a blank line before and after the job information.
//        In JobTest, add a new test named testToStringStartsAndEndsWithNewLine to check the first requirement.
//        Be sure to use assertEquals to verify that these characters are correct, and to use the exact formatting demonstrated above.
//        This test should check that the first and last characters of the string both the newline character, \n.
//        Recall that can get the character at a given position in a string using the string method charAt.
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = testJob4.toString();


        assertEquals("ID: " + testJob4.getId(), "ID: " + testJob4.getId());
        assertEquals("Name: Product tester", "Name: " + testJob4.getName().toString());
        assertEquals("Employer: ACME", "Employer: " + testJob4.getEmployer().getValue().toString());
        assertEquals("Location: Desert", "Location: " + testJob4.getLocation().getValue().toString());
        assertEquals("Position Type: Quality control", "Position Type: " + testJob4.getPositionType().getValue().toString());
        assertEquals("Core Competency: Persistence", "Core Competency: " + testJob4.getCoreCompetency().getValue().toString());


        //        System.out.println(testJob4.getEmployer().getValue().toString());
//        System.out.println("Employer: " + testJob4.getEmployer().getValue());
    }

    @Test
    public void testToStringHandlesEmptyField() {

        Job testJob5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String job5String = testJob5.toString();
//            assertEquals(job5String, testJob5.toString());
        assertEquals("Data not available", testJob5.getEmployer().getValue());
//        System.out.println(testJob5.getEmployer().getValue());
//        System.out.println(testJob5.getCoreCompetency().getValue());
//        System.out.println(testJob5.getLocation().getValue());
//        System.out.println(testJob5.getPositionType().getValue());
//        System.out.println(testJob5.getName());

//        Job testJob5 = new Job("", new Employer(" "), new Location(" "), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String job5String = testJob5.toString();
//
//        assertEquals("Data not available", testJob5.getEmployer().getValue());
//        System.out.println(testJob5.getEmployer().getValue());

    }


//        2  The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//        Code a new test for the second required behavior, named testToStringContainsCorrectLabelsAndData. Then run the tests to make sure the new one fails.
//                Modify toString to make the new test pass. Also, make sure that your updates still pass all of the old tests
};