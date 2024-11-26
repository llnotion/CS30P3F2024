package Puck;

public class Puck extends Disk implements Comparable
{
	public double MIN_STD_WEIGHT = 5;
	public double MAX_STD_WEIGHT = 5.5;
	public double MIN_YTH_WEIGHT = 4;
	public double MAX_YTH_WEIGHT = 4.5;
	
	
	private double weight;
	private boolean standard, youth;
	
	//constructor
	
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		if(weight >= MIN_STD_WEIGHT && weight <= MAX_STD_WEIGHT)
		{
			standard = true;
			youth = false;
		}
		else
		{
			standard = false;
			youth = true;
		}
	}
	
	//Accessor method
	public double getWeight() 
	{
	 	return(weight);
	}
	//Modifier method
	public void setWeight(double w)
	{
		weight = w;
	}
	
	
	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "Puck is standard";
		}
		else
		{
			div = "Puck is youth";
		}
		return div;
	}
	
	
	public String toString() {
		String puckString;
		
		return puckString = "the puck has weight" 
				+ getWeight()
				+ " and divisiom is "
				+ getDivision()
				+".";
		
	}
	
	public  boolean equals(Object obj)
	{
		Puck testObj = (Puck)obj;
		
		if(testObj.getDivision() == getDivision())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}