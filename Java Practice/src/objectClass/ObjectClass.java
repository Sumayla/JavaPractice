package objectClass;

public class ObjectClass {

	public static void main(String[] args) {
		
		/*Object o = new Point(4,7);
		
		
		Point p = new Point(1,10);
		Point p2 = new Point(1,10);
	
		if (p.equals(p2))
			System.out.println("They are equal");*/
		
		
		Object[] p = new Object[7];
		p[0] = new Point(4,5);
		p[1] = new Point(4,52);
		p[2] = new Point(4,52);
		p[3] = new Point(4,51);
		
		//System.out.println(p[0].equals(p[1]));
		System.out.println(p[0].equals(p[6]));
		
	}

}

class Point   {
	
	//all possible classes ae inheriting from object class
	
	private int x;
	private int y;

	
	Point() {
	
}
	
	Point(int x,int y){
		
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
	public boolean equals(Object o) {
		
		Point sentpoint = (Point)o;
		
		if (this==o)
			return true;
		
		
		//if(o.getClass()!=this.getClass())
			//return false;
		
		
		if(o==null)
			return false;
		
		
		
		return (this.x==sentpoint.x && this.y==sentpoint.y);
		
		
		
		
		
	}
	
}
