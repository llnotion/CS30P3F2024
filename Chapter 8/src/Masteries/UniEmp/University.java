package Masteries.UniEmp;

import java.text.NumberFormat;
import java.util.Scanner;

import ZeldaPress.Associate;
import ZeldaPress.Employee;
import ZeldaPress.Manager;

public class University {


	public static void main(String[] args) 
	{
		Faculty emp1 = new Faculty("Bob", "Smitht", 100000, ", Professor of Nuclear sciences" );
		Staff emp2 = new Staff("Shaquel", "Amor", 2000 ,", Janitor");
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		
		UEmployee emp = emp1;
		
		do
		{
			System.out.println("\n (E)mployee \\"
								+ "(P)ay \\ (Q)uit");
			
			System.out.println("Enter choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Choose employee #(1 or 2)"
						+ "");
				empNum = input.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
				}
				
				if(action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter the hours for "
									+ "Associate OR "
									+ "pay period for Manager ");
				}
				
				
			}
			
		}while(!action.equalsIgnoreCase("Q"));
	}

}
	
	

