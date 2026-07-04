class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}
/*Method Overriding occurs when a child class provides its own implementation of a method that is already defined in the parent class.
 *
 
Rules for Method Overriding:
The parent and child methods must have the same method name.
They must have the same parameters.
The return type must be the same (or covariant).
The child class method cannot have a more restrictive access modifier than the parent method.
static, final, and private methods cannot be overridden.
