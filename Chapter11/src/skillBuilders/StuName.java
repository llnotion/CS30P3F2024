package skillBuilders;

import java.io.*;

public class StuName implements Serializable{
private String stufName;
private String stulName;
	
	
	public StuName(String firstName, String lastName) {
		stufName = firstName;
		stulName = lastName;
		
}


	public String toString() 
	{
		String stuString;
		
		stuString = "First name: " +  stufName + " Last Name: " + stulName;
		return(stuString);
	}
	
}
