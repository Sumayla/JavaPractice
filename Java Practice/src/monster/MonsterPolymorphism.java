package monster;

public class MonsterPolymorphism {

	public int hitpoints;
	public int speed;
	
	public void attack() {
		
		System.out.println("I am attacking from monster class");
		
	}
	
	
	
	public MonsterPolymorphism()
	{
		System.out.println("I am default constructor from Monster class");
		
		
	}
	
	public MonsterPolymorphism(int hitpoints,int speed)
	{
		System.out.println("I am constructor from Monster class with 2 arguments");
		
		this.hitpoints=hitpoints;
		this.speed= speed;
		
		
	}


	public void test() {
		// TODO Auto-generated method stub
		
	}
}
