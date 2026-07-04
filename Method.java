/*
A method is a block of code that performs a specific task.
It represents the behavior of an object and helps improve code reusability by allowing the same code to be called multiple times. 
For example, in a Building Management System, methods like openGate(), closeGate(), and startLift() define the actions that a building can perform.

Method Coding Standards in Java
1. Use camelCase for Method Names
2. Method Name Should Be Meaningful
3. Method Name Should Start with a Verb
4. Keep Methods Small
5. Choose Appropriate Return Types
6. Use Meaningful Parameter Names
7. Avoid Long Parameter Lists
*/

class Building {

    //Method
    void openGate() {
        System.out.println("Gate Opened");
    }

    //Method
    void closeGate() {
        System.out.println("Gate Closed");
    }
}

public class Main {

    public static void main(String[] args) {

        Building b1 = new Building();

        b1.openGate();
        b1.closeGate();
    }
}
