package Masteries.Vehicle;
/* 
 * Program: WordCount.java			Date: Oct 22, 2024
 * Purpose:
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


class Truck extends Vehicle {
    private double bedLength;

    public Truck(double fuelC, double fuelH, int seatC, double cargoV, double bedL) {
        super(fuelC, fuelH, seatC, cargoV);
        bedLength = bedL;
    }

    public double getBedLength() {
        return bedLength;
    }
    public void setBedLength(double bedL) {
        bedLength = bedL;
    }

    @Override
    public String vehicleType() {
        return "Truck";
    }
    
    public String toString() 
    {
    	return(super.toString() + "\nBed Length: " + bedLength);
    }
}
