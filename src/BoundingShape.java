public interface BoundingShape {
    /**
     * This is the interface, BoundingShape which all other Bounding fields branch from.
     *
     * @author Cameron Bradshaw
     * @version 2.0
     */
    public boolean pointCollision(int x, int y);

    public String toString();
}
