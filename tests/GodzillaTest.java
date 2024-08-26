import org.junit.Test;

import static org.junit.Assert.*;

public class GodzillaTest {

    Godzilla Lizzie = new Godzilla(2, 4, 100, 20);
    Godzilla Ralph = new Godzilla(4, 4, 300, 20);

    @Test
    public void getX() {
        assertEquals(2, Lizzie.getX());
    }

    @Test
    public void getY() {
        assertEquals(4, Lizzie.getY());
    }

    @Test
    public void getHealth() {
        assertEquals(100, Lizzie.getHealth());
    }

    @Test
    public void getTailLength() {
        assertEquals(20, Lizzie.getTailLength());
    }

    @Test
    public void areaOfDestruction() {
        assertFalse(Lizzie.areaOfDestruction().pointCollision(200, 200));
    }

    @Test
    public void move() {
        Lizzie.move(2, 2, 2);
        assertEquals(8, Lizzie.getX());
        assertEquals(10, Lizzie.getY());
        Lizzie.move(2, 2, 1);
        assertEquals(10, Lizzie.getX());
        assertEquals(12, Lizzie.getY());
        Lizzie.move(2, 2, 0);
        assertEquals(11, Lizzie.getX());
        assertEquals(13, Lizzie.getY());
    }

    @Test
    public void takeDamage() {
        Lizzie.takeDamage(10);
        assertEquals(90, Lizzie.getHealth());
    }

    @Test
    public void attack() {
        assertEquals(100, Lizzie.getHealth());
    }

    @Test
    public void simulate() {
        Lizzie.simulate(Ralph, 2);
        assertEquals(200, Ralph.getHealth());
        Ralph.move(50, 50, 1);
        Lizzie.simulate(Ralph, 2);
        assertEquals(100, Ralph.getHealth());
        Ralph.move(70, 70, 1);
        Lizzie.simulate(Ralph, 2);
        assertEquals(100, Ralph.getHealth());
    }
}