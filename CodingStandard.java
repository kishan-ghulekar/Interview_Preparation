/*
1. Class Naming Standard
Rule:
Use PascalCase (Upper Camel Case).
i.Every word starts with a capital letter.
ii.Class names should be nouns because they represent objects or entities.
*/

class Student {
}

class EmployeeDetails {
}

class BankAccount {
}

class CustomerService {
}


/*
2. Interface Naming Standard
Rule:
i.Use PascalCase (Upper Camel Case).
ii.Interface names are usually adjectives or capabilities because they define behavior.
*/
interface Runnable {
}

interface Serializable {
}

interface Comparable {
}

interface Printable {
}




//---------------------------------------
interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}


/*
Java Coding Standards for Methods:
Rules:
1. Use camelCase Naming Convention
2. Method Name Should Start with a Verb
3. Use Meaningful Names
4. Keep Methods Small
5. Use Meaningful Parameter Names
6. Choose the Correct Return Type
7. Follow Proper Indentation
*/

//Example:
class Employee{

	public void calculateSalary(double basicSalary,double bonus){
	
		double totalSalary=basicSalary+bonus;
		System.out.println("Total Salary:"+totalSalary);
	}

	public boolean isEligibleForBonus(double salary){
	
		return salary>50000;
	}


}

class Client{

	public static void main(String[]args){
	
		Employee emp=new Employee();
		emp.calculateSalary(30000,5000);

		System.out.println(emp.isEligibleForBonus(60000));
	}
}
