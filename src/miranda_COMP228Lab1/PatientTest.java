package miranda_COMP228Lab1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patientID = JOptionPane.showInputDialog("Enter your patient ID");
		String firstName = JOptionPane.showInputDialog("Enter your First Name:");
		String lastName = JOptionPane.showInputDialog("Enter your Last Name:");
		String address = JOptionPane.showInputDialog("Enter your Address:");
		String city = JOptionPane.showInputDialog("Enter your City:");
		String province = JOptionPane.showInputDialog("Enter your Province:");
		String postalCode = JOptionPane.showInputDialog("Enter your Postal Code:");
		
		Patient patient1 = new Patient( patientID, firstName, lastName, address, city, 
				province, postalCode);

		String message = patient1.getPatientInfo();
		
		JOptionPane.showMessageDialog(null, message );

	}

}
