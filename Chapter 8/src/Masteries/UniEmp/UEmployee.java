package Masteries.UniEmp;

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
			return(super.toString() + firstName + " " + lastName + "Salary: " + salary);
		}

	}