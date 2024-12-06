package Masteries.Vehicle;

/* 
 * Program: VehicleTest.java			Date: Oct 19, 2024
 * Purpose: Test the vehicle mastery
 * 
 * Author: Grayson Ardron
 * School: CHHS
 * Course: Computer Science CS30
 */


	public class VehicleTest {
	    public static void main(String[] args) {
	      
	        Car car = new Car(25, 35, 5, 15, 12);
	        Truck truck = new Truck(15, 20, 3, 50, 8);
	        Minivan minivan = new Minivan(20, 28, 7, 30, true);
	        	
	            System.out.println(car.vehicleType());
	            System.out.println(car.getfuelEconomyCity());
	            System.out.println(car.getfuelEconomyHwy());
	            System.out.println(car.getseatingCapacity());
	            System.out.println(car.getcargoVolume());

	           
	           
	            System.out.println();
	            
	            System.out.println(car);
	            System.out.println(truck);
	            System.out.println(minivan);
	        }
	    }
	


