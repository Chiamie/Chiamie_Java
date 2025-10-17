import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void testThatDayCanIncrementByOne() {
        EnhanceDate enhanceDate = new EnhanceDate(2025, 10, 17);
        enhanceDate.nextDay();
        String expected = "10/18/2025";
        assertEquals(expected, enhanceDate.toString());
    }

    @Test
    public void testMethodNextDayInALoop() {
        EnhanceDate enhanceDate = new EnhanceDate(2025, 10, 22);
        String[] expected = {"10/23/2025", "10/24/2025",
        "10/25/2025", "10/26/2025", "10/27/2025", "10/28/2025",
                "10/29/2025", "10/30/2025", "10/31/2025", "11/1/2025", "11/2/2025"};
        for (int day = 0; day <= 10; day++) {
            enhanceDate.nextDay();
            assertEquals(expected[day], enhanceDate.toString());
        }
    }

    @Test
    public void testThatEnhanceDateCanIncrementIntoTheNextYear() {
        EnhanceDate enhanceDate = new EnhanceDate(2025, 12, 31);
        enhanceDate.nextDay();
        String expected = "1/1/2026";
        assertEquals(expected, enhanceDate.toString());

    }

    @Test
    public void testThatMonthTwoHas29DaysInALeapYear() {
        EnhanceDate enhanceDate = new EnhanceDate(2024, 2, 28);
        enhanceDate.nextDay();
        String expected = "2/29/2024";
        assertEquals(expected, enhanceDate.toString());
    }

    @Test
    public void testThatEnhanceDateCanIncrementIntoTheNextMonthForMonthTwoInALeapYear() {
        EnhanceDate enhanceDate = new EnhanceDate(2024, 2, 29);
        enhanceDate.nextDay();
        String expected = "3/1/2024";
        assertEquals(expected, enhanceDate.toString());

    }
}
