import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCylinder {
    @Test
    public void testThatRadiusIsSetToPositiveNumber(){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        assertEquals(5, cylinder.getRadius());
    }

    @Test
    public void testThatRadiusIsSetToPositiveNumbersThrowsExceptionWithNegativeValues(){
        Cylinder cylinder = new Cylinder();
        assertThrows(IllegalArgumentException.class, () -> cylinder.setRadius(-5));
    }

    @Test
    public void testThatHeightIsSetToPositiveNumber(){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        assertEquals(5, cylinder.getHeight());
    }

    @Test
    public void testThatHeightIsSetToPositiveNumbersThrowsExceptionWithNegativeValues(){
        Cylinder cylinder = new Cylinder();
        assertThrows(IllegalArgumentException.class, () -> cylinder.setHeight(-5));
    }

    @Test
    public void testThatAccurateVolumeOfCylinderIsReturned(){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(5);
        assertEquals(392.75, cylinder.calculateVolume());
    }

}
