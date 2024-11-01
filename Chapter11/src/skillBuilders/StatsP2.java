package skillBuilders;

import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;

public class StatsP2 {
	

	public static void main(String[] args) {
	
	File dataFile;
	FileReader in;
	String filename;
	BufferedReader readFile;
	int numStu;
	FileWriter out;
	BufferedWriter writeFile;
	String StuName, score;
	double scoreValue;
	double lowScore = 100;
	double highScore = 0;
	double avgScore;
	double totalScores = 0;
	int numScores = 0;
	Scanner input = new Scanner(System.in);
	
	NumberFormat percent = NumberFormat.getPercentInstance(); 
	
	//write data to file
	System.out.println("Enter file name for " + "storing names and grades");
	filename = input.next();
	
	System.out.println("How many students?");
	numStu = input.nextInt();
	
	
	
	try 
	{
		dataFile = new File(filename);
		out = new FileWriter(dataFile);
		writeFile = new BufferedWriter(out);
		
		for(int i=0; i < numStu; i++)
		{
			System.out.println("Enter Student Name: ");
			StuName = input.next();
			
			System.out.println("Enter test score: ");
			score = input.next();
			
			writeFile.write(StuName);
			writeFile.newLine();
			writeFile.write(score);
			writeFile.newLine();
			
		}
		writeFile.close();
		out.close();
		System.out.println("Data written to file. ");
	}
	
		catch (IOException e) 
		{
			System.out.println("Problem ready file");
			System.err.println("IOException: " + e.getMessage());
		}
	
	
	
	
	try {
		dataFile = new File(filename);
		in = new FileReader(dataFile);
		readFile = new BufferedReader(in);
		
		while ((StuName = readFile.readLine()) != null)
		{
			
			score = readFile.readLine();
			System.out.println(StuName + " " + score);
			numScores = numScores + 1;
			scoreValue = Double.parseDouble(score);
			totalScores = totalScores + scoreValue;
			
			
			if(scoreValue < lowScore)
			{
				lowScore = scoreValue;
			}
			if(scoreValue > highScore)
			{
				highScore = scoreValue;
			}
			
		}
		avgScore = totalScores / numScores;
		System.out.println(" Low Score =" + percent.format(lowScore/100));
		System.out.println(" High Score =" + percent.format(highScore/100));
		System.out.println(" Average =" + percent.format(avgScore/100));
		
		in.close();
		
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

	

	
	
	
	
	
	

