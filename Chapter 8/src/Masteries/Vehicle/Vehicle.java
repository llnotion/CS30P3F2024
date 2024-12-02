package Masteries.Vehicle;
/* 
 * Program: WordCount.java			Date: Oct 22, 2024
 * Purpose:
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */



	abstract class Vehicle {
	    private double fuelEconomyCity;
	    private double fuelEconomyHwy;
	    private int seatingCapacity;
	    private double cargoVolume;

	    public Vehicle(double fuelC, double fuelH, int seatC, double cargoV) {
	       fuelEconomyCity = fuelC;
	       fuelEconomyHwy = fuelH;
	       seatingCapacity =  seatC;
	       cargoVolume = cargoV;
	    }

	    public double getfuelEconomyCity() {
	        return fuelEconomyCity;
	    }
	    public void setfuelEconomyCity(double fuelC) 
		{
	    	fuelEconomyCity = fuelC;
		}

	    public double getfuelEconomyHwy() {
	        return fuelEconomyHwy;
	    }
	    public void setfuelEconomyHwy(double fuelH) 
		{
			fuelEconomyHwy = fuelH;
		}

	    public int getseatingCapacity() {
	        return seatingCapacity;
	    }
	    public void setseatingCapacity(int seatC) 
		{
			seatingCapacity = seatC;
		}

	    public double getcargoVolume() {
	        return cargoVolume;
	    }
	    
	    public void setcargoVolume(double cargoV) 
		{
			cargoVolume = cargoV;
		}

	    public abstract String vehicleType();
	    
	    
	    public String toString() {
	    	String veh = 
	    			"Fuel economy city " + fuelEconomyCity +
	    			"\nFuel economy hwy " + fuelEconomyHwy +
	    			"\nSeating Capacity " + seatingCapacity +
	    			"\nCargo Volume " + cargoVolume;
	    	return veh;
	    }
	}

	

