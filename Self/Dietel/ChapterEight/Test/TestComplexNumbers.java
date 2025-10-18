import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestComplexNumbers {
    @Test
    public void testComplexNumbers() {
        ComplexNumber expression1 = new ComplexNumber(3, 4);
        ComplexNumber expression2 = new ComplexNumber(2, 5);
        ComplexNumber expected = new ComplexNumber(5, 9);
        assertEquals(expected, expression1.addComplexNumbers(expression2));
    }

    @Test
    public void testThatTwoComplexNumbersCanBeSubtracted() {
        ComplexNumber expression1 = new ComplexNumber(3, 4);
        ComplexNumber expression2 = new ComplexNumber(2, 5);
        ComplexNumber expected = new ComplexNumber(1, -1);
        assertEquals(expected, ComplexNumber.subtractComplexNumbers(expression1, expression2));
    }
}
