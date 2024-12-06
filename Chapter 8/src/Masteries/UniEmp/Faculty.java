package Masteries.UniEmp;
/* 
 * Program: Faculty.java			Date: Oct 15, 2024
 * Purpose: Return/manipulate department name
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */



public class Faculty extends UEmployee  {
	
	private String department;
	
public Faculty(String fN, String lN, int sL, String d) {
		super(fN, lN, sL);

		department = d;
	}
	
public String getdepartment()
{
	return department;
}

public void setdepartment(String d) 
{
	department = d;
}

public String toString() 
{
	return(super.toString() + " Department name: " + department);
}

}

/*
 * Screen Dump
 * 
 * 1: 
 * Bob Smitht Salary: 100000.0 Department name: Nuclear sciences
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
