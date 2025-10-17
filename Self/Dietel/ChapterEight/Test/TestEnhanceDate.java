import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEnhanceDate {
    @Test
    public void testThatTheEnhanceDateValidatesDayForASpecificMonth() {
        assertThrows(IllegalArgumentException.class, () -> new EnhanceDate(2024, 4, 31));



    }


}
