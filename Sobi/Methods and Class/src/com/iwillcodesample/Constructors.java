package com.iwillcodesample;

public class Constructors {
	private String place;
	private int distance;
	private String transport ;

	// Default stuff - constructor
	// has access modifier, name - nameOfTheClass (compulsory), arguments - optional
	public Constructors() {
		place = "Nagercoil";
		distance = 650;
		transport = "flight";
	}

	// Non-default constructor
	public Constructors (String myplace, int mydistance, String mytransport) {
		place = myplace;
		distance = mydistance;
		transport = mytransport;
	}

	public String getplace() {
		return this.place;
	}

	public int getdistance() {
		return this.distance;
	}

	public String gettransport() {
		return this.transport;
	}
}
