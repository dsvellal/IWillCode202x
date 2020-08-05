package gitpacktest;
import java.util.Scanner;

// This program checks if the date, month and year entered in that order are correct.
// In version 1, program did nothing if the date was correct.
// Based on feedback from Kala, if valid date is entered, message is shown in version 2.
// Date check for 0 was corrected based on feedback from Kala.

public class On20200715DateVal {

	public static void main(String[] args) {
		int varDate = 0 ;
		int varMonth = 0 ; 
		int varYear = 0 ;
		Scanner scnUser = new Scanner (System.in) ;
		
		System.out.println("This is a date checking program.");
		
		try {
			System.out.println("Please enter the date. Please enter integers only.");
			varDate = scnUser.nextInt();
			if ((varDate<1) || (varDate>31)) {
				System.out.println("Sorry, the date you entered is invalid.") ;
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Sorry, date cannot be a non-integer.") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(1);
		}
		
		
		try {
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
		} catch (Exception e) {
				System.out.println("Sorry, month cannot be a non-integer.") ;
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(1);
			}
		
<<<<<<< HEAD
		try {
			System.out.println("Please enter the year. Please enter integers only.");
			varYear = scnUser.nextInt();
			
=======
		System.out.println("Please enter the year. Please enter integers only.");
		varYear = scnUser.nextInt(); //On compilation I get an Exception in thread and this is the line number indicated.
>>>>>>> af3b00c5000aad378ee27f3c83322a693ae23a5d
			if ((varMonth == 2) && (varDate > 29)) {
				System.out.println("Sorry, February can have only 29 days, maximum !") ;
				System.out.println("This program will stop now. Please click on RUN to re-execute it.");
				System.exit(0);
			}
		else if ((varMonth == 2) && (varDate > 28)) {
			System.out.println ("Sorry, in a non-leap year, February can have only 28 days, maximum !") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Sorry, year cannot be a non-integer.") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.");
			System.exit(1);
		}
		System.out.println("Thanks go to you for entering a valid date !");
		scnUser.close();
	}
}