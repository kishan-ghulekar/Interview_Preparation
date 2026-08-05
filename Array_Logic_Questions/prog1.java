//write a program to create an array of 5 integers elements 
//and print all 5 elements from an array(take hardcoded values in the array).

class ArrayProg{

	public static void main(String[]args){
	
		int arr[]={1,2,3,4,5};

		for(int i : arr){
		
			System.out.println(i);
		}
	}
}
/*
For-Each Loop in Array – Explanation
int arr[] = {1, 2, 3, 4, 5};
Declares and initializes an integer array with 5 elements.
for (int i : arr)
Uses the for-each loop to traverse the array.
i stores one element of the array during each iteration.
System.out.println(i);
Prints the current element stored in i.
The loop automatically visits every element in the array from the first to the last without using an index.

Time Complexity: O(n)
Space Complexity: O(1)

Output:
1
2
3
4
5
*/
