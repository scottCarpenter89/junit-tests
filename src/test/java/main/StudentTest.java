package main;

import main.Student;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {
    Student scott = new Student(12345, "Scott");


    @Test
    public void testGetId() {

        assertEquals("should test the id", 12345, scott.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("tests the get name method", "Scott", scott.getName());
    }

//    @Test
//    public void testAddGrade() {
//        assertArrayEquals();
//    }
}
