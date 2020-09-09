import java.io.*; 

class javatest {
	public static void main(String[] args) {
		//let us declare our vars
		int x = 3, y = 3, sum; 
		
		System.out.println("the first number is: " + x ); 
		
		System.out.println("the second number is: " + y ); 
		
		//ternary op
		sum = (x > y) ? (x + y) : (x + y); 
		
		System.out.println("the sum of the two numbers is " + sum); 
	}
}