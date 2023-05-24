import java.util.Scanner;

public class AccelerationSolver{

	public static void main(String[] args){
	
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter the initial Velocity(in m/s): ");
	double intialVelocity = scanner.nextDouble();
	
	System.out.print("Enter the final Velocity (final velocity m/s");
	double finalVelocity = scanner.nextDouble();
	
	System.out.print(" Enter the time taken (in s): ");
	double timeTaken = scanner.nextDouble();
	
	double acceleration= (finalVelocity - intialVelocity)/ timeTaken;
	
	System.out.println("The acceleration is: " + acceleration + "m/S^2");
	
	
	
	}
}
