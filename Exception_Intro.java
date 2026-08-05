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

10.Explain throw keyword in java? 
=>Generally JVM throws the exception and we handle the exceptions by using try catch block. But there are
  situations where we have to throw userdefined exceptions or runtime exceptions. In such case we use
  throw keyword to throw exception explicitly. 
  Syntax : throw throwableInstance; 
  Throwable instance must be of type throwable or any of its subclasses. 
  After the throw statement execution stops and subsequent statements are not executed. Once exception
  object is thrown JVM checks is there any catch block to handle the exception. If not then the next catch
  statement till it finds the appropriate handler. If appropriate handler is not found ,then default exception
  handler halts the program and prints the description and location of exception. 
  In general we use throw keyword for throwing userdefined or customized exception. 

11. Can we write any code after throw statement? 
=>After throw statement jvm stop execution and subsequent statements are not executed. If we try to write
  any statement after throw we do get compile time error saying unreachable code.

12. Explain importance of throws keyword in java? 
=>Throws statement is used at the end of method signature to indicate that an exception of a given type
  may be thrown from the method. 
  The main purpose of throws keyword is to delegate responsibility of exception handling to the caller
  methods, in the case of checked exception. 
  In the case of unchecked exceptions, it is not required to use throws keyword. 
  We can use throws keyword only for throwable types otherwise compile time error saying incompatible
  types. 
  An error is unchecked , it is not required to handle by try catch or by throws. 
  Syntax : Class Test{ 
  Public static void main(String args[]) throws IE 
  {   
  }  
  } 
  Note : The method should throw only checked exceptions and subclasses of checked exceptions. 
  It is not recommended to specify exception superclasses in the throws class when the actual exceptions
  thrown in the method are instances of their subclass.

13) Explain the importance of finally over return statement? 
=>finally block is more important than return statement when both are present in a program. For example if
  there is any return statement present inside try or catch block , and finally block is also present first
  finally statement will be executed and then return statement will be considered.

14) Explain a situation where finally block will not be executed? 
=>Finally block will not be executed whenever jvm shutdowns. If we use system.exit(0) in try statement
  finally block if present will not be executed.

15) Can we use catch statement for checked exceptions? 
=>If there is no chance of raising an exception in our code then we can’t declare catch block for handling
  checked exceptions .This raises compile time error if we try to handle checked exceptions when there is
  no possibility of causing exception. 

16) What are user defined exceptions? 
=>To create customized error messages we use userdefined exceptions. We can create user defined
  exceptions as checked or unchecked exceptions. 
  We can create user defined exceptions that extend Exception class or subclasses of checked exceptions so
  that userdefined exception becomes checked. 
  Userdefined exceptions can extend RuntimeException to create userdefined unchecked exceptions. 
  Note : It is recommended to keep our customized exception class as unchecked,i.e we need to extend
  Runtime Exception class but not Excpetion class.

17 .Can we rethrow the same exception from  catch handler? 
=>Yes we can rethrow the same exception from our catch handler. If we want to rethrow checked exception
  from a catch block we need to declare that exception.

18) Can we nested try statements in java? 
=>Yes try statements can be nested. We can declare try statements inside the block of another try
  statement.

19) Explain the importance of throwable class and its methods? 
=>Throwable class is the root class for Exceptions.  All exceptions are derived from this throwable class. The
  two main subclasses of Throwable are Exception and Error. The three methods defined in throwable class
  are : 
  1) void printStackTrace() : 
  This prints the exception information in the following format : 
  Name of the exception, description followed by stack trace. 
  2) getMessage() 
  This method prints only the description of Exception. 
  3) toString(): 
  It prints the name and description of Exception.

20) Explain when ClassNotFoundException will be raised ? 
=>When JVM tries to load a class by its string name, and couldn’t able to find the class
  classNotFoundException will be thrown. An example for this exception is when class name is misspelled
  and when we try to load the class by string name hence class cannot be found which raises
  ClassNotFoundException.

21) Explain when NoClassDefFoundError will be raised ? 
=>This error is thrown when JVM tries to load the class but no definition for that class is found
  NoClassDefFoundError will occur. The class may exist at compile time but unable to find at runtime. This
  might be due to misspelled classname at command line, or classpath is not specified properly , or the
  class file with byte code is no longer available.

	 
	  
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

