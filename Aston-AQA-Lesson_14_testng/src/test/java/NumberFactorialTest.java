import org.testng.annotations.Test;

public class NumberFactorialTest {
    @Test
    public void positiveFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(4);
        assert result == 24;
    }

    @Test
    public void positiveOneFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(1);
        assert result == 1;
    }

    @Test
    public void positiveZeroFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        int result = util.factorial(0);
        assert result == 1;
    }

    @Test
    public void negativeFactorialTest() {
        NumberFactorial util = new NumberFactorial();
        boolean exceptionThrown = false;
        try {
            int result = util.factorial(-4);
        }
        catch (IllegalArgumentException ex) {
            exceptionThrown = true;
        }
        assert exceptionThrown;
    }
}
