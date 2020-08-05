package gitpacktest ;
import java.util.Scanner ;

public class On20200805Simply {

	public static void main(String[] args) {

		int varNum = 0 ;
		Scanner scnGetUserIp = new Scanner (System.in) ;

		try {
			System.out.println("This program demonstrates try - catch exception in Java.") ;
			System.out.println("Please enter an integer") ;
			varNum = scnGetUserIp.nextInt() ;
			System.out.println("Value you entered was: " + varNum) ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.") ;
		} catch (Exception e) {
			System.out.println("Sorry, value you entered was not an integer.") ;
			System.out.println("This program will stop now. Please click on RUN to re-execute it.") ;
			System.out.println("Next time please enter an integer.") ;
			System.exit(-1);
		}
		scnGetUserIp.close() ;
	}

}