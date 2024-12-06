package Masteries.UniEmp;

/* 
 * Program: University.java			Date: Oct 15, 2024
 * Purpose: Test the university mastery
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


import java.util.Scanner;



public class University {


	public static void main(String[] args) 
	{
		Faculty emp1 = new Faculty("Bob", "Smitht ", 100000, "Nuclear sciences" );
		Staff emp2 = new Staff("Shaquel", "Amor ", 2000 ,", Janitor");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(emp1);
		System.out.println(emp2);
		emp1.setdepartment("science");
		System.out.println(emp1.getdepartment());
		emp2.setjobTitle("Cool");
		System.out.println(emp2.getjobTitle());
		
		
	}

}
	
	

