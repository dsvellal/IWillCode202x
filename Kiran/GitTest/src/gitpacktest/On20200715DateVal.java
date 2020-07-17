package gitpacktest;
import java.util.Scanner;

public class On20200715DateVal {

	public static void main(String[] args) {
		int varDate, varMonth, varYear = 0 ;
		Scanner scnUser = new Scanner (System.in) ;
		
		System.out.println("This is a date checking program.");
	
		System.out.println("Please enter the date. Please enter integers only.");
		varDate = scnUser.nextInt();
		if ((varDate<1) || (varDate>31)) {
			System.out.println("Sorry, the date you entered is invalid.") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(0);
		}
		
		System.out.println("Please enter the month. Please enter integers only.");
		varMonth = scnUser.nextInt();
		if ((varMonth<0) || (varMonth>12)) {
			System.out.println("Sorry, the month you entered is invalid.") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(0);
		}
		if ((varMonth == 2) || (varMonth == 4) || (varMonth == 6) || (varMonth == 9) || (varMonth == 11) ){
			if (varDate > 30) {
				System.out.println("Sorry, month number " + varMonth + " does not have 31 days !");
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(0);
				}
						
			if ((varMonth == 2) && (varDate > 29)) {
				System.out.println("Sorry, February can have only 29 days, maximum !") ;
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(0);
			}
		}
		
		System.out.println("Please enter the year. Please enter integers only.");
		varYear = scnUser.nextInt();
		if ((varYear % 4 == 0) || (varYear %400 == 0)) {
			if ((varMonth == 2) && (varDate > 29)) {
				System.out.println("Sorry, February can have only 29 days, maximum !") ;
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(0);
			}
			
		}
		else if ((varMonth == 2) && (varDate > 28)) {
			System.out.println ("Sorry, in a non-leap year, February can have only 28 days, maximum !") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(0);
		}
		System.out.println("Thanks go to you for entering a valid date !");
		scnUser.close();
	}
}