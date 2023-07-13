package OOPs;

public class Rectangle 
{
//	Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
//	respectively by creating a class named 'Rectangle' with a method named 'Area' which 
//	returns the area and length and breadth passed as parameters to its constructor.

	private int length;
	private int breadth;
	

	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	

	public int Area()
	{
		int Area = length*breadth;
		System.out.println("Area of rectangle :"+Area);
		
		return Area;
	}
	public static void main(String[] args) 
	{
	
	Rectangle r1 = new Rectangle(4,5);
	r1.Area();
	Rectangle r2 = new Rectangle(5,8);
	r2.Area();
		
	}

}
