package com.kth.sda.team.integration;

import java.util.ArrayList;

/**
 * The External authorization system to check the credit card of the costumer.
 * @author tmpuser-10213
 *
 */
public class ExternalPaymentAuthorizationSystem {
	private ArrayList<CreditCardDTO> crediteCardList;
	private boolean status= false; 
	/**
	 * The constructor that will initialize the external payment authorization System database.  
	 */
	public ExternalPaymentAuthorizationSystem(){
		crediteCardList = new ArrayList<>();
		CreditCardDTO creditCardDTO1 = new CreditCardDTO("1234", "123", "123456789", "Alaa",1234);
		CreditCardDTO creditCardDTO2 = new CreditCardDTO("1235", "123", "123456790", "Ahmad",1234);
		CreditCardDTO creditCardDTO3 = new CreditCardDTO("1236", "123", "123456791", "Said",1234);
		CreditCardDTO creditCardDTO4 = new CreditCardDTO("1237", "123", "123456792", "Tom",1234);
		CreditCardDTO creditCardDTO5 = new CreditCardDTO("1238", "123", "123456793", "Hecham",1234);
		crediteCardList.add(creditCardDTO1);
		crediteCardList.add(creditCardDTO2);
		crediteCardList.add(creditCardDTO3);
		crediteCardList.add(creditCardDTO4);
		crediteCardList.add(creditCardDTO5);
	}
	/**
	 * This method will check if the credit card is valid or not.
	 * @param creditCardDTO The credit card object that we want to check its information.
	 * @return true If the External Payment Authorization System has the information about the credit card.
	 *         false If the External Payment Authorization System doesn't have the information about the credit card.
	 */
	public boolean request(CreditCardDTO creditCardDTO){
		for(CreditCardDTO creditCard:crediteCardList){
			if(creditCard.getNumber().equals(creditCardDTO.getNumber())){
				creditCard = creditCardDTO;
				status = true;
				return status;
			}
		}
		return status;
	}
}
