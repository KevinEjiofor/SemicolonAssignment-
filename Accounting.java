import java.util.Scanner;

	public class Accounting{
	
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter the first integar: ");
	int x = input.nextInt();
	
	System.out.print("Enter the second integar: ");
	int  y = input.nextInt();
	
	System.out.print("Enter the third integar: ");
	int  z = input.nextInt();
	
	
	int total= (x*y*z );
	
	System.out.printf("Product %d%n", total);
	
	}

}
	
