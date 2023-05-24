import java.util.Scanner;

	public class Energy{
		public static void main(String[] args){
	
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter the amount of water in kg ");
	
		double amountofWater= scanner.nextDouble();
		
	System.out.print("Enter the intial temperature ");
		double intialTemperature= scanner.nextDouble();
	
	System.out.print("Enter the final temperature  ");
	 	double finalTemperature= scanner.nextDouble();
	 	
	 double energy= amountofWater*(finalTemperature- intialTemperature)*4184;
	 
	 		System.out.printf("The energy neededis %.1f%n" ,energy);
	 		
	}
	
}
	 	
	 	
	
