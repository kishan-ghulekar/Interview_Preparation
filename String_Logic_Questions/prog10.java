//To find the given strings are anagram or not

import java.util.*;
class FindAnmagram{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String 1:");
		String str1=sc.nextLine();

		System.out.println("Enter String 2:");
		String str2=sc.nextLine();

		if(str1.length() != str2.length()){
		
			System.out.println("The given strings are not an anagram");
		}

		boolean isAnagram=true;

		for(int i=0;i<str1.length();i++){
		
			int count1=0;
			int count2=0;

			for(int j=0;j<str1.length();j++){
			
				if(str1.charAt(i)==str1.charAt(j)){
				
					count1++;
				}
				if(str1.charAt(i)==str2.charAt(j)){
				
					count2++;
				}
			}
			if(count1!=count2){
			
				isAnagram=false;
				break;
			}

		}
		if(isAnagram){
		
			System.out.println("Strings are anagrams.");
		}else{
		
			System.out.println("Strings are not anagrams.");
		}
		sc.close();
	}
}

/*
----Sample Output----

Input:
Enter first string: listen
Enter second string: silent

Output:
Strings are Anagrams.

Explanation:
1. Read two strings from the user.
2. Check if both strings have the same length.
3. For each character in the first string:
   - Count its occurrences in the first string.
   - Count its occurrences in the second string.
4. If the counts differ for any character, the strings are not anagrams.
5. Otherwise, they are anagrams.
*/
