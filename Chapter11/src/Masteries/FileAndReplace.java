package Masteries;

import java.io.*;
import java.util.Scanner;

public class FileAndReplace {
	public static void main(String[] args) {
		String pth, wrd, rWrd;
		File dataFile;
		FileReader in;
		FileWriter out;
		BufferedReader readFile; 
		BufferedWriter writeFile;
		String currentLine;
		Boolean fL = true;
		String txtFl = "";
	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter path: " );
		pth = input.next();
		
		System.out.println("What word do you wish to search for?: ");
		wrd = input.next();
		
		System.out.println("What is your replacement word?: ");
		rWrd = input.next();
		
		//read File
		
		try {
			dataFile = new File(pth);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((currentLine = readFile.readLine()) != null)
			{
			  currentLine = currentLine.replaceAll(wrd, rWrd);
			  
			  if(fL)
			  {
				  txtFl += currentLine;
				  fL = false;
				  
			  }
			   
			  else
			  {
				  txtFl += "\n" + currentLine;
			  }
			   
			   
			}
			
			
			readFile.close();
			in.close();
		}
		
		//exceptions
		
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
		
		//Write into file
		
		try {
			dataFile = new File(pth);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			
			writeFile.write(txtFl);
			
			
			writeFile.close();
			out.close();
		}
		
		//exceptions
		
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
	}
	}
	

