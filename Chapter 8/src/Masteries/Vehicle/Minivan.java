package Masteries.Vehicle;
/* 
 * Program: WordCount.java			Date: oct 22, 2024
 * Purpose:
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */



class Minivan extends Vehicle {
    private boolean slidingDoors;

    public Minivan(double fuelC, double fuelH, int seatC, double cargoV, boolean sD) {
        super(fuelC, fuelH, seatC, cargoV);
       slidingDoors =  sD;
    }

    public boolean hasSlidingDoors() {
        return slidingDoors;
    }

    @Override
    public String vehicleType() {
        return "Minivan";
    }
    public String toString() 
    {
    	return(super.toString() + "\nHas sliding doors: " + slidingDoors);
    }
}


