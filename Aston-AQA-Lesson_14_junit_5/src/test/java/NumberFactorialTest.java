import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberFactorialTest {
    @Test
    public void positiveFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void positiveOneFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(1);
        assertEquals(1, result);
    }

    @Test
    public void positiveZeroFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void negativeFactorialTest() throws IllegalArgumentException {
        NumberFactorial util = new NumberFactorial();
        boolean exceptionThrown = false;
        try {
            int result = util.factorial(-5);
        }
        catch (IllegalArgumentException ex) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }
}
