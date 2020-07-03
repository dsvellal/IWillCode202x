package com.blueheart;

public class MyFirstClass {

	public static void main(String[] args) {
		// Conditional Statement
		/* If I have worked out for last three day, it is a recovery today */

		final boolean isTodayRecoveryDay = false;
		final boolean isTodayCardioDay = false;
		if(isTodayRecoveryDay) {
			System.out.println("Today is Recovery Day");
		}
		else {
			System.out.println("Today is Workout Day");
			if(isTodayCardioDay) {
				System.out.println("Today is Cardio Workout");
			}
			else {
				System.out.println("Today is Strength and Conditioning Workout");
			}
		}
	}
}
