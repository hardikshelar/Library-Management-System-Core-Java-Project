import java.util.Scanner;

public class leap_yeap {
	
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Please enter the year to check whether it is leap or not : ");
		int year=myInput.nextInt();
//		int[] leapYears = {400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000};
//		int count=0;
//		for (int i = 0; i < leapYears.length; i++) {
			if(year%400==0 && year%100==0 ) {
				System.out.println("Leap Year");	
		}
			else if(year%100!=0 && year%4==0){
			System.out.println("Leap year");
		}
		else if(year%100==0 && year%4==0) {
			System.out.println("Leap year");
		}
		
		else {
			System.out.println("Not Leap year");
		}
		
	}

}
