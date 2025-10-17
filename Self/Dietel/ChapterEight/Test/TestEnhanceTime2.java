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

    @Test
    public void testThatSecondCanIncrementByOneSecond() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(45);
        enhanceTime2.tick();

        String expected = "2:32:46 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatSecondCanIncrementByOneSecond1() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(59);
        enhanceTime2.tick();

        String expected = "2:33:00 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatSecondCanIncrementByOneSecond2() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(58);
        enhanceTime2.tick();

        String expected = "2:32:59 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatMinuteCanIncrementByOneMinute() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(32);
        enhanceTime2.setSecond(45);
        enhanceTime2.incrementMinute();

        String expected = "2:33:45 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatMinuteSetsToZeroAndHourIncreasesByOneWhenMinuteIs59AndItIsIncrement() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(59);
        enhanceTime2.setSecond(59);
        enhanceTime2.incrementMinute();

        String expected = "3:00:59 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatMinuteCanIncrementByOneWhenTheStoredMinuteIs58() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(58);
        enhanceTime2.setSecond(58);
        enhanceTime2.incrementMinute();

        String expected = "2:59:58 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatHourCanIncrementByOne() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(14);
        enhanceTime2.setMinute(58);
        enhanceTime2.setSecond(58);
        enhanceTime2.incrementHour();

        String expected = "3:58:58 PM";
        assertEquals(expected, enhanceTime2.toString());
    }

    @Test
    public void testThatTimeIncrementsIntoNextDayWhenHourIs24() {
        EnhanceTime2 enhanceTime2 = new EnhanceTime2();
        enhanceTime2.setHour(23);
        enhanceTime2.setMinute(59);
        enhanceTime2.setSecond(59);
        enhanceTime2.incrementTime();


        String expected = "12:00:00 AM";
        assertEquals(expected, enhanceTime2.toString());
    }





}
