package OOPs;

import java.util.Scanner;

public class Complex 
{
//	Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
//	with separate methods for each operation whose real and imaginary parts are entered by user.
//	
	
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	public void diff(int a,int b)
	{
		int difference=a-b;
		System.out.println(difference);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		Complex c1= new Complex();
		System.out.println("Enter the sum values");
		c1.sum(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter the diff values");
		c1.diff(sc.nextInt(),sc.nextInt());
	}

}
