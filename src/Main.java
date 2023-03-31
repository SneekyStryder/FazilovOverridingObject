public class Main {
    public static void main(String[] args) {
        // TASK 1:
            // Run the code below once; what prints and why?
            Polygon hex = new Polygon("hexagon", 6);
            System.out.println(hex);
            Rectangle rect = new Rectangle("rectangle", 4, 10, 20);
            System.out.println(rect);

        // TASK 2:
        // add the public String toString() method to Polygon, then OVERRIDE it in
        // the Rectangle subclass so that the two objects above print as follows:
        //
        //      hexagon: sides = 6
        //      rectangle: sides = 4, length = 10, width = 20
        //
        // DO NOT ADD GETTER METHODS -- figure out a way to do this with no getter methods!
        // (hint: super...)

        //-----------------------------------------------------------------------------
        // TASK 3: EXPLORE!
        // Delete or comment out the call to super() in the constructor of the Rectangle subclass,
        // then rerun the code above; what happens, and what do you think is going on?

        // TASK 4: EXPLORE!
        // now try deleting or commenting out the no-parameter constructor in Polygon and rerunning.
        // what happens and what do you think the problem is?

    }
}
