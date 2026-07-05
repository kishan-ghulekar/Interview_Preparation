
/*The instanceof operator is used to check whether an object is an instance of a particular class, subclass, or interface. It returns a boolean value (true or false).

Syntax
object instanceof ClassName
Returns true if the object belongs to the specified class, its subclass, or implements the specified interface.
Returns false otherwise.
*/


class Employee{

}
class Manager extends Employee{

}

class Main{

	public static void main(String[]args){
	
		Employee employee =new Manager();

		if(employee instanceof Manager){
		
			System.out.println("Employee is a Manager");
		}else{
		
			System.out.println("Employee is not a manager");
		}
	}
}
