public class Robot extends Monster {
    /**
     * This is the class, Robot which extends Monster and is the parent of all robots.
     *
     * @author Cameron Bradshaw
     * @version 4.0
     */

    private int x, y, power;

    public Robot(int x, int y, int power) {
        /**
         * @param Robot Class constructor which takes parameters from the user.
         */

        this.x = x;
        this.y = y;
        this.power = power;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPower() {
        return power;
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
         * @param areaOfDestruction method that calculates the scale of destruction for any monsters classified as a robot.
         */

        int bx = x - (power / 2);
        int by = y - (power / 2);
        int bw = power;
        int bh = power;
        BoundingBox box = new BoundingBox(bx, by, bw, bh);
        return box;
    }

    @Override
    public void move(int dx, int dy, int terrain_type) {
        /**
         * @param move method that returns the movement of the monster based on the terrain.
         *             Terrain = 0 is the city, Terrain = 1 is the swamp, and Terrain = 2 is the ocean.
         */

        int tempx, tempy;
        if (terrain_type == 0) {
            tempx = dx * 2;
            tempy = dy * 2;
            x += tempx;
            y += tempy;
        }
        else if (terrain_type == 1) {
            tempx = dx / 2;
            tempy = dy / 2;
            this.x += tempx;
            this.y += tempy;
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
        power = power - damage;
        if (power < 2) {
            power = 2;
        }
    }

    @Override
    int attack() {
        /**
         * @param attack method that attacks a monster.
         */
        return power;
    }
}
