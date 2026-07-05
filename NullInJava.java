/*What is null in Java?
Definition:
null in Java is a special literal that represents the absence of an object or reference. 
Itmeans the reference variable is not pointing to any object in memory.*/


class Student{


	String name;
} 
class Client{

	public static void main(String[]args){
	
		Student student=null;
		System.out.println(student);
	}
}

/*
Explanation:
1.student is a reference variable.
2.It is not pointing to any Student object.
3.Therefore, its value is null.
*/


//NullPointerException

class Student1{

	String name="Kishan";
}
class Main{

	public static void main(String[]args){
	
		Student student=null;
		System.out.println(student.name);
	}
}
