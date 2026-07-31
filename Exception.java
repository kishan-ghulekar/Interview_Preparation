/*
Interview Answer:
An exception in Java is an unexpected event that occurs during program execution and disrupts the normal flow of the program.
Java handles exceptions using try, catch, finally, throw, and throws. 
Exceptions are mainly of two types: checked exceptions, which are checked at compile time and must be handled, and unchecked exceptions, which occur at runtime.
Exception handling improves the reliability of a program by allowing it to recover from errors instead of terminating unexpectedly.


Key Points:
An exception is an event that interrupts the normal execution of a program.
Exception handling prevents the program from crashing unexpectedly.
try is used to write risky code.
catch handles exceptions.
finally always executes (except in rare cases such as JVM termination).
throw is used to manually throw an exception.
throws is used to declare exceptions in a method signature.

Questions Of Exception :

1.In how many ways we can do exception handling in java?
 =>We can handle exception in either of the two ways:
   1.By specifying the try catch where we can catch the exception
   2.Declaring a method with throws clause.

2.List out five keywords related to Exception Handling?
 =>1.try
   2.catch
   3.throw
   4.throws
   5.finally

3.What is error in Java?
 =>Error is a subclass of Throwable class in java. When errors are caused by our program we call that as Execption, but sometimes exceptions are caused due    to environment issues such as running out of memory. 
   In such cases we can't handle the exceptions.Exception which cannot be recovered are called as error in java. 

4.Can we have try block without catch block?
=>Each try block requires atleast one catch block or finally block. A try block without catch or finally will result in compiler error.
  We can skip either of catch or finally block but not both.
 
5.Can we catch more than one exception in single catch block? 
=> From Java 7, we can catch more than one exception with single catch block. This type of handling reduces
  the code duplication. 
  Note : When we catch more than one exception in single catch block , catch parameter is implicity final.
  We cannot assign any value to catch parameter. 
  Ex : catch(ArrayIndexOutOfBoundsException || ArithmeticException e) 
  {
  }
  In the above example e is final we cannot assign any value or modify e in catch statement.

6.Explain importance of finally block in java? 
=>Finally block is used for cleaning up of resources such as closing connections, sockets etc. if try block
  executes with no exceptions then finally is called after try block without executing catch block. If there is
  exception thrown in try block finally block executes immediately after catch block. 
  If an exception is thrown,finally block will be executed even if the no catch block handles the exception.

7.Can we have any code between try and catch blocks? 
=>We shouldn’t declare any code between try and catch block. Catch block should immediately start after try
  block. 
  try{ 
  //code 
  } 
  System.out.println(“one line of code”); // illegal 
  catch(Exception e){ 
  // 
  }

8. Can we have any code between try and finally blocks? 
=>We shouldn’t declare any code between try and finally block. finally block should immediately start after
  catch block.If there is no catch block it should immediately start after try block. 
  try{ 
  //code 
  } 
  System.out.println(“one line of code”); // illegal 
  finally{ 
  // 
  }
9.Can we catch more than one exception in single catch block? 
=>From Java 7, we can catch more than one exception with single catch block. This type of handling reduces
  the code duplication. 
  Note : When we catch more than one exception in single catch block , catch parameter is implicity final.
  We cannot assign any value to catch parameter. 
  Ex : catch(ArrayIndexOutOfBoundsException || ArithmeticException e) 
  {
  }
  In the above example e is final we cannot assign any value or modify e in catch statement.

10.
 

	 
	  
Key Points:
An exception is an event that interrupts the normal execution of a program.
Exception handling prevents the program from crashing unexpectedly.
try is used to write risky code.
catch handles exceptions.
finally always executes (except in rare cases such as JVM termination).
throw is used to manually throw an exception.
throws is used to declare exceptions in a method signature.

*/

/*
Types of Exceptions
1. Checked Exception (Compile-Time Exception)
Definition

These exceptions are checked by the compiler. The programmer must handle them using try-catch or throws.

Examples
IOException
SQLException
FileNotFoundException
ClassNotFoundException*/

//Example:
import java.io.*;
class Demo{

	public static void main(String[]args){
	
		try{
		
			FileReader file=new FileReader("abc.txt");

		}catch(FileNotFoundException e){
		
			System.out.println(e);
		}
	}
}


/*
2. Unchecked Exception (Runtime Exception)
Definition:These exceptions occur during program execution and are not checked by the compiler. They usually occur due to programming mistakes.

Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException

*/
//Example:
class Main{

	public static void main(String[]args){
	
		try{
		
			int result=10/0;
			System.out.println(result);
		}catch(ArithmeticException e){
		
				System.out.println("Cannot divide by zero");
		}
		System.out.println("Program Continues....");
	}
}

