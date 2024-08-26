import org.junit.Test;

import static org.junit.Assert.*;

public class BoundingBoxTest {

    BoundingBox box = new BoundingBox(2, 3, 1, 1);

    @Test
    public void pointCollision() {
        assertEquals(true, box.pointCollision(2, 3));
    }

    @Test
    public void testToString() {
        assertEquals("X: 2" + " Y: 3" + " W: 1" + " H: 1", box.toString());
    }
}