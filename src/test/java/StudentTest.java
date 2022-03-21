import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class StudentTest {
    private Student student = new Student(123345, "Scott");
    @Test
    public void testGetId () {
        assertEquals("should test the id", 123345, student.getId());
    }

}
