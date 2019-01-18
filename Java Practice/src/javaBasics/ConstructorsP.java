package javaBasics;

public class ConstructorsP {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		System.out.println(p.x);
		System.out.println(p.y);
		
		
		
		
		Point p1 = new Point(22,34);
		
		System.out.println(p1.x);
		System.out.println(p1.y);
		
			
		
	}

}

class Point {
	
	
	Point()
	{
		System.out.println("This is a default constructor");
		x=100;
		y=50;
		
	}
	
	Point(int first,int second)
	{
		x=first;
		y=second;
		
		
	}
	int x;
	int y;
	
	
}