public class BoundingCircle implements BoundingShape {
    /**
     * This is the class, BoundingCircle which tells you whether or not a kaiju class monster is within range for an attack.
     *
     * @author Cameron Bradshaw
     * @version 2.0
     */

    private int x, y;
    private double radius;

    public BoundingCircle(int x, int y, double radius) {
        /**
         * @param BoundingCircle Class constructor.
         */

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean pointCollision(int px, int py) {
        /**
         * @param pointCollision method that tells you if a monster is in range of an attack.
         */

        if (radius >= Math.sqrt((x - px) * (x - px) + (y - py) * (y - py))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        /**
         * @param toString method that returns the variables inside of it.
         */

        return "X: " + this.x + " Y: " + this.y + " R: " + this.radius;
    }
}
