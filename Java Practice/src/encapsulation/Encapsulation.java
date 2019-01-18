package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		

		BankAccount b = new BankAccount();
		//System.out.println(b.getBalance());
		
		//b.setBalance(1000);
		
		if (b.withdraw(10))
			System.out.println("ok");
		else 
			System.out.println("Not enuf money");
		
		//System.out.println(b.getBalance());
		
	}

}

class BankAccount {
	
	BankAccount(){
		
		balance= 1000;
		
	}
	
	
	
	
	private int balance;
	
	public int getBalance() {
		return balance;
		
	}
	
	
	private void setBalance(int amount) {
		balance = amount;
		
		
	}
	
 boolean withdraw(int amount) {
		
		if (balance>amount)
		{
			
			//balance-=amount;
		setBalance(balance-amount);//METHODS ARE CREATED SO THAT WE CAN REUSE THEM
		}
		else 
			return false;
		
		
		return true;
		
		
	}
 
 public boolean  deposit(int amount) {
	 
	 //balance+=amount;
	 
	 setBalance(balance+amount);
	 
	 return true;
	 
	 
 }
	
	
}
