package com.kth.sda.team.integration;

/**
 * The costumer credit card information.
 * @author tmpuser-10213
 *
 */
public class CreditCardDTO {
	
	private String cardNumber, cardHolder,pin,cvc;
	private int expirationDate;
	/**
	 *  The constructor of the class that will create the creditCardDTO object.
	 * @param pin The credit card pin code.
	 * @param cvc The credit card cvc code.
	 * @param cardNumber The credit card card number.
	 * @param cardHolder The credit card holder name.
	 * @param expiratinDate The credit card expiration date.
	 */
	public CreditCardDTO(String pin,String cvc,String cardNumber,String cardHolder,int expirationDate){
		this.pin = pin;
		this.cvc = cvc;
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.expirationDate = expirationDate;
	}
	
	/**
	 *  Get the costume's credit card pin.
	 * @return pin The credit card pin code
	 */
	public String getPin(){
		return pin;
	}
	/**
	 * Get the costume's credit card Number.
	 * @return cardNumber The credit card card number. 
	 */
	public String getNumber(){
		return cardNumber;
	}
	/**
	 * Get the costume's credit card Holder name.
	 * @return cardHolder The credit card holder name.
	 */
	public String getHolder(){
		return cardHolder;
	}
	/**
	 * Get the costume's credit card CVC.
	 * @return cvc The credit card cvc code.
	 */
	public String getCVC(){
		return cvc;
	}
	/**
	 * Get the costume's credit card Expiration Date.
	 * @return expirationDate  The credit card expiration date.
	 */
	public int getExpirationDate(){
		return expirationDate;
	}
}
