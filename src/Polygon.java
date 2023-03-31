public class Polygon {
    private String name;
    private int sides;

    // no parameter constructor
    public Polygon() {
        name = "TBD";
        sides = 0;
    }

    public Polygon(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }


    public String toString() {
        return name + ": sides = " + sides;
    }
}
