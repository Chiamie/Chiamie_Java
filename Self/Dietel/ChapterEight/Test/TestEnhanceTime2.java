import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEnhanceTime2 {
    @Test
    public void testThatEnhanceTime2CanSetTheAppropriateSeconds() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        enhanceTime2.setSecond(34);

        assertEquals(34, enhanceTime2.getSecond());
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfSecondsIsBelow0() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setSecond(-32));
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfSecondsIsAbove59() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setSecond(60));
    }

    @Test
    public void testThatEnhanceTime2CanSetTheAppropriateMinutes() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        enhanceTime2.setMinute(34);

        assertEquals(34, enhanceTime2.getMinute());
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfMinutesIsBelow0() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setMinute(-32));
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfMinutesIsAbove59() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setMinute(60));
    }

    @Test
    public void testThatEnhanceTime2CanSetTheAppropriateHours() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        enhanceTime2.setHour(12);

        assertEquals(12, enhanceTime2.getHour());
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfHoursIsBelow0() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setHour(-32));
    }

    @Test
    public void testThatEnhanceTime2RaisesAnExceptionWhenTheValueOfMinutesIsAbove23() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();

        assertThrows(IllegalArgumentException.class, () -> enhanceTime2.setHour(24));
    }

    @Test
    public void testThatEnhanceTime2CanGetTimeIn24TimeFormat() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(12);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(45);

        String expected = "12:32:45";
        assertEquals(expected, enhanceTime2.toUniversalString());
    }
    
    @Test
    public void testThatEnhanceTime2CanGetTimeIn12TimeFormat() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(45);

        String expected = "2:32:45 PM";
        assertEquals(expected, enhanceTime2.toString());
    }
}
