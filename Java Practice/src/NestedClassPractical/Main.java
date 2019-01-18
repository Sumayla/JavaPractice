package NestedClassPractical;

public class Main {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(100000);
		
		System.out.println(b.getAccountBalance());
		
	}
	
}
	class BankAccount{
		
		
		private double accountBalance;
		
		public BankAccount(double accountBalance) {
			this.accountBalance=accountBalance;
			
		}
		public double getAccountBalance() {
			return accountBalance;
		}
	
		
		public void calculateInterest(double interestRate) {
			
			Interest interest = new Interest( interestRate);
			
			
		}
		
		
		class Interest{
			
			private double interestRate;
			
			public Interest( double interestRate) {
				this.interestRate=interestRate;
				
				
			}
			
			
			public double getInterestRate() {
				return interestRate;
			}
			
		}
		
		
	}


