# 🎯 Multithreading - Interview Questions & Answers

### Q1. What is a Process?
A process is an independent, self-contained instance of a program that is currently being executed by the operating system. It has its own memory space, resources, and cannot directly access another process's memory.

---

### Q2. What is a Thread?
A thread is the smallest unit of execution within a process. Multiple threads within the same process share the same memory space and resources, allowing them to run concurrently.

---

> ### 📌 Difference Between Process and Thread

**🖥️ Process**
  - A program in execution.
  - Independent execution unit.
  - Has its own memory and resources.
  - Heavyweight.
  - Slower to create.
  - Can contain one or more threads.

**🧵 Thread**
  - Smallest unit of execution within a process.
  - Lightweight execution unit.
  - Shares memory and resources of the process.
  - Faster to create.
  - Cannot exist without a process.

---

## ❓ What is the Main Thread?
=>
The **Main Thread** is the first thread created automatically by the **JVM** when a Java program starts. It executes the `main()` method and serves as the parent thread for any child threads created during program execution.

````md
---

# ❓ In How Many Ways Can We Create a Thread in Java?

=>

Java provides **2 primary ways** to create a thread.

---

> ### 1️⃣ By Extending the `Thread` Class

- Create a class that extends the `Thread` class.
- Override the `run()` method.
- Call the `start()` method to create a new thread.
- Simple approach but less flexible.
- Cannot extend another class because Java supports only single inheritance.

**Example:**

```java
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

> ### 2️⃣ By Implementing the `Runnable` Interface ✅ (Recommended)

- Create a class that implements the `Runnable` interface.
- Override the `run()` method.
- Pass the object to the `Thread` constructor.
- Call the `start()` method.
- Supports code reusability and multiple inheritance.

**Example:**

```java
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t = new Thread(task);
        t.start();
    }
}
```

---

> ### 📌 Difference Between `Thread` and `Runnable`

| Feature | `Thread` Class | `Runnable` Interface |
|---------|----------------|----------------------|
| Inheritance | Extends `Thread` | Implements `Runnable` |
| Multiple Inheritance | ❌ Not Possible | ✅ Possible |
| Code Reusability | ❌ Less | ✅ High |
| Flexibility | ❌ Low | ✅ High |
| Recommended | ❌ No | ✅ Yes |

---

## 🎯 Interview Answer 

**Q. In how many ways can we create a thread in Java?** **Answer:

** There are **2 primary ways** to create a thread in Java:

1. **By extending the `Thread` class**
2. **By implementing the `Runnable` interface** ✅ *(Recommended)*

`Runnable` is the preferred approach because it supports code reusability, allows a class to extend another class, and provides better separation between the task and the thread.

> **Note:** In modern Java, developers also use **`Callable`** with **`ExecutorService`** for better thread management and tasks that return results.
---
````

```md

---

# ❓ Which is the Best Approach for Creating a Thread in Java?

=>

✅ **Implementing the `Runnable` interface** is the **best and recommended approach** for creating a thread in Java.

### 📌 Why is `Runnable` Recommended?

- Supports **multiple inheritance** (your class can extend another class).
- Provides better **code reusability**.
- Separates the **task** (`Runnable`) from the **thread** (`Thread`).
- Makes the code more flexible and maintainable.
- Commonly used in real-world applications.
- Works well with **Thread Pools**, **ExecutorService**, and Java Concurrency APIs.

### ❌ Why Not Extend the `Thread` Class?

- Java supports only **single inheritance**.
- Your class cannot extend any other class.
- Less flexible and less reusable.
- Mainly used for simple examples or learning purposes.

---

## 🎯 Interview Answer

**Q. Which is the best approach for creating a thread in Java?**

**Answer:**

The **best approach** is to **implement the `Runnable` interface**.

This approach is recommended because it provides better code reusability, supports multiple inheritance, separates the task from the thread, and is widely used in real-world Java applications.

> **Note:** In modern Java, developers often use **`ExecutorService`** with `Runnable` or `Callable` instead of creating threads manually, as it provides better thread management and performance.

---
```


```md
---

# ❓ Explain the Importance of Thread Scheduler in Java

=>

The **Thread Scheduler** is a part of the **JVM (Java Virtual Machine)** that decides **which thread should execute next** when multiple threads are in the **Runnable** state.

Java does **not** control thread scheduling directly. Instead, it relies on the **operating system's scheduler**, so the execution order of threads is **not guaranteed**.

---

> ### 📌 Importance of Thread Scheduler

- Decides **which thread gets CPU time**.
- Manages the execution of **multiple threads**.
- Improves **CPU utilization** by efficiently switching between threads.
- Enables **multitasking** and concurrent execution.
- Handles threads based on their **priority** (higher-priority threads may get preference).
- Ensures that all runnable threads get a chance to execute (depending on the OS scheduling policy).

---

> ### 📌 Key Points

- Every thread competes for CPU time.
- Only **one thread executes at a time per CPU core**.
- The Thread Scheduler decides the execution order.
- The scheduling algorithm depends on the **operating system**, not Java.
- The execution order of threads is **unpredictable**.

---

## 🎯 Interview Answer

**Q. Explain the importance of Thread Scheduler in Java.**

**Answer:**

The **Thread Scheduler** is a JVM component that decides **which thread should run next** when multiple threads are ready for execution. It allocates CPU time to threads, manages multitasking, and improves CPU utilization. Java relies on the operating system's scheduler, so the exact execution order of threads is **not guaranteed**. Although thread priority may influence scheduling, it does **not** guarantee that a higher-priority thread will always execute first.

---
```


### 📝 Key Points
 - Created automatically by the JVM.
 - Executes the `main()` method.
 - First thread of every Java application.
 - Can create multiple child threads.
 - Default thread name is **main**.

 
