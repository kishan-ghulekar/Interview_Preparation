//Difference Between Interface and Abstract class

//1. Interface
interface Remote {
    void turnOn();
}

class TV implements Remote {

    public void turnOn() {
        System.out.println("TV is ON");
    }
}

class AC implements Remote {

    public void turnOn() {
        System.out.println("AC is ON");
    }
}

/*
1.Defines a contract that classes must follow
2.Can have abstract methods, default methods, static methods, and private methods (Java 8+)
3.Only public static final (constants)
4.❌ No constructors
5.Methods are public by default (abstract methods)
6.A class can implement multiple interfaces
7.To implement an interface we use implements keyword
8.Cannot maintain object state (except constants)
*/


//2. Abstract class
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}

/*
1.Provides a common base with shared implementation
2.Can have both abstract and concrete (implemented) methods
3.Can have instance variables, static variables, final variables, etc.
4.✅ Can have constructors
5.Methods can be public, protected, private, or package-private
6.A class can extend only one abstract class
7.To implement an abstract class we use 'abstract' keyword
8.Can maintain object state using instance variables
*/
