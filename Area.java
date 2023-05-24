import java.util.Scanner;

	public class Area{
	public static void main(String[] args){
	 Scanner scanner= new Scanner(System.in);
	 
	 System.out.print("Enter radius of a circle: ");
	  double radius= scanner.nextDouble ();
	  
	double perimeter = 2 * radius * 3.14159;
	
	System.out.println ( "The perimeter" + perimeter);
	
	}
}
