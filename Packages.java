/* Example of a User-Defined Package in Java

## Step 1: Create a Package

Create a file named **Student.java** inside the `mypackage` folder.

```java
package mypackage;
*/
public class Student {

    public void display() {
        System.out.println("Welcome to Java Package");
    }
}

/*
---

## Step 2: Use the Package

Create another file named **Main.java**.

```java
*/

import mypackage.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.display();
    }
}

/*

### Output

```text
Welcome to Java Package
```

---

## Project Structure

```text
Project
│
├── mypackage
│   └── Student.java
│
└── Main.java
```

---

## Interview Answer

> **A package is used to organize related classes. In this example, `Student` belongs to the `mypackage` package. We use the `package` keyword to create the package and the `import` keyword to access its classes from another file.**
/*
