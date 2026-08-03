//Remove duplicate characters from the string
import java.util.*;
class RemoveDuplicate{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a String:");
		String str=sc.nextLine();

		String result="";

		for(int i=0;i<str.length();i++){
		
			char ch=str.charAt(i);
			boolean found=false;

			for(int j=0;j<result.length();j++){
			
				if(ch==result.charAt(j)){
				
					found=true;
					break;
				}
			}
			if(!found){
			
				result+=str.charAt(i);
			}
		}
		System.out.println("String after removing duplicate characters:"+result);
		sc.close();
	}
}

/*
----Sample Output----
Input:
Enter a string: programming

Output:
String after removing duplicates: progamin

Explanation:
1. Read the input string.
2. Create an empty string `result`.
3. Traverse each character of the input string.
4. Check whether the current character already exists in `result`.
5. If it does not exist, append it to `result`.
6. After processing all characters, print `result`.
*/
