//Overloading Example
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
    }
}


//Method Overriding Example


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

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

/*
 
Method Overloading

Same method name, different parameters.
Same class.
Compile-time polymorphism.
Inheritance is not required.

Method Overriding

Same method name and same parameters.
Parent and child classes.
Runtime polymorphism.
Inheritance is required.
