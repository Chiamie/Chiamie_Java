import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEnhanceDate {
    @Test
    public void testThatTheEnhanceDateValidatesDayForASpecificMonth() {
        assertThrows(IllegalArgumentException.class, () -> new EnhanceDate(2024, 4, 31));
    }

    @Test
    public void testThatTheEnhanceDateValidatesDayForASpecificYearAndMonth() {
        assertThrows(IllegalArgumentException.class, () -> new EnhanceDate(2023, 2, 29));
    }

    @Test
    public void testThatTheEnhanceDateValidatesOnlyYearWith4Digits() {
        assertThrows(IllegalArgumentException.class, () -> new EnhanceDate(20235, 2, 28));
    }

}
