package SumCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWith1() {
        int result = calculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    public void testSumWith3() {
        int result = calculator.sum(3);
        assertEquals(6, result);
    }

    @Test
    public void testSumWith0() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.sum(0));
    }
}