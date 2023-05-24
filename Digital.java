import java.util.Scanner;

	public class Digital{
	
		public static void main(String[] args){
	
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter a number between 0 to 100: ");
	
	int number=scanner.nextInt();
	int sumofNumber= (number %10)+((number/10)%10)+((number/100)%10);
	
	System.out.printf("The sum of the digital is %d%n" , sumofNumber);
	
	}

}
