import java.lang.Math;

public class Kaiju extends Monster {
    /**
     * This is the class, Kaiju which extends Monster and is the parent of all kaiju.
     *
     * @author Cameron Bradshaw
     * @version 4.0
     */

    private int x, y, health;

    public Kaiju(int x, int y, int health) {
        /**
         * @param Kaiju Class constructor that takes input from the user.
         */

        this.x = x;
        this.y = y;
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public BoundingShape areaOfDestruction() {
        /**
         * @param areaOfDestruction method that calculates the scale of destruction for any monsters classified as a kaiju.
         */

        int cx = x;
        int cy = y;
        double cr = health;
        BoundingCircle circle = new BoundingCircle(cx, cy, cr);
        return circle;
    }

    @Override
    public void move(int dx, int dy, int terrain_type) {
        /**
         * @param move method that returns the movement of the monster based on the terrain.
         *             Terrain = 0 is the city, Terrain = 1 is the swamp, and Terrain = 2 is the ocean.
         */

        int tempx, tempy;
        if (terrain_type == 0) {
            tempx = dx / 2;
            tempy = dy / 2;
            this.x += tempx;
            this.y += tempy;
        }
        else if (terrain_type == 1) {
            this.x += dx;
            this.y += dy;
        }
        else if (terrain_type == 2) {
            this.x += dx;
            this.y += dy;
        }
        else {
            System.out.println("Invalid option");
        }
    }

    @Override
    void takeDamage(int damage) {
        /**
         * @param takeDamage method that takes the damage received from a monster and subtracts that from the health.
         */
        health = health - damage;
        if (health < 2) {
            health = 2;
        }
    }

    @Override
    int attack() {
        /**
         * @param attack method that attacks a monster.
         */
        return health;
    }
}
