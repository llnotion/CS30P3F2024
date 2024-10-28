package skillBuilders;

import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;

public class Roster {
	public static void main(String[] args) {
		//declaration area
		File dataFile;
		String filename;
		int numStu;
		String fName, lName;
		
	
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter path for " + "storing names");
		filename = input.next();
		
		System.out.println("How many students?");
		numStu = input.nextInt();
		
		
		dataFile = new File(filename);
		try 
		{
			
			FileOutputStream out = new FileOutputStream(dataFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for(int i=0; i < numStu; i++)
			{
				System.out.println("Enter Student " + (i + 1) + "'s First Name: ");
				fName = input.next();
				
				System.out.println("Enter Student "  + (i + 1) + "'s Last Name: ");
				lName = input.next();
				
				
				 writeStu.writeObject(new StuName(fName, lName));
				
			}
			writeStu.close();
			System.out.println("Data written to file. ");
			
			
			
				 /* read objects */
				 FileInputStream in = new FileInputStream(dataFile);
				 ObjectInputStream readStu = new ObjectInputStream(in);
				 
				 
				 for(int i=0; i < numStu; i++)
				 {
					 System.out.println((StuName)readStu.readObject());
				 }
				 readStu.close();
			
		}
		
		//catch
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem ready file");
			System.err.println("IOException: " + e.getMessage());
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class does not exist or could not be found.");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		
		
		                                                                   
		
		
		
		
			}
		}
	
		
		
