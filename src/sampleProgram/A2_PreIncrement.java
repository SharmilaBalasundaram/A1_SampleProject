package sampleProgram;

public class A2_PreIncrement {
	
	
	public static void main(String[] args) {
		
		int x=0;
		int a=++x; //++x increments x and then returns the value - prefix
		int c=x;
		int b=x++; //x++ returns the value of x and then increments the variable -postfix
		int d=x; // o/p - 2
		// int d=b; op 1
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
	}

}
