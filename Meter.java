import java.util.Scanner;

	public class Meter{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.print ("Enter a vaule for feet: ");
	
	double feet= scanner.nextDouble();
	
	double meter = feet *0.305;
	

	System.out.printf("meter is %.4f%n" , meter);
  
  }

}	




