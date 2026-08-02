//Concatenate strings without using library

import java.util.*;
class ConcatenateStrings{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first String:");
		String str1=sc.nextLine();

		System.out.println("Enter second String:");
		String str2=sc.nextLine();

		char[] result=new char[str1.length() + str2.length()];

		int k=0;

		for(int i=0;i<str1.length();i++){
		
			result[k]=str1.charAt(i);
			k++;
		}
		for(int j=0;j<str2.length();j++){
		
			result[k]=str2.charAt(j);
			k++;
		}

		System.out.println("Concatenated String:");
		for(int i=0;i<result.length;i++){
		
			System.out.print(result[i]);
		}
		sc.close();
	}
}
