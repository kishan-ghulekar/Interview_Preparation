// Reverse only words in a String

import java.util.*;
class ReverseCharacters{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String:");
		String str=sc.nextLine();

		int start=0;

		for(int i=0;i<=str.length();i++){
		
			if(i==str.length() || str.charAt(i)==' '){
			
						
				for(int j=i-1;j>=start;j--){
			
					System.out.print(str.charAt(j));
				}
			System.out.print(" ");
			start=i+1;
			}
		}
		sc.close();
	}
}
/*
Enter String: Java is easy
Output:
avaJ si ysae
*/
