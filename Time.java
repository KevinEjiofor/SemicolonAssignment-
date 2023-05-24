import java.util.Scanner;

	public class Time{
	public static void main(String[] args){
	
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Enter the number of mintues: ");
	
	long  minutes= scanner.nextLong () ;
	long  minutesPerDay= 24*60;
	long  minutesPerYear= minutesPerDay*365;
	long years= minutes / minutesPerYear;
	long remainingMinutes = minutes % minutesPerYear;
	long days = remainingMinutes / minutesPerDay;
	
	System.out.println(minutes + "mintues is approximately" + years + "years and " + days +" days." );
	

	
	}

}
	
	
