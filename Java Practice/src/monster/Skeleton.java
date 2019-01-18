package monster;

public class Skeleton extends Monster{

	public String typeofAttack;
	
	
	

	public Skeleton() {
		
		System.out.println("I am default constructor from Skeleton Class");
	}
	
	
	public Skeleton(int hitpoints,int speed) {
		
		super(hitpoints,speed);
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack= "Axe";
		
		
	}

	
public Skeleton(int hitpoints,int speed,String typeofAttack) {
		
		super(hitpoints,speed);
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack=typeofAttack;
		
		
	}
}
