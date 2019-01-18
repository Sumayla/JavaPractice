package monster;

public class SkeletonPolymorphism extends MonsterPolymorphism {
	
	public String typeofAttack;
	
	@Override
	public void attack() {
		//super.attack();
		System.out.println("I am attacking from skeleton class");
	}
	
	
	public void test1() {
		
	}
	

	public SkeletonPolymorphism() {
		
		System.out.println("I am default constructor from Skeleton Class");
	}
	
	
	public SkeletonPolymorphism(int hitpoints,int speed) {
		
		super(hitpoints,speed);
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack= "Axe";
		
		
	}

	
public SkeletonPolymorphism(int hitpoints,int speed,String typeofAttack) {
		
		super(hitpoints,speed);
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack=typeofAttack;
		
		
	}

}
