package gitpacktest;

public class On20200814TVSlider {
	private int vSlider ;
	
	public On20200814TVSlider () { //This is a constructor so that all sliders are initialised.
		vSlider = 50 ; //Slider ranges from 0 to 100. Value of 50 is set as default.
		//Separate declaration from initialisation.
		//Declaration is outside the constructor.
		//Initialisation is in the constructor.
	}
	
	public void getUpdatedVal (int vAttrib, int vRecdValue) {
		if (vAttrib == 1) {
			System.out.println("The default value of VOLUME is : " + vSlider) ;
			vSlider = vSlider + vRecdValue ;
			System.out.println("The new value of VOLUME is : " + vSlider) ;
		} // end of if
		if (vAttrib == 2) {
			System.out.println("The default value of CONTRAST is : " + vSlider) ;
			vSlider = vSlider + vRecdValue ;
			System.out.println("The new value of CONTRAST is : " + vSlider) ;
		} // end of if
		if (vAttrib == 3) {
			System.out.println("The default value of BRIGHTNESS is : " + vSlider) ;
			vSlider = vSlider + vRecdValue ;
			System.out.println("The new value of BRIGHTNESS is : " + vSlider) ;
		} // end of if
		if (vAttrib == 4) {
			System.out.println("The default value of COLOUR is : " + vSlider) ;
			vSlider = vSlider + vRecdValue ;
			System.out.println("The new value of COLOUR is : " + vSlider) ;
		} // end of if
		if (vAttrib == 5) {
			System.out.println("The default value of SHARPNESS is : " + vSlider) ;
			vSlider = vSlider + vRecdValue ;
			System.out.println("The new value of SHARPNESS is : " + vSlider) ;
		} // end of if
	}// end of getUpdatedVal
} //end of On20200814TVSlider