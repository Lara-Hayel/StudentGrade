
package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lara-Hayel
 */
public class StudentGradeTest {
    
    private int mark;
    private String expectedResult, actualResult;
    
    public StudentGradeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting The Test Class \n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finishing The Test Class \n");
    }
    
    @Before
    public void setUp() {
        System.out.print("Start Test Case: Mark = ");
    }
    
    @After
    public void tearDown() {
        System.out.println("End Test Case \n");
    }

    /**
     * Test of getGrade method, of class StudentGrade.
     */
    @Test
    public void testGetGrade95() {
       System.out.println("95");
       mark = 95;
       expectedResult = "A";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade85() {
       System.out.println("85");
       mark = 85;
       expectedResult = "B";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade75() {
       System.out.println("75");
       mark = 75;
       expectedResult = "F";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
}
