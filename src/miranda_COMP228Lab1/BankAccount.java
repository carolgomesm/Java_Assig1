package miranda_COMP228Lab1;

public class BankAccount {
	
	// instance variables	
		private String accountNumber,
					   name;
		private double balance;
		
		//Constructor
		public BankAccount(String accountNumber, String name, double balance){
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
		}
		
		// method to retrieve the name from the object
		public String getAccountNumber(){
			return accountNumber;
		}
		public String getName()
		{
			return name; // return value of name to caller
		}
		
		//method to retrieve the balance of the account
		public double getBalance(){
			
			return balance;
		}
		
		//method for depositing money
		public void deposit(double depositAmount){	
			if (depositAmount > 0.0)
				balance += depositAmount;
		}
		
		//method for withdrawing money
		public void withdraw(double withdrawAmount){
			if (withdrawAmount > 0.0 && withdrawAmount <= balance)
				balance -= withdrawAmount;
		}
		
		public String getAccountInfo(){
			
			return "Account Number:" + accountNumber + "\n" +
					"Name: " + name + "\n" +
					"New Balance: $" + String.format("%.2f", balance);
		}
		
		

}
