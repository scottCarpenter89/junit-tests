package main;

import main.Student;
import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class StudentTest {


    @Test
    public void testGetId() {
        Student scott = new Student(12345, "Scott");
        assertEquals("should test the id", 12345, scott.getId());
    }

//    @Test
//    public void testGetName() {
//        assertEquals("tests the get name method", "Scott", student.getName());
//    }
//
//    @Test
//    public void testAddGrade() {
//        assertArrayEquals(, );
//    }
}
