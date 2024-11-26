package Masteries.UniEmp;

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
		return("Members: " + jobTitle);
	}
	
	
}
