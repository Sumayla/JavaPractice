package inheritance;

import monster.MonsterProtected;

public class SpiderProtected extends MonsterProtected {
	
	MonsterProtected m = new MonsterProtected();
	
	
	
	void whatever() {
		
		this.sethitPoints(20);
		this.gethitPoints();
		
		
	}
	
	
	

}
