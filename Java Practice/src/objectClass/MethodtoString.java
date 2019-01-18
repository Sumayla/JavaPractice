package objectClass;

public class MethodtoString {

	public static void main(String[] args) {
		
		Point1[] p = new Point1[7 ];
		p[0] = new Point1(4,5);
		p[1] = new Point1(4,52);
		p[2] = new Point1(4,52);
		p[3] = new Point1(4,51);
		
		
		//System.out.println(p[0]);
		
		
		//for (int i =0;i<p.length;i++)
			//System.out.println(p[i]);
		
		///advantages of to String we didn have to use downcasting
		//So it's very cool because you do not need to especially invoke a method that is going you know say get

//the X get why we didn't need to use that downcasting here also.
		                      
		                 
		for (int i =0;i<p.length;i++) {
			
			if (p[i] instanceof Point1)
				System.out.println(p[i]);
				
		}
		
	}

}

class Point1  {
	
	//all possible classes ae inheriting from object class
	
	private int x;
	private int y;

	
	Point1() {
	
}
	
	Point1(int x,int y){
		
		this.x=x;
		this.y= y;
		
	}
	
	int getX() {
		return x;
		
		
		
	}
	
	int getY() {
		
		return y;
		
	}
	
	@Override
	public String toString() {
		
		//return "whatever";
		return   getX()+ " " + getY();
		
		
		
		
	}
}