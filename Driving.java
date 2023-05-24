import java.util.Scanner;

	public class Driving{
	
	public static void main(String[] args) {
	
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double drivingDistance= scanner.nextDouble ();
	
	System.out.print("Enter the miles per gallon: ");
	double milesPerGallon= scanner.nextDouble ();
	
	System.out.print("Enter price per gallo: ");
	double pricePerGallon= scanner.nextDouble ();
	
	double costOfDriving = drivingDistance*(pricePerGallon/milesPerGallon);
	
	System.out.printf(" The cost of driving is $%.2f%n", costOfDriving);
	
	}
	
}
	
