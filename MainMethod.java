/*
# Why is `main()` Method Declared as `public static void main(String[] args)` in Java?

public static void main(String[] args) {
    System.out.println("Hello Java");
}
```

The `main()` method is the **entry point** of every Java application. Each keyword has a specific purpose.

### 1. `public`

* The JVM must be able to access the `main()` method from outside the class.
* If `main()` is not `public`, the JVM cannot invoke it.
---

### 2. `static`

* The JVM calls the `main()` method **without creating an object** of the class.
* Declaring it `static` allows it to be called directly using the class name.

---

### 3. `void`

* The `main()` method does not return any value to the JVM.

---

### 4. `main`

* `main` is the predefined method name that the JVM looks for to start program execution.
* If the method name is changed, the program will compile but the JVM will not execute it as the entry point.
---

### 5. `String[] args`

* It is used to receive **command-line arguments** passed while running the program.

Example:
*/

class Test {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}

