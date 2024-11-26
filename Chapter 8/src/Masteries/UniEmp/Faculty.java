package Masteries.UniEmp;


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
	return(super.toString() + "Department name: " + department);
}

}
