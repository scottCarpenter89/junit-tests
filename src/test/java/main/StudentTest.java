package main;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {
//    private final Student scott = new Student();
    public static final long STUDENT_ID = 42;
    public static final String STUDENT_NAME = "Scott";
    public static final ArrayList<Integer> STUDENT_GRADES = new ArrayList<>(Arrays.asList(97, 94, 95));
    public static final double STUDENT_AVERAGE = 95.3;

    @Test
    public void testConstructor() {
        Student scott = new Student(STUDENT_ID, STUDENT_NAME);
        assertEquals(STUDENT_ID, scott.getId());
        assertEquals(STUDENT_NAME, scott.getName());
        assertTrue(scott.getGrades().isEmpty());
    }
    @Test
    public void testGetId() {
        Student scott = new Student(STUDENT_ID, STUDENT_NAME);
        assertEquals("should test the id", STUDENT_ID, scott.getId());
    }

    @Test
    public void testGetName() {
        Student scott = new Student(STUDENT_ID, STUDENT_NAME);
        assertEquals(STUDENT_NAME, scott.getName());
    }

    @Test
    public void testAddGrade() {
        Student scott = new Student();
        for (Integer grade : STUDENT_GRADES) {
            scott.addGrade(grade);
        }
        assertEquals(STUDENT_GRADES, scott.getGrades());
    }

    @Test
    public void testGetGrades() {
        Student scott = new Student(STUDENT_ID, STUDENT_NAME);
        assertTrue(scott.getGrades().isEmpty());
    }
    @Test
    public void testGetGradeAverage(){
        Student scott = new Student();
        for (Integer grade : STUDENT_GRADES) {
            scott.addGrade(grade);
        }
        assertEquals(STUDENT_AVERAGE, scott.getGradeAverage(), 1);
    }


}
