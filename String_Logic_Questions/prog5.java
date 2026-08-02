//Capitalize the first letter of the each word present in the String

import java.util.*;
class CapitalizeWords{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a String:");
		String str=sc.nextLine();

		boolean capitalize=true;

		for(int i=0;i<str.length();i++){
		
			char ch=str.charAt(i);

			if(capitalize && ch>='a' && ch<='z'){
			
				ch=(char)(ch-32);
			}
			System.out.print(ch);

			if(ch == ' '){
			
				capitalize=true;
			}else{
			
				capitalize=false;
			}
		}
		sc.close();
	}
}
/*
----Sample Output----
Input:
Enter a string: java is easy
Output:
Java Is Easy

1. Read the input string.
2. Use a boolean variable `capitalize` and initialize it to true.
3. Traverse the string character by character.
4. If `capitalize` is true and the character is a lowercase letter:
   - Convert it to uppercase by subtracting 32 from its ASCII value.
5. Print the character.
6. If the current character is a space, set `capitalize` to true.
   Otherwise, set it to false.
7. Continue until the end of the string.
*/
