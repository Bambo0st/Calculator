import org.example.Main;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private static final double DELTA = 1e-15;
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void testSquareRootValidInputs() {
        assertEquals("Square Root Test 1", 2, calculator.findSqrt(4), DELTA);
        assertEquals("Square Root Test 2", 3, calculator.findSqrt(9), DELTA);
        assertEquals("Square Root Test 3", 4, calculator.findSqrt(16), DELTA);
        assertEquals("Square Root Test 4", 1.4142135623730951, calculator.findSqrt(2), DELTA);
    }

    @Test
    public void testSquareRootInvalidInputs() {
        assertNotEquals("Square Root Test 5", 3, calculator.findSqrt(4), DELTA);
        assertNotEquals("Square Root Test 6", 2, calculator.findSqrt(9), DELTA);
        assertNotEquals("Square Root Test 7", 2, calculator.findSqrt(15), DELTA);
        assertNotEquals("Square Root Test 8", 3, calculator.findSqrt(-9), DELTA);
    }

    @Test
    public void testFactorialValidInputs() {
        assertEquals("Factorial Test 1", 1, calculator.findFact(0), DELTA);
        assertEquals("Factorial Test 2", 1, calculator.findFact(1), DELTA);
        assertEquals("Factorial Test 3", 24, calculator.findFact(4), DELTA);
        assertEquals("Factorial Test 4", 120, calculator.findFact(5), DELTA);
    }

    @Test
    public void testFactorialInvalidInputs() {
        assertNotEquals("Factorial Test 5", 0, calculator.findFact(2), DELTA);
        assertNotEquals("Factorial Test 6", 5, calculator.findFact(3), DELTA);
        assertNotEquals("Factorial Test 7", 20, calculator.findFact(4), DELTA);
        assertNotEquals("Factorial Test 8", 100, calculator.findFact(5), DELTA);
    }

    @Test
    public void testLogarithmValidInputs() {
        assertEquals("Logarithm Test 1", 2.302585092994046, calculator.findLog(10), DELTA);
        assertEquals("Logarithm Test 2", 4.605170185988092, calculator.findLog(100), DELTA);
        assertEquals("Logarithm Test 3", 0, calculator.findLog(1), DELTA);

    }

    @Test
    public void testLogarithmInvalidInputs() {
        assertNotEquals("Logarithm Test 4", 3, calculator.findLog(10), DELTA);
        assertNotEquals("Logarithm Test 5", 4, calculator.findLog(100), DELTA);
        assertNotEquals("Logarithm Test 6", 1, calculator.findLog(1), DELTA);
        assertNotEquals("Logarithm Test 7", 2, calculator.findLog(-100), DELTA);

    }

    @Test
    public void testPowerValidInputs() {
        assertEquals("Power Test 1", 4, calculator.findPow(2, 2), DELTA);
        assertEquals("Power Test 2", 25, calculator.findPow(5, 2), DELTA);
        assertEquals("Power Test 3", 3, calculator.findPow(3, 1), DELTA);
        assertEquals("Power Test 4", 1, calculator.findPow(10, 0), DELTA);
    }

    @Test
    public void testPowerInvalidInputs() {
        assertNotEquals("Power Test 5", 5, calculator.findPow(2, 2), DELTA);
        assertNotEquals("Power Test 6", 100, calculator.findPow(5, 3), DELTA);
        assertNotEquals("Power Test 7", 0, calculator.findPow(3, 1), DELTA);
        assertNotEquals("Power Test 8", 10, calculator.findPow(10, 0), DELTA);
    }
}
