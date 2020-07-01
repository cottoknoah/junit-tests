import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() {
        student = new Student("Knoah", 787);
    }

    @Test
    public void testId() {
        assertEquals(787, student.getId());
    }

    @Test
    public void testName() {
        assertEquals("Knoah", student.getName());
    }

    @Test
    public void testGradeMethods() {
        student.addGrade(70);
        student.addGrade(30);
        assertEquals(100, student.getGradeAverage(), 0.5);
    }
}