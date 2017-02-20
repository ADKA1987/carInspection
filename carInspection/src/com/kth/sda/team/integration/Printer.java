package com.kth.sda.team.integration;

import java.util.List;

/**
 * The printer class will simulate the printer role in the program. 
 * @author tmpuser-10213
 *
 */
public class Printer {
	/**
	 * The Printer class constructor. 
	 */
	public Printer(){
		
	}
	
	/**
	 * The method will print out the receipt for the costumer.
	 * @param paymentStatus To get the payment status if it is done or not.
	 * @param creditCardDTO To get the credit card's Holder name.
	 * @param amount The amount of the money that the costumer will pay.
	 */
	public void printReceipt(boolean paymentStatus,CreditCardDTO creditCardDTO,int amount){
		if(paymentStatus){
			System.out.println("\n**********************Receipt*************************");
			System.out.println("The amount of the inspection for the car is: "+amount+" paied by "+ creditCardDTO.getHolder());
			System.out.println("******************************************************\n");
		}
	}
	
	/**
	 * Print out the inspections list. 
	 * @param inspections The list of the inspection that will be printed out.
	 */
		
	public void printResultInspection(List<InspectionCheckListDTO> inspections){
		System.out.println(inspections);
	}
}
