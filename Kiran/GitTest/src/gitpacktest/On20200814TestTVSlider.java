package gitpacktest;
import java.util.Scanner ;

public class On20200814TestTVSlider {

	public static void main(String[] args) {
		int vSliderIncorDec = 0 ; // This is the increase or decrease in volume
		int vWhattoChange = 0 ;
		Scanner scnUserVal = new Scanner(System.in) ; // This is the user entered value for increase or decrease
		
		On20200814TVSlider clsVolSlider = new On20200814TVSlider() ;

		try {
			System.out.println("Please enter the number of the attribute you want to modify from the list below. For example: enter 1 to change the volume.") ;
			System.out.println("1. Volume") ;
			System.out.println("2. Contrast") ;
			System.out.println("3. Brighntess") ;
			System.out.println("4. Colour") ;
			System.out.println("5. Sharpness") ;
			
			vWhattoChange = scnUserVal.nextInt() ;
			if ((vWhattoChange < 1) || (vWhattoChange >5)) {
				System.out.println("Sorry, an invalid value was entered. This program will end now.") ;
				System.exit(-1) ;
			} 
		} /* This is the end of the try block */ catch (Exception e) {
			System.out.println("Sorry, an invalid value was entered. This program will end now.") ;
			System.exit(-1);
		} // This is the end of the catch block.
		
		try {
			System.out.println("How much do you want to increase/ decrease ? Maximum is 50. Minimum is -50.") ;
			vSliderIncorDec = scnUserVal.nextInt();
			if ((vSliderIncorDec > 50) || (vSliderIncorDec < -50)) {
				System.out.println("Sorry, value is beyond the limits. This program will end now.") ;
				System.exit(-1);
			} // This is the end of the if block.
		} /* This is the end of the try block */ catch (Exception e) {
			System.out.println("Sorry, an invalid value was entered. This program will end now.") ;
			System.exit(-1);
		} // This is the end of the catch block.

		clsVolSlider.getUpdatedVal(vWhattoChange, vSliderIncorDec) ;
		
	} //This is for main.
} // This is for the class.