import java.util.Scanner;

	public class SolutionJ{	
		
		public static void main(String[] args){
		
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter firstNumber: ");
	int firstNumber = input.nextInt();
	int square=  firstNumber * firstNumber; 
	int sum =  square + firstNumber;
	
	if ( firstNumber > 100);
		System.out.printf("%d > %d%n", sum, 100);
		
	if (firstNumber < 100);
		System.out.printf("%d < %d%n", sum, 100);
		
	if (firstNumber == 100);
		System.out.printf("%d == %d%n", sum, 100);
		
	if (firstNumber != 100);
		System.out.printf("%d != %d%n", sum, 100);
		
		}
	}
		
		
