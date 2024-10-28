package ZeldaPress;

public class Manager extends Employee 
{
	private double ySalary;
	
	
	//constructor method
	public Manager(String fN, String lN, double s) 
	{
		super(fN,lN);
		ySalary = s;
		
	}
	public double getYearSalary() {
		return (ySalary);
	}

	//return the manager pay for a specified
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = ySalary / 52 * weeks;
		
		return payEarned;
	}
	
	//Return the employee name, title, and salary
	
	public String toString()
	{
		return(super.toString() + ",Manager " 
								+ "Salary: " 
								+ ySalary);
	}
}
