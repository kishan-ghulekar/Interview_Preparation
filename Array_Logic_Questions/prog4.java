//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and find the max number from the array

import java.util.*;
class ArrayProg{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size=sc.nextInt();

		int[] arr=new int[size];

		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max=arr[i];
			}
		}
		System.out.println("Max number of in an array:");
		System.out.println(max);
	}
}

/*
Maximum Element in Array – Explanation:
1.The Scanner class is used to take the array size and elements as input from the user.
2.An integer array of size n is created.
3.A for loop is used to insert the user-entered values into the array.
4.The first element of the array is assumed to be the maximum (max = arr[0]).
5.Another for loop traverses the entire array.
6.An if condition (arr[i] > max) compares the current element with the current maximum.
7.If the current element is greater than max, the value of max is updated.
8.After checking all elements, the maximum element in the array is printed.


Time Complexity: O(n)
Space Complexity: O(n)


Output (Example):
Enter the size of array:
5
Enter 5 elements:
12
45
8
67
23

Max number in an array:
67
*/
