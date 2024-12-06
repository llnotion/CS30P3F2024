package Masteries.Account;

/* 
 * Program: BusinessAcct.java			Date: Oct 22, 2024
 * Purpose: Create the outline of a business account
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


public class BusinessAcct extends Account {
    private static final double MIN_BALANCE = 500.0;
    private static final double PENALTY = 10.0;

    public BusinessAcct(double bal, String fName, String lName, String street, String city, String province, String postalcode) {
        super(bal, fName, lName, street, city, province, postalcode);
        applyPenalty();
    }

    public BusinessAcct(String ID) {
        super(ID);
        applyPenalty();
    }

    @Override
    public void withdrawal(double amt) {
        super.withdrawal(amt);
        applyPenalty();
    }

    private void applyPenalty() {
        if (getBalance() < MIN_BALANCE) {
            super.withdrawal(PENALTY);
        }
    }
 public String toString() {

		return super.toString();
	}
}



