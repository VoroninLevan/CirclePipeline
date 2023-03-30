import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeCalculatorUtilTest {

    @Test
    @DisplayName("Testing addition functionality")
    void additionTest(){
        double a = 1.0;
        double b = 1.0;
        double expected = 2.0;

        assertEquals(expected, FakeCalculatorUtil.addition(a, b));
    }

    @Test
    @DisplayName("Testing subtraction functionality")
    void subtractionTest(){
        double a = 1.0;
        double b = 1.0;
        double expected = 0.0;

        assertEquals(expected, FakeCalculatorUtil.subtraction(a, b));
    }
}
