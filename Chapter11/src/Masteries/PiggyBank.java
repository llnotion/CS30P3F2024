package Masteries;
import java.io.Serializable;
import java.text. DecimalFormat;

public class PiggyBank implements Serializable {
		
		
		
		double totalAmount = 0;
		DecimalFormat format = new DecimalFormat("0.00");
		public PiggyBank() {
		totalAmount = 0;
		}
		public void addPenny () {
		totalAmount += 0.01;
		}
		public void addNickel () {
		totalAmount += 0.05;
		}
		public void addDime () {
		totalAmount += 0.10;
		}
		public void addQuarter () {
		totalAmount += 0.25;
		}
		
		public void removeM (double remove) {
			
		if (remove < totalAmount && remove > 0) {
		totalAmount -= remove;
		}
		
		else if (totalAmount < remove || remove < 0) {
		System.out.println("Try again! The amount you wish to take out is more than you currently have!");
		}
		
	}
		
		
		public String toString() {
		String call = ("The total amount of money in the users account is: " + format.format(totalAmount) + "$");
		return call;
	}
}
