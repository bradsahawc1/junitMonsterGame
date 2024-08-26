public class BoundingBox implements BoundingShape {
    /**
     * This is the class, BoundingBox which tells you whether or not a robot class monster is within range for an attack.
     *
     * @author Cameron Bradshaw
     * @version 2.0
     */

    private int x, y, width, height;

    public BoundingBox(int x, int y, int width, int height) {
        /**
         * @param BoundingBox Class constructor.
         */

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean pointCollision(int px, int py) {
        /**
         * @param pointCollision method that tells you if a monster is in range of an attack.
         */

        if (px >= x && px <= x + width && py >= y && py <= y + height) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        /**
         * @param toString method that returns the variables inside of it.
         */

        return "X: " + this.x + " Y: " + this.y + " W: " + this.width + " H: " + this.height;
    }
}
