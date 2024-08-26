public class Godzilla extends Kaiju {
    /**
     * This is the class, Godzilla which extends Kaiju.
     *
     * @author Cameron Bradshaw
     * @version 4.0
     */

    private int x, y, health, tailLength;

    public Godzilla(int x, int y, int health, int tailLength) {
        /**
         * @param Godzilla This is the class constructor which takes input from user.
         */

        super(x, y, health);
        this.x = x;
        this.y = y;
        this.health = health;
        this.tailLength = tailLength;
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
    public int getHealth() {
        return health;
    }

    public int getTailLength() {
        return tailLength;
    }

    @Override
    public BoundingShape areaOfDestruction() {
        /**
         * @param areaOfDestruction This is the method that calculates the scale of destruction for any Godzilla's.
         */

        int cx = x;
        int cy = y;
        double cr = health + (tailLength / 2);
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
        if ((terrain_type == 0) || (terrain_type == 1)) {
            super.move(dx, dy, terrain_type);
            this.x = super.getX();
            this.y = super.getY();
        }
        else if (terrain_type == 2) {
            this.x += (dx + 4);
            this.y += (dy + 4);
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
