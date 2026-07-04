//1. Access Parent Class Variable

class Animal {
    String name = "Animal";

     void sound() {
        System.out.println("Animal makes a sound");
     }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(super.name); // Parent variable
        System.out.println(name);       // Child variable
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

//2. Call Parent Class Method

class Buffalo extends Animal {

    @Override
    void sound() {
        super.sound(); // Calls parent method
        System.out.println("Bufffalo Sounds");
    }

    public static void main(String[] args) {
        Buffalo b = new Buffalo();
        b.sound();
    }
}


//3. Call Parent Class Constructor
//
class  DogsChild extends Animal {

    DogsChild() {
        super(); // Calls Animal constructor
        System.out.println("Dog Child Constructor");
    }

    public static void main(String[] args) {
        DogsChild d = new DogsChild();
    }
}
/*
1.super.variable → Accesses the parent class variable.
2.super.method() → Calls the parent class method.
3.super() → Calls the parent class constructor.
4.super() must be the first statement inside a constructor.
5.You cannot use both this() and super() in the same constructor because both must appear first.
