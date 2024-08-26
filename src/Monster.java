public abstract class Monster {
    /**
     * This is the abstract class, Monster which all other monsters branch from.
     *
     * @author Cameron Bradshaw
     * @version 4.0
     */

    private int x, y;

    protected Monster() {
        /**
         * @param Monster Class constructor.
         */

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract BoundingShape areaOfDestruction();

    public abstract void move(int dx, int dy, int terrain_type);

    abstract void takeDamage(int damage);

    abstract int attack();

    public void simulate(Monster other, int terrain) {
        /**
         * @param simulate is a method which simulates one move for a monster.
         */

        if (areaOfDestruction().pointCollision(other.getX(), other.getY())) {
            other.takeDamage(this.attack());
        }
        if (this.getX() < other.getX()) {
            this.move(2, 0, terrain);
        }
        else if (this.getX() > other.getX()) {
            this.move(-2, 0, terrain);
        }
        if (this.getY() < other.getY()) {
            this.move(0, 2, terrain);
        }
        else if (this.getY() > other.getY()) {
            this.move(0, -2, terrain);
        }
    };
}