package Masteries.Account;

/* 
 * Program: CustomerTest.java			Date: Oct 22, 2024
 * Purpose: Test the account data output 
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */




public class CustomerTest {

	
	 public static void main(String[] args) {
	      
		 
		 BusinessAcct bucct = new BusinessAcct(45, "john", "bad", "taco", "Calgary", "AB", "T2E 0Z6");
		 
		 
		 PersonalAcct pucct = new PersonalAcct(4000, "suck", "Brain", "beef", "Hague", "NE", "BTR 80A");
		 
		 
		 System.out.println(bucct);
		 System.out.println(pucct);
		 
		
	
		 
		 
		 
	 }
	
}
