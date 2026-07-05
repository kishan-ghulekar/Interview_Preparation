/*I IS-A and HAS-A Relationship in Java

## 1. IS-A Relationship (Inheritance)

### Definition

An **IS-A** relationship represents **inheritance**. It means one class is a specialized version of another class and inherits its properties and behaviors using the `extends` keyword.

**Example:**

* Dog **IS-A** Animal
* Car **IS-A** Vehicle
* Manager **IS-A** Employee

### Java Example

```java*/
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Client {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();   // Inherited method
        dog.bark();
    }
}


/*Output:**


Animal is eating
Dog is barking


---

## 2. HAS-A Relationship (Composition/Aggregation)

### Definition

A **HAS-A** relationship means one class **contains** or **uses** another class as one of its members.

**Example:**

* Car **HAS-A** Engine
* Student **HAS-A** Address
* Employee **HAS-A** Department

### Java Example
*/


class Engine {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is Moving");
    }
}

class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.drive();
    }
}



/*
**Output:**

```
Engine Started
Car is Moving
```


## Difference Between IS-A and HAS-A

| IS-A Relationship                       | HAS-A Relationship                      |
| --------------------------------------- | --------------------------------------- |
| Represents **Inheritance**              | Represents **Composition/Aggregation**  |
| Uses `extends`                          | Uses object creation/reference          |
| Parent-child relationship               | Contains/uses relationship              |
| Example: Dog **IS-A** Animal            | Example: Car **HAS-A** Engine           |
| Promotes code reuse through inheritance | Promotes code reuse through composition |
*/
