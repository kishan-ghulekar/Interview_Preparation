//Search String in an array
//

import java.util.*;
class SearchString{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);	
		String[] arr={"Kanha","Ashish","Kishan","Kapil","Kunal"};

		System.out.println("Search the String:");
		String str=sc.next();

		boolean found=false;


		for(int i=0;i<=arr.length-1;i++){
		
			if(arr[i].equalsIgnoreCase(str)){
			
				found=true;
				break;
			}
		} 
		if(found){
		
			System.out.println(str+" is found in an array");
		}else{
		
			System.out.println(str+" is not found in an array");
		}
	}
}
