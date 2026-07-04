/*
Object:
An object is an instance of a class. 
For example, before constructing a building, an architect creates a blueprint, which is similar to a class.
When the building is actually constructed using that blueprint, it becomes an object.
We can create multiple objects from the same class, and each object has its own data while sharing the same structure and behavior.
*/

class Building {

    int floors;
    String location;

    void display() {
        System.out.println("Floors: " + floors);
        System.out.println("Location: " + location);
    }
}

public class Main {

    public static void main(String[] args) {

        // Objects
        Building b1 = new Building();
        Building b2 = new Building();

        b1.floors = 10;
        b1.location = "Pune";

        b2.floors = 15;
        b2.location = "Mumbai";

        b1.display();
        System.out.println();

        b2.display();
    }
}
