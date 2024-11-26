package Masteries.Vehicle;


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


