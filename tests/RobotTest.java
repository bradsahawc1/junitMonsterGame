import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    Robot Roboco = new Robot(2, 4, 100);
    Robot R2D2 = new Robot(4, 4, 100);

    @Test
    public void getX() {
        assertEquals(2, Roboco.getX());
    }

    @Test
    public void getY() {
        assertEquals(4, Roboco.getY());
    }

    @Test
    public void getPower() {
        assertEquals(100, Roboco.getPower());
    }

    @Test
    public void setX() {
        Roboco.setX(4);
        assertEquals(4, Roboco.getX());
    }

    @Test
    public void setY() {
        Roboco.setY(6);
        assertEquals(6, Roboco.getY());
    }

    @Test
    public void areaOfDestruction() {
        assertTrue(Roboco.areaOfDestruction().pointCollision(-48, -46));
    }

    @Test
    public void move() {
        Roboco.move(2, 2, 2);
        assertEquals(4, Roboco.getX());
        assertEquals(6, Roboco.getY());
        Roboco.move(2, 2, 1);
        assertEquals(5, Roboco.getX());
        assertEquals(7, Roboco.getY());
        Roboco.move(2, 2, 0);
        assertEquals(9, Roboco.getX());
        assertEquals(11, Roboco.getY());
    }

    @Test
    public void takeDamage() {
        Roboco.takeDamage(10);
        assertEquals(90, Roboco.getPower());
    }

    @Test
    public void attack() {
        assertEquals(100, Roboco.getPower());
    }

    @Test
    public void simulate() {
        Roboco.simulate(R2D2, 2);
        assertEquals(2, R2D2.getPower());
        Roboco.move(100, 100, 2);
        R2D2.simulate(Roboco, 2);
        assertEquals(100, Roboco.getPower());
    }
}