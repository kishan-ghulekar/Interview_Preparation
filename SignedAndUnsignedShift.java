//1. >> (Signed Right Shift)
//Positive Nummber
class Main{

	public static void main(String[]args){
	
		int a=16;
		System.out.println(a>>2);
	}
}

/*
Output:
4

Because:
16 = 00010000
16 >> 2

00000100 = 4

1.Shifts bits to the right.
2.Preserves the sign of the number.
3.For a negative number, the leftmost bits are filled with 1.
*/




//2. >>> (Unsigned Right Shift)

class Client {
    public static void main(String[] args) {

        int a = 16;

        System.out.println(a >>> 2);
    }
}
/*
Output
4

For positive numbers, both >> and >>> produce the same result.

1.Shifts bits to the right.
2.Always fills the leftmost bits with 0.
3.Does not preserve the sign.
*/
