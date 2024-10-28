package skillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myFileP2 {

	
	public static void main(String[] args) {
	//declaration
	File textFile;
	Scanner input = new Scanner(System.in);
	String response;
	
	//Create a file
	textFile = new File("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter11\\src\\skillBuilders\\zzz.txt");
	
	
	if(textFile.exists())
	{
		System.out.println("zzz.txt exists");
	}
	else {
		try {
			textFile.createNewFile();
			System.out.println("zzz.txt is created");
		}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		
		
		
		
		System.out.println("would you like" + "to (K)eep or (D)elete the file?");
		response = input.next();
		
		if(response.equalsIgnoreCase("D")) {
			if(textFile.delete()) {
				System.out.println("File Deleted!");
			}
			else
			{
				System.out.println("File is kept and stays the same!");
			}
				
			
			
			
			
			
			
			}
		}
	}
}


