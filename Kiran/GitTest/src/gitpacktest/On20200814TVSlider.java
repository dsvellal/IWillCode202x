package gitpacktest;

public class On20200814TVSlider {
	
	public On20200814TVSlider () { //This is a constructor so that all sliders are initialised.
		int vSlider = 40 ; //Slider ranges from 0 to 100. Value of 40 is set as default.
	}
	
	public int getIncorDecVal (int vRecdValue) {
		int vSlider = 50 ; //Why isn't the 50 in the constructor taken in this method if this line is not there?
		vSlider = vSlider + vRecdValue ;
		System.out.println("The new value of the attribute is : " + vSlider) ;
		return vSlider ;
	}
}