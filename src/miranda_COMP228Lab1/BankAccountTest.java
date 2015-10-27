package miranda_COMP228Lab1;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String accountNumber = JOptionPane.showInputDialog("Enter Account Number: ");
		String clientName = JOptionPane.showInputDialog("Enter Customer Name: ");
		String action = JOptionPane.showInputDialog("What do you want to do today? Enter W for Withdraw and D for Deposit");
		
		BankAccount customer1 = new BankAccount(accountNumber, clientName, 100);
		

		if (action.equals("W")){
			String amountEntered = JOptionPane.showInputDialog("Withdraw Amount?");
			double amount = Double.parseDouble(amountEntered);
			
			customer1.withdraw(amount);
			customer1.getAccountInfo();
		}
			
			
		if (action.equals("D")){
			String depositAmount = JOptionPane.showInputDialog("Deposit Amount?");
			double amountDeposited = Double.parseDouble(depositAmount);
			
			customer1.deposit(amountDeposited);
			customer1.getAccountInfo();
		} 
		
		String message = customer1.getAccountInfo();
		
		JOptionPane.showMessageDialog(null, message );		
		
		System.exit(0);

	}

}
