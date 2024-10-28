package Masteries;

import java.io.*;
import java.text.DecimalFormat;

/* 
 * Program: WordCount.java			Date: Oct 15, 2024
 * Purpose:
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */




public class WordCount {
	
	public static void main(String[] args) {
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		String avgLength = null;
		Boolean checkLetter = false;
		int charNum = 0;
		int wordNum = 0;
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		
		try {
			dataFile = new File("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter11\\src\\skillBuilders\\WordCount.txt");
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while (readFile.ready()){
				int notation = readFile.read();
				
				//Correlation of # between ASCCI notation
				if(notation >= 65 && notation <= 90 || notation >= 97 && notation <= 122) 
				{
					checkLetter = true;
					charNum++;
				}
				
				
				
				else
				{
					if(checkLetter)
					{
						wordNum++;
					}
					
					avgLength = format.format((double)charNum/wordNum);
					
					
				}
		
			}
			
			System.out.println("# of words: " + wordNum);
			System.out.println("Average word length: " + avgLength + " letters");
			
			
		}
		
		
		
		
		
		
		
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
