package Masteries.Vehicle;
/* 
 * Program: Vehicle.java			Date: Oct 19, 2024
 * Purpose: Declare variables and outline goal
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
	
	/*
	 * Screen Dump
	 * 
	 * 1: 
Car
25.0
35.0
5
15.0

Fuel economy city 25.0
Fuel economy hwy 35.0
Seating Capacity 5
Cargo Volume 15.0
Trunk Size: 12.0
Fuel economy city 15.0
Fuel economy hwy 20.0
Seating Capacity 3
Cargo Volume 50.0
Bed Length: 8.0
Fuel economy city 20.0
Fuel economy hwy 28.0
Seating Capacity 7
Cargo Volume 30.0
Has sliding doors: true


	 * 
	 * 2:
	Car
25.0
35.0
5
15.0

Fuel economy city 25.0
Fuel economy hwy 35.0
Seating Capacity 5
Cargo Volume 15.0
Trunk Size: 12.0
Fuel economy city 15.0
Fuel economy hwy 20.0
Seating Capacity 3
Cargo Volume 50.0
Bed Length: 8.0
Fuel economy city 20.0
Fuel economy hwy 28.0
Seating Capacity 7
Cargo Volume 30.0
Has sliding doors: true

	 * 
	 *
	 */

	

