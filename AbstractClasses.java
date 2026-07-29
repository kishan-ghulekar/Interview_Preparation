/*
Abstract Class in Java

An abstract class in Java is a class that cannot be instantiated (cannot create objects directly). It is declared using the abstract keyword and is mainly used to provide a common blueprint for its subclasses.

An abstract class can contain:

Abstract methods (methods without a body).
Concrete methods (methods with a body).
Constructors, instance variables, and static methods.

Subclasses that extend an abstract class must implement all its abstract methods, unless the subclass is also declared as abstract.

Key Points:
An abstract class cannot be instantiated.
It is declared using the abstract keyword.
It can have both abstract and concrete methods.
It can contain constructors, variables, and static methods.
A subclass must implement all abstract methods unless it is also abstract.
Abstract classes are commonly used to achieve abstraction and code reusability.


When to Use an Abstract Class?

Use an abstract class when:

Multiple related classes share common fields or methods.
You want to provide a common base implementation.
Some methods should be implemented differently by each subclass.


An abstract class can contain:
Abstract methods (methods without a body).
Concrete methods (methods with a body).
Constructors, instance variables, and static methods.


*/

//Example:
abstract class Animal{

	abstract void sound();

	void eat(){
	
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{

	@Override
	void sound(){
	
		System.out.println("Dog is barking");
	}
}
class Main{

	public static void main(String[]args){
	
		Dog d=new Dog();
		d.sound();
		d.eat();
	}
}
