package gitpacktest;

import java.util.Scanner;

public class On20201028GetTwoVals {
	public static int GetOneIp () {
		int vNum3 = 0;
		System.out.println("Please enter an integer.");
		final Scanner ScnGetOneIp = new Scanner(System.in);
		vNum3 = ScnGetOneIp.nextInt();
		ScnGetOneIp.close();
		System.out.println("The value you entered is: "+vNum3);
		return (vNum3);
	}

	public static void main(String[] args) {
		int vNum4 = 0;
		int vNum5 = 0;
		
		System.out.println("Method GetOneIp shall be called.");
		vNum4 = GetOneIp();
		System.out.println("Method GetOneIp has been called.");
		vNum4 = vNum4 + 0; //This is used to remove the warning that local variable is not used.
		
		System.out.println("Method GetOneIp shall be called.");
		vNum5 = GetOneIp(); //Program crashes the moment I call the method twice.
		System.out.println("Method GetOneIp has been called.");
		vNum5 = vNum5 + 0; //This is used to remove the warning that local variable is not used.
	} //This is for main.

}// This is for On20201028GetTwoVals