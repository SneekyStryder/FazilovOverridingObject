public class Rectangle extends Polygon {
    private int length;
    private int width;

    public Rectangle(String name, int sides, int length, int width) {
        // super(name, sides);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + ", length = " + length + ", width = " + width;
    }
}