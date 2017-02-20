package com.kth.sda.team.integration;
/**
 * This class will create an object of an inspection car. 
 * @author tmpuser-10213
 *
 */
public class InspectionDTO {
	private String licenseNumber;
	private int cost;
	/**
	 * The constructor will create an object of the inspection car.
	 * @param licenseNumber The car license number.
	 * @param cost The cost of the inspection of the car that hold this license number
	 */
	public InspectionDTO(String licenseNumber, int cost){
		this.licenseNumber = licenseNumber;
		this.cost = cost;
	}
	/**
	 * This constructor will be used when the inspector is trying to find the cost of the inspection for a specific license number.
	 * @param licenseNumber The license number that the inspector will search for in the database.
	 */
	public InspectionDTO(String licenseNumber){
		this.licenseNumber = licenseNumber;
	}
	/**
	 * Get license number for a car.
	 * @return licenseNumber The car license number.
	 */
	public String getLicenseNumber(){
		return licenseNumber;
	}
	/**
	 * Get cost for a car.
	 * @return cost The inspection cost.
	 */
	public int getCost(){
		return cost;
	}
}
