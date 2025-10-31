import org.junit.jupiter.api.Test; // For JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals; // For JUnit 5 assertions

public class Midpoint {

    public String substitutions(String test) {
        char[] array = test.toCharArray();
        for(int i = 0; i < array.length/2; i+=2) {
            array[i] = array[array.length-i];
        }
        return new String(array); 
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
