class Employee{

	Employee(){
	
		System.out.println("Default Constructor");
	}

	Employee(String name){
	
		this();
		System.out.println("Name:"+name);
	}
	Employee(String name,double salary){
	
		this(name);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[]args){
	
		Employee emp=new Employee("Kishan",50000);
	}
}

/*
 
In Java, you can call one constructor from another constructor of the same class using the this() keyword. This is called constructor chaining.

Important Rules:
this() must be the first statement inside the constructor.
You can only call one constructor using this().
It helps avoid duplicate code.


