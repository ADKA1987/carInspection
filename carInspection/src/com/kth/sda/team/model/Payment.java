package com.kth.sda.team.model;

import com.kth.sda.team.integration.CreditCardDTO;
import com.kth.sda.team.integration.ExternalPaymentAuthorizationSystem;
import com.kth.sda.team.integration.Printer;
/**
 * 
 * @author tmpuser-10213
 *
 */
public class Payment {
	
	private int amount;
	private	ExternalPaymentAuthorizationSystem externalPaymentAuthSys;
	private Printer printer;
	
	/**
	 *  Print out the receipt for the costumer.
	 * @param creditCardDTO To get the credit card information and pass it to the  External Payment Authorization System
	 * @param amount The amount of the payment that the costumer will pay.
	 */
	public void pay(CreditCardDTO creditCardDTO,int amount){
		this.amount = amount;
		externalPaymentAuthSys = new ExternalPaymentAuthorizationSystem();
		printer = new Printer();
		if(externalPaymentAuthSys.request(creditCardDTO)){
			printer.printReceipt(true, creditCardDTO, amount);
		}else{
			System.out.println("The Credite card is not valid:");
		}
	}
}
