public class WalkingEye extends Robot {
    /**
     * This is the class, WalkingEye which extends Robot.
     *
     * @author Cameron Bradshaw
     * @version 4.0
     */

    private int x, y, power;

    public WalkingEye(int x, int y) {
        /**
         * @param WalkingEye This is the class constructor which takes input from user.
         */

        super(x, y, 10);
        this.x = x;
        this.y = y;
        this.power = 10;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public BoundingShape areaOfDestruction() {
        /**
         * @param areaOfDestruction This is the method that calculates the scale of destruction for any WalkingEyes.
         */

        int side = power + (power / 2);
        int bx = x - ( side / 2);
        int by = y - (side / 2);
        int bw = side;
        int bh = side;
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
        if ((terrain_type == 0) || (terrain_type == 2)) {
            super.move(dx, dy, terrain_type);
            this.x = super.getX();
            this.y = super.getY();
        }
        else if (terrain_type == 1) {
            this.x += dx;
            this.y += dy;
            super.setX(x);
            super.setY(y);
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
