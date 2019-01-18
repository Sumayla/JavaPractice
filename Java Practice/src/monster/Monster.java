package monster;

public class Monster {

	public int hitpoints;
	public int speed;
	
	
	public void attack() {
		System.out.println("I am attacking from monster class");
	}
	
	
	public Monster(){
		
		System.out.println("I am default constructor from Monster class");
		
	}
	
	public Monster(int hitpoints,int speed){
		
		System.out.println("I am constructor from Monster class with 2 arguments");
		this.hitpoints= hitpoints;
		this.speed= speed;
		
	}
}




