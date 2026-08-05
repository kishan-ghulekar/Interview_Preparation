//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and print even numbers from the array.

import java.util.*;
class ArrayProg{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size=sc.nextInt();

		int[] arr=new int[size];

		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		}

		System.out.println("Even elements in an array:");
		for(int i=0;i<size;i++){
		
			if(arr[i]%2==0){
			
				System.out.println(arr[i]);
			}
		}
	}
}
/*
Array Even Numbers Program Explanation:
1.The Scanner class is used to take the array size and elements as input from the user.
2.An integer array of size n is created.
3.A for loop is used to insert the user-entered values into the array.
4.Another for loop traverses the array element by element.
5.An if condition (arr[i] % 2 == 0) checks whether the current element is even.
If the element is even, it is printed.
The program continues until all array elements are checked.


Time Complexity: O(n)
Space Complexity: O(n)


Output (Example):

Enter the size of array:
5
Enter 5 elements:
10
15
20
7
8

Even elements in an array:
10
20
8
*/
