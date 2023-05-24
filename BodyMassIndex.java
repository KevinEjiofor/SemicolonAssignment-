import java.util.Scanner;

	public class BodyMassIndex{
	
		public static void main(String[] args){
		
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter the weight in pounds ");
		double weightPounds = scanner.nextDouble ();
		
	System.out.print("Enter the height in inches ");
		double heightInches = scanner.nextDouble ();
		
		double bodyMassIndex = (weightPounds*0.45359237)/((heightInches *0.0254)*(heightInches*0.0254));
		
	System.out.printf("BMI is %.4f/n", bodyMassIndex);
	
	}
	
}
	
