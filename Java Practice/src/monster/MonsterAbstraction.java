package monster;

public abstract class MonsterAbstraction {

	public int hitpoints;
	public int speed;
	
	
	abstract protected void desciptionMonster() ;//abstract method
	
	
	
	public void attack() {
		System.out.println("I am attacking from monster class");
	}
	
	
	public MonsterAbstraction(){
		
		System.out.println("I am default constructor from Monster class");
		
	}
	
	public MonsterAbstraction(int hitpoints,int speed){
		
		System.out.println("I am constructor from Monster class with 2 arguments");
		this.hitpoints= hitpoints;
		this.speed= speed;
		
	}
}




