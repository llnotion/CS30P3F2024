package Masteries.Account;

import java.util.Scanner; 


public class Customer {
	private String firstName, lastName;

	//create String variables street, city, province, postal code	
	
	private String changeStreet, changeCity, changeProvince, changePostalCode;

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String street, String city, String province, String postalcode) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		changeCity = city;
		changeStreet = street;
		changeProvince = province;
		changePostalCode = postalcode;

		//reflect the changes in the parameter
	}
	
	
	
	//create changeCity method that asks the user their city and records city in a variable above
	public void changeCity() {
		Scanner user = new Scanner(System.in);
		
		System.out.println("input city name: ");
		changeCity = user.nextLine();
		
	}

	//create changeStreet method that asks the user their street and records street in a variable above
    public void changeStreet() {
    	 Scanner user = new Scanner(System.in);
    	
    	System.out.println("input street name: ");
		changeStreet = user.nextLine();
		
	}
	//create changeProvince method that asks the user their province and records province in a variable above
    public void changeProvince() {
    	 Scanner user = new Scanner(System.in);
    	
    	System.out.println("input province name: ");
		changeProvince = user.nextLine();
		
	}
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
    public void changePostalCode() {
    	 Scanner user = new Scanner(System.in);
    	
    	System.out.println("input postal code ");
		changePostalCode = user.nextLine();
		
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + " " + changeStreet + " " + changeCity + " " + changeProvince + " " + changePostalCode + "\n";
	 	return(custString);
	}

}

