package inheritance;

import monster.MonsterAbstraction;
import monster.MonsterPolymorphism;
import monster.SkeletonAbstraction;
import monster.SkeletonPolymorphism;

public class InheritanceAbstraction {

public static void main(String[] args) {
		
		/*MonsterPolymorphism monster= new MonsterPolymorphism();
		Skeleton skeleton = new Skeleton();
		ZombiePolymorphism zombie = new ZombiePolymorphism();//polymorphism
		
		MonsterPolymorphism m2 = new ZombiePolymorphism();
		m2 = new SkeletonPolymorphism();
		
		InhertitancePolymorphism.whatever(new Skeleton());*/
		//ability to take many pforms
		

	MonsterAbstraction m= new SkeletonAbstraction();
	

		
	}
	
	public static  void whatever(MonsterAbstraction monster) {
		
		
	}

}
