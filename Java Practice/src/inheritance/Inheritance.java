package inheritance;

import monster.Monster;
import monster.Skeleton;

public class Inheritance {

	public static void main(String[] args) {
	
		Monster monster = new Monster(10,20);
		
		/*monster.attack();
		System.out.println(monster.hitpoints);
		System.out.println(monster.speed);*/

		
		
		//Skeleton skeleton = new Skeleton(1000,900);
		Skeleton skeleton1 = new Skeleton(1000,900,"Bow");
		//skeleton.attack();
		//System.out.println(skeleton.hitpoints);
		skeleton1.attack();
		System.out.println(skeleton1.typeofAttack);
		
		
		
	}

}
