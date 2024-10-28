package ZeldaPress;

public abstract class Employee {
private String firstName, lastName;


//constructor method

public Employee(String fN, String lN)
{
	firstName = fN;
	lastName = lN;
	
}
	
public String toString() 
{
	return(firstName + "   " + lastName);
}

abstract double pay(double period);

}
