/*
ASCII stands for American Standard Code for Information Interchange.

It is a character encoding standard that assigns a unique numeric value (0–127) to letters, digits, symbols, and control characters so computers can store and exchange text.
ASCII is a standard character encoding system that represents characters using numeric values.
Each character, such as a letter, digit, or symbol, has a unique ASCII code.
*/

//Get ASCII value of character
class Main{

	public static void main(String[]args){
	
		char ch='A';
		int ascii=ch;

		System.out.println("ASCII value of "+ch+"="+ascii);
	}
}

//Convert ASCII value to character
class Client{

	public static void main(String[]args){
	
		int ascii=97;
		char ch=(char)ascii;
		System.out.println(ch);
	}
}
