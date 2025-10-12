import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {
    @Test
    public void testThatRadiusIsSetToPositiveNumbers(){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        assertEquals(5, cylinder.getRadius());
    }

}
