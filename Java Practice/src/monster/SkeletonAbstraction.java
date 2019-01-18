package monster;

public class SkeletonAbstraction extends MonsterAbstraction {

public String typeofAttack;
	
	
	

	public SkeletonAbstraction() {
		
		System.out.println("I am default constructor from Skeleton Class");
	}
	
	
	public SkeletonAbstraction(int hitpoints,int speed) {
		
	
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack= "Axe";
		
		
	}

	
public SkeletonAbstraction(int hitpoints,int speed,String typeofAttack) {
		
		
		System.out.println("I am  constructor from Skeleton Class with 2 args");
		this.typeofAttack=typeofAttack;
		
		
	}


@Override
protected
void desciptionMonster() {
	
}
}
