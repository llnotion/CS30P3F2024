package Masteries.Account;

public class PersonalAcct extends Account {

    private static final double MIN_BALANCE = 100.0;
    private static final double PENALTY = 2.0;
   

    public PersonalAcct(double bal, String fName, String lName, String street, String city, String province, String postalcode) {
        super(bal, fName, lName, street, city, province, postalcode);
        applyPenalty();
    }

    public PersonalAcct(String ID) {
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


