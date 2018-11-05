public class SwapTheNumber{
	public static void main(String[] args){
		int a = 10; //variable a initialized with value 10
		int b = 20; //variable b initialized with value 20
		
		System.out.println("Before swapping");
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		
		//now swap number without using +,-,\,*,% and third varible
		a = a ^ b; // a XOR b,10 ^ 20 = 30
		b = a ^ b; // a XOR b,30 ^ 20 = 10
		a = a ^ b; // a XOR b,20 ^ 10 = 20
		
		System.out.println("After swapping by XOR operation");
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
	}
}