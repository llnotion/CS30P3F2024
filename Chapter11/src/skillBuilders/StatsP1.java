package skillBuilders;

import java.io.*;
import java.text.NumberFormat;

public class StatsP1 {
	
	public static void main(String[] args)
	{
		File dataFile = new File("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter11\\src\\skillBuilders\\test1.txt");
		FileReader in;
		BufferedReader readFile;
		String StuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
				
		try 
		{
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
			
		}
		
	}
}
				
	


