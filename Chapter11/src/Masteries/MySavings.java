package Masteries;

import java.io.*;

/* 
 * Program: MySavings.java			Date: Oct 21, 2024
 * Purpose:
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


import java.text.NumberFormat;
import java.util.Scanner;

import skillBuilders.StuName;

public class MySavings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File textFile;
		double data, withdraw;
		String user;
		
		
		PiggyBank userAccount = new PiggyBank();
		
		
		
		System.out.println("Do you wish to load the previous file? (Y/N)");
		user = input.nextLine();
		
		if(user.toLowerCase().equals("y"))
		{
			try{
				textFile = new File("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter11\\src\\Masteries\\pgBank.txt");
				FileInputStream in = new FileInputStream(textFile);
				ObjectInputStream readStu = new ObjectInputStream(in);
			
		
				userAccount = (PiggyBank) readStu.readObject();
		
		
		
		
				
				NumberFormat money = NumberFormat.getCurrencyInstance();
		
				in.close();
				readStu.close();
			}
			
			catch (FileNotFoundException e) 
			{
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			catch (IOException e) 
			{
				System.out.println("Problem ready file");
				System.err.println("IOException: " + e.getMessage());
			}
			catch (ClassNotFoundException e) 
			{
				System.out.println("Class does not exist or could not be found.");
				System.err.println("ClassNotFoundException: " + e.getMessage());
			}
			
		
		do {
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("6. Take money out of bank");
		System.out.println("Enter 0 " + " to quit");
		System.out.println("Enter your choice: ");
		
		data = input.nextDouble();
		
		
		if (data == 1) 
		{
		System.out.println(userAccount);
		}
		
		else if (data == 2) 
		{
		userAccount.addPenny();
		System.out.println("A penny has been added to your account!");
		}
		
		else if (data == 3) 
		{
		userAccount.addNickel();
		System.out.println("A nickel has been added to your account!");
		}
		
		else if (data == 4) 
		{
		userAccount.addDime();
		System.out.println("A dime has been added to your account!");
		}
		
		else if (data == 5) 
		{
		userAccount.addQuarter();
		System.out.println("A quarter has been added to your account!");
		}
		
		else if (data == 6) 
		{
		System.out.println("How much would you like to take out?: ");
		withdraw = input.nextDouble();
		userAccount.removeM(withdraw);
		}
		
		else if (data == 0) {
		System.out.println(" ");
		}
		
		
		
			} while (data != 0);
		
		}
			
	
		
		
		try {
			textFile = new File("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter11\\src\\Masteries\\pgBank.txt");
			
			FileOutputStream out = new FileOutputStream(textFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			writeStu.writeObject(userAccount);
			
			
			
			writeStu.close();
			System.out.println("Data written to file. ");
		}
		
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem ready file");
			System.err.println("IOException: " + e.getMessage());
		}


		
	
			
		

	}
}


