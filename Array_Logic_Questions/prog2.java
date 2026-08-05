//Write a program to create an array of 5 integer elements.
//Insert from the user and print 5 elements from an array

import java.util.*;
class ArrayProg{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size=sc.nextInt();

		int[] arr=new int[size];

		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++){
		
			arr[i]=sc.nextInt();
		}

		System.out.println("Array Elements are:");
		
		for(int num:arr){
		
			System.out.println(num);
		}
	}
}
/*
Enter array size: 5
Enter 5 elements:
10
20
30
40
50

Array elements are:
10
20
30
40
50


Explanation:
Scanner is used to take input from the user.
The user enters the array size.
An array of that size is created.
A for loop stores each user-entered value into the array using arr[i] = sc.nextInt();.
A for-each loop prints all the array elements.
*/
