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

### 📝 Key Points
 - Created automatically by the JVM.
 - Executes the `main()` method.
 - First thread of every Java application.
 - Can create multiple child threads.
 - Default thread name is **main**.

 
