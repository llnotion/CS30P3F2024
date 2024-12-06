package Masteries.UniEmp;
/* 
 * Program: UEmployee.java			Date: Oct 15, 2024
 * Purpose: Declare variables and outline goal
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


	public abstract class UEmployee {
		private String firstName, lastName;
		double salary;


		//constructor method

		public UEmployee(String fN, String lN, double sL)
		{
			firstName = fN;
			lastName = lN;
			salary = sL;
		}
		
		//accessors
		public String getfirstName() 
		{
			return firstName;
		}
		public String getlastName() 
		{
			return lastName;
		}
		public double getsalary() 
		{
			return salary;
		}
		
		
		//modifiers
		public void setfirstName(String f) 
		{
			firstName = f;
		}
		public void setlastName(String l) 
		{
			lastName = l;
		}
		public void setsalary(Double s) 
		{
			salary = s;
		}
		
		
			
		public String toString() 
		{
			return(firstName + " " + lastName + "Salary: " + salary);
		}

	}
	
	
	/*
	 * Screen Dump
	 * 
	 * 1: Bob Smitht Salary: 100000.0 Department name: Nuclear sciences
	Shaquel Amor Salary: 2000.0 Members: , Janitor
	science
	Cool

	 * 
	 * 2:
	 * Bob Smitht Salary: 100000.0 Department name: Nuclear sciences
	Shaquel Amor Salary: 2000.0 Members: , Janitor
	science
	Cool

	 * 
	 *
	 */

