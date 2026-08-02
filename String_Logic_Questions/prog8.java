//wap to remove the occurance of a specifiedd letter character.

import java.util.*;
class OccurenceOfLetter{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter  a String:");
		String str=sc.nextLine();

		System.out.println("Enter a character to remove in a string:");
		char ch=sc.next().charAt(0);

		String result="";
		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)!=ch){
			
				result+=str.charAt(i);
			}
		}
		System.out.println("String after removing "+ch+" : "+result);
		sc.close();
	}
}

/*
---Sample Output---

Input:
Enter a string: programming
Enter the character to remove: g

Output:
String after removing 'g' : prorammin

Explanation:
1. Read the input string.
2. Read the character to be removed.
3. Create an empty string `result`.
4. Traverse the string character by character.
5. If the current character is not equal to the specified character,
   append it to `result`.
6. Print the resulting string.
*/
