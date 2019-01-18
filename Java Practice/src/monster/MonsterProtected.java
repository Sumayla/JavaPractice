package monster;

public class MonsterProtected {
	
	 int hitpoints;//default modifier
	 int speed;
	
	 
	 protected int score; //can accessed by class in another package if it extends the base class
	 protected int goals;
	 
	
	 protected int gethitPoints() {
		 
		 return this.hitpoints;
		 
	 }
	 
	 protected void sethitPoints(int hitPoints) {
		 
		 
		 this.hitpoints= hitPoints;
		 
	 }
	 
	public void attack() {
		System.out.println("I am attacking from monster class");
	}
	
	
	public MonsterProtected(){
		
		System.out.println("I am default constructor from Monster class");
		
	}
	
	public MonsterProtected(int hitpoints,int speed){
		
		System.out.println("I am constructor from Monster class with 2 arguments");
		this.hitpoints= hitpoints;
		this.speed= speed;
		
	}
}






