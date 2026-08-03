//Sort the strings by the length
import java.util.*;
class SortStringsByLength{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		String str[]={"Java","C","Python","Flutter","ML"};

		for(int i=0;i<str.length-1;i++){
		
			for(int j=0;j<str.length-i-1;j++){
			
				if(str[j].length() >str[j+1].length()){
				
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;

				}
			}
		}
		System.out.println("Strings after sorted:");
		for(int i=0;i<str.length;i++){
		
			System.out.println(str[i]);
		}
	}
}
