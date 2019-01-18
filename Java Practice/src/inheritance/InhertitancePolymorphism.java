package inheritance;

import monster.MonsterPolymorphism;
import monster.SkeletonPolymorphism;
import monster.ZombiePolymorphism;

public class InhertitancePolymorphism {

	public static void main(String[] args) {
		
		/*MonsterPolymorphism monster= new MonsterPolymorphism();
		Skeleton skeleton = new Skeleton();
		ZombiePolymorphism zombie = new ZombiePolymorphism();//polymorphism
		
		MonsterPolymorphism m2 = new ZombiePolymorphism();
		m2 = new SkeletonPolymorphism();
		
		InhertitancePolymorphism.whatever(new Skeleton());*/
		//ability to take many pforms
		
		
		MonsterPolymorphism m= new SkeletonPolymorphism();
		m.attack();
		
		m.test();
		
		//cant access method from skeleton coz its not in super class which is monsterm.test1();
		((SkeletonPolymorphism)m).test1();
		
		
	}
	
	public static  void whatever(MonsterPolymorphism monster) {
		
		
	}

}
