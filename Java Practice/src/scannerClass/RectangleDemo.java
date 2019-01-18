package scannerClass;

import java.util.*;

class Rectangle {
	
	private String color;
	private double width;
	private double height;
	
	
	
	public void setWidth(double width) {
		this.width=width;
		
	}
	
	public void setHeight(double height) {
		this.height=height;
		
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public double getWidth(){
		return width;
		
	}

	
	public double getHeight(){
		return height;
		
	}
		
	public String getColor(){
		return color;
		
	}
	
	public double getArea(){
	double area=width*height;
	return area;
		
		
	}
	
		public double getPerimeter(){
	double perimeter=2*(width+height);
	return perimeter;
	
		
		
	}
}

public class RectangleDemo {
	public static void main(String[] args) {
		
		Rectangle obj= new Rectangle();
		Scanner input = new Scanner(System.in);
		String color1=input.next();
		double width1=input.nextDouble();
		double height1=input.nextDouble();
		
		
		
		
	
		obj.setColor(color1);
		obj.setHeight(height1);
		obj.setWidth(width1);
		double area=obj.getArea();
		System.out.println(area);
		double perimeter=obj.getPerimeter();
		System.out.println(perimeter);
		
	}
}