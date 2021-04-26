import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        assertTrue(result == 20);
    }

    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(30, 10);
        assertTrue(result == 20);
    }

    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.multiply(2, 3) == 6);
    }

    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.divide(25, 5) == 5);
    }
}