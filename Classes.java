/*class in java
A class is a blueprint or template for creating objects.
For example, before constructing a building, an architect first creates a blueprint that defines the number of floors, rooms, parking, and other details.
This blueprint is similar to a class in Java.
Using that blueprint, multiple buildings can be constructed, and each constructed building is an object of that class.
*/

class Building {

    int floors;
    int rooms;

    void openGate() {
        System.out.println("Gate Opened");
    }
}

public class Main {

    public static void main(String[] args) {

        Building b1 = new Building(); // First building
        Building b2 = new Building(); // Second building

        b1.floors = 10;
        b1.rooms = 100;

        b2.floors = 15;
        b2.rooms = 150;

        b1.openGate();
        b2.openGate();
    }
}
