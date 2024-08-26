import org.junit.Test;

import static org.junit.Assert.*;

public class BoundingCircleTest {
    BoundingCircle circle = new BoundingCircle(2, 4, 6.0);


    @Test
    public void pointCollision() {
        assertEquals(true, circle.pointCollision(2, 3));
    }

    @Test
    public void testToString() {
        assertEquals("X: 2" + " Y: 4" + " R: 6.0", circle.toString());
    }
}