import java.util.Scanner;

	public class Account{
	
		public static void main(String[] agrs){
		
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("balance; (annualInterest/1200); ");
	double balance= scanner.nextDouble();
	double annualInsterestRate = scanner.nextDouble (); 
	
	double interest = balance * (annualInsterestRate/1200);
	
	System.out.printf (" The insterest %f ", interest );
	
	}
	
}
