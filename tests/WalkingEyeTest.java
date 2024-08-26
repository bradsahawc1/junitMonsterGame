import org.junit.Test;

import static org.junit.Assert.*;

public class WalkingEyeTest {

    WalkingEye Gohma = new WalkingEye(2, 4);
    WalkingEye Tektite = new WalkingEye(14, 14);

    @Test
    public void getX() {
        assertEquals(2, Gohma.getX());
    }

    @Test
    public void getY() {
        assertEquals(4, Gohma.getY());
    }

    @Test
    public void getPower() {
        assertEquals(10, Gohma.getPower());
    }

    @Test
    public void areaOfDestruction() {
        assertFalse(Gohma.areaOfDestruction().pointCollision(-6, -4));
    }

    @Test
    public void move() {
        Gohma.move(2, 2, 2);
        assertEquals(4, Gohma.getX());
        assertEquals(6, Gohma.getY());
        Gohma.move(2, 2, 1);
        assertEquals(6, Gohma.getX());
        assertEquals(8, Gohma.getY());
        Gohma.move(2, 2, 0);
        assertEquals(10, Gohma.getX());
        assertEquals(12, Gohma.getY());
    }

    @Test
    public void takeDamage() {
        Gohma.takeDamage(10);
        assertEquals(2, Gohma.getPower());
    }

    @Test
    public void attack() {
        assertEquals(10, Gohma.getPower());
    }

    @Test
    public void simulate() {
        Gohma.simulate(Tektite, 2);
        assertEquals(10, Tektite.getPower());
        Gohma.simulate(Tektite, 2);
        Gohma.simulate(Tektite, 2);
        assertEquals(2, Tektite.getPower());
    }
}