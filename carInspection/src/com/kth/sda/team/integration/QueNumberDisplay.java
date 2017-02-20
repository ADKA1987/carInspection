package com.kth.sda.team.integration;
/**
 * The display for the customer number that will be shown outside of the garage door.
 * @author tmpuser-10229
 *
 */
public class QueNumberDisplay {
	private int number;
	/**
	 * Show the number on the display.
	 * @param number
	 */
	public QueNumberDisplay(int number) {
		this.number = number;
	}

	/**
	 * Increase the number on display on the display and open the garage door
	 * @return void
	 */
	public int increment() {
		int tmpNumber = ++this.number;
		System.out.println("Costumer number: "+ getNumber());
		GarageDoor garageDoor = new GarageDoor();
		garageDoor.open();
		return tmpNumber;
	}
/**
 *  Get the display number. 
 * @return number The shown number on the display.
 */
	public int getNumber() {
		return number;
	}

}
