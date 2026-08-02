//frequency of chracters in string

import java.util.*;
class FrequencyOfChar{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();

		boolean[] visited=new boolean[str.length()];
		int count=0;
		for(int i=0;i<str.length();i++){
		
			if(visited[i]){
			
				continue;
			}
			count=1;

			for(int j=i+1;j<str.length();j++){
			
				if(str.charAt(i)==str.charAt(j)){
				
					count++;
					visited[j]=true;
				}
			}
			if(str.charAt(i)!=' '){
			
				System.out.println(str.charAt(i)+":"+count);
			}
		}
	}
}

/*

Sample Output
Input:
Enter a string: programming
Output:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1


1. Read a string from the user.
2. Create a boolean array `visited` to mark counted characters.
3. Traverse the string using the outer loop.
4. If the character is already visited, skip it.
5. Initialize count = 1.
6. Compare the current character with the remaining characters.
7. If a match is found:
   - Increment the count.
   - Mark the matched character as visited.
8. Print the character and its frequency.
*/
