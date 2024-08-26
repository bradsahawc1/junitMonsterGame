import org.junit.Test;
import java.lang.Math;

import static org.junit.Assert.*;

public class KaijuTest {

    Kaiju Kargarok = new Kaiju(2, 4, 100);
    Kaiju Stallord = new Kaiju(4, 4, 200);

    @Test
    public void getX() {
        assertEquals(2, Kargarok.getX());
    }

    @Test
    public void getY() {
        assertEquals(4, Kargarok.getY());
    }

    @Test
    public void getHealth() {
        assertEquals(100, Kargarok.getHealth());
    }

    @Test
    public void setX() {
        Kargarok.setX(4);
        assertEquals(4, Kargarok.getX());
    }

    @Test
    public void setY() {
        Kargarok.setY(6);
        assertEquals(6, Kargarok.getY());
    }

    @Test
    public void areaOfDestruction() {
        assertTrue(Kargarok.areaOfDestruction().pointCollision(2, 4));
    }

    @Test
    public void move() {
        Kargarok.move(2, 2, 2);
        assertEquals(4, Kargarok.getX());
        assertEquals(6, Kargarok.getY());
        Kargarok.move(2, 2, 1);
        assertEquals(6, Kargarok.getX());
        assertEquals(8, Kargarok.getY());
        Kargarok.move(2, 2, 0);
        assertEquals(7, Kargarok.getX());
        assertEquals(9, Kargarok.getY());
    }

    @Test
    public void takeDamage() {
        Kargarok.takeDamage(10);
        assertEquals(90, Kargarok.getHealth());
    }

    @Test
    public void attack() {
        assertEquals(100, Kargarok.getHealth());
    }

    @Test
    public void simulate() {
        Kargarok.simulate(Stallord, 2);
        assertEquals(100, Stallord.getHealth());
        Stallord.move(100, 100, 2);
        Kargarok.simulate(Stallord, 2);
        assertEquals(100, Stallord.getHealth());
    }
}