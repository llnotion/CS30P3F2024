import com.phidget22.*;

	public class Challenge {
	    public static void main(String[] args) throws Exception {

	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        //Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        DistanceSensor sonar = new DistanceSensor();

	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        
	        
	        
	       

	        //Move forward at full speed
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);

	        //Wait for 1 second
	        Thread.sleep(1500);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(1000);

	        //Turn in one direction
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(-1);

	        //Wait for 2 second
	        Thread.sleep(610);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(2000);
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);

	        //Wait for 1 second
	        Thread.sleep(1500);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(1000);

	        //Turn in one direction
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(-1);

	        //Wait for 2 second
	        Thread.sleep(610);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(2000);
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);

	        //Wait for 1 second
	        Thread.sleep(1500);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(1000);

	        //Turn in one direction
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(-1);

	        //Wait for 2 second
	        Thread.sleep(610);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(2000);
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);

	        //Wait for 1 second
	        Thread.sleep(1500);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	    
	        //Wait for 2 second
	        Thread.sleep(100);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	      //Wait for 1 second
	        Thread.sleep(2000);
	        
	    
	        
	        sonar.setDataInterval(300);
	

	            System.out.println("Distance: " + sonar.getDistance() + " mm");
	            
	            if (sonar.getDistance() < 300) {
	                //Object detected! Stop motors
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	              //Wait for 1 second
	                Thread.sleep(2000);
	                //Turn in one direction
	                leftMotors.setTargetVelocity(1);
	                rightMotors.setTargetVelocity(-1);

	                //Wait for 2 second
	                Thread.sleep(800);
	                
	                //Move forward at full speed
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	              //Wait for 1 second
	                Thread.sleep(2000);
	                
	                //Move forward at full speed
	                leftMotors.setTargetVelocity(1);
	                rightMotors.setTargetVelocity(1);
	                
	              //Wait for 1 second
	                Thread.sleep(1000);
	                
	              
	            }
	           
	    }
	}
	  

