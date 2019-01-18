package bottle;

public class Bottle {
	
	private double waterAmount;
	
	Bottle(double waterAmount ){
		this.waterAmount = waterAmount;
			
		
	}
	
    double getWaterAmount() {
    	return waterAmount;
    	
    	
    	
    }
	
	void fill ( double amount) 
	{
		this.waterAmount += amount;
		
	}
	
	boolean pour (double amount) {
		if(this.waterAmount>amount)
		this.waterAmount -= amount;
		else 
			return false;
		return true;
		
			
		
		
	}
	
	void transfer	(double amount,Bottle transferToBottle) {
		
		if(this.pour(amount))
		{
		
		transferToBottle.fill(amount);
		}
		
		else
			System.out.println("not enuf water"); 
		
	}

	public static void main(String[] args) {
		
		//double[] Bottle = new double[3];
		
		
		Bottle[] bottle = new Bottle[3];
		 
		bottle[0]= new Bottle(10);
		bottle[1]= new Bottle(5);
		bottle[2]= new Bottle(20);
		                           
		System.out.println(bottle[0].getWaterAmount());
		bottle[0].fill(5);
		System.out.println(bottle[0].getWaterAmount());
		bottle[1].pour(5);
		System.out.println(bottle[1].getWaterAmount());
		bottle[2].transfer(2, bottle[1]);
		System.out.println(bottle[1].getWaterAmount());
		
		
	}

}
