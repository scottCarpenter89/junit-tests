import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {
    private Student student = new Student(123345, "Scott");

    @Test
    public void testGetId() {
        assertEquals("should test the id", 123345, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("tests the get name method", "Scott", student.getName());
    }
@Test
    public void testAddGrade() {
        assertArrayEquals(, );
}
}
