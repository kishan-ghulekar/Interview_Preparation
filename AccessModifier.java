/*
Access Modifiers in java cotrolled the visibility(Accessibility) of the class,method,variables and constructors.
They define who can access the particular member of class.

Java Provides 4 modifiers:
1.public
2.protected
3.default(no modifier)
4.private
*/

//1.public:members can be accessed from anywhere in the program.
class Student{

	public String name="Kishan";
}
class Main{

	public static void main(String[]args){
	
		Student s=new Student();
		System.out.println(s.name);
	}
}

//2.private:members can be accessed only inside the same class.
//cannot access outside the class
//provides data hiding
//Mostly used for instance variables

class Student1{

	private int marks=90;

	public void display(){
	
		System.out.println(marks);
	}
}
class Main1{

	public static void main(String[]args){
	
		Student1 s=new Student1();
		//System.out.println(s.marks);  gives error
		s.display();
	}
}

//3.Default(no modifier):when no access modifier written java uses default access.
class College{

	String college="Sinhgad College";
}

//4.protected:members can be accessed within the same package and outside the package only through the inheritance(Subclass).

class Animal{

		protected void sound(){
		
			System.out.println("Animal makes sound");
		}
}
class Dog extends Animal{

	public void display(){
	
		sound();
	}
}
class Main3{

	public static void main(String[]args){
	
		Dog d=new Dog();
		d.display();
	}
}
