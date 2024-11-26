package Masteries.Vehicle;


	class Car extends Vehicle {
	    private double trunkSize;

	    public Car(double fuelC, double fuelH, int seatC, double cargoV, double trunkS) {
	        super(fuelC, fuelH, seatC, cargoV);
	        trunkSize = trunkS;
	    }

	    public double getTrunkSize() {
	        return trunkSize;
	    }
	    
	    public void setTrunkSize(double trunkS) {
	        trunkSize = trunkS;
	    }


	    @Override
	    public String vehicleType() {
	        return "Car";
	    }
	    public String toString() 
	    {
	    	return(super.toString() + "\nTrunk Size: " + trunkSize);
	    }
	}


