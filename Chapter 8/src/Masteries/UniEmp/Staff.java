package Masteries.UniEmp;

/* 
 * Program: Staff.java			Date: Oct 15, 2024
 * Purpose: return/manipulate job title
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


public class Staff extends UEmployee {
	
	private String jobTitle;
	
	public Staff(String fN, String lN, double sL, String j) 
	{
	super(fN, lN, sL);
	jobTitle = j;
	}

	public String getjobTitle()
	{
		return jobTitle;
	}

	public void setjobTitle(String j) 
	{
		jobTitle = j;
	}
	
	
	public String toString() 
	{
		return(super.toString() + " Members: " + jobTitle);
	}
	
	
}
