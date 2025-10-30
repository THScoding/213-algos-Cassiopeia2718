import org.junit.jupiter.api.Test; // For JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals; // For JUnit 5 assertions

public class Midpoint {

    public String substitutions(String test) {
        String output = "";
        /*
         * Put code for your solution here
         * 
         * To check your solution: Run Tests
         *   (After following the steps to Enable Tests shown in the short video here:
         *      https://code.visualstudio.com/docs/java/java-testing#_enable-testing-and-adding-test-framework-jars-to-your-project
         *.   )
         */
        return output; 
    }

    @Test
    public void test_1() {
        String test = "hello";
        String expectedResult = "oello";
        assertEquals(expectedResult, this.substitutions(test));
    }

    @Test
    public void test_2() {
        String test = "inclusion";
        String expectedResult = "nnilusion";
        assertEquals(expectedResult, this.substitutions(test));
    }

    @Test
    public void test_3() {
        String test = "practice kindness";
        String expectedResult = "srecdiie kindness";
        assertEquals(expectedResult, this.substitutions(test));
    }

    @Test
    public void test_4() {
        String test = "be curious";
        String expectedResult = "seocrrious";
        assertEquals(expectedResult, this.substitutions(test));
    }
        
}
