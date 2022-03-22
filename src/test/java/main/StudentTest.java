package main;

import main.Student;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {
    private final Student scott = new Student();



    @Test
    public void testGetId() {
        scott.setId(12345);
        assertEquals("should test the id", 12345, scott.getId());
    }

    @Test
    public void testGetName() {
        scott.setName("Scott");
        assertEquals("tests the get name method", "Scott", scott.getName());
    }

    @Test
    public void testAddGrade() {
        scott.addGrade(97);
        scott.addGrade(94);
        assertEquals(97, scott.getGrades().get(0).intValue());
        assertEquals(94, scott.getGrades().get(1).intValue());
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals("should average grades ArrayList", 95.5, scott.getGradeAverage(), .2);
    }
}
