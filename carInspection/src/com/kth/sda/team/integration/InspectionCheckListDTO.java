package com.kth.sda.team.integration;
/**
 * This class will create an object from the entered values.
 * @author tmpuser-10213
 *
 */
public class InspectionCheckListDTO {
	private boolean result;
	private String operation;
	/**
	 * The class constructor.   
	 * @param result The result after the operation is finished.
	 * @param operation The operation that the inspector will operate,
	 */
	public InspectionCheckListDTO(boolean result,String operation){
		this.result = result;
		this.operation = operation;
	}
	/**
	 * Get the operation result.
	 * @return
	 */
	public boolean getResult(){
		return result;
	}
	/**
	 * Get the operation that the inspector will operate.
	 * @return
	 */
	public String getOperation(){
		return operation;
	}
	/**
	 * Set the result of the operation (this method implemented because we don't have GUI)
	 * @param result The operation result that we want to insert.
	 * @return true If the car passed the operation.
	 * 		   false If the car didn't pass the operation.
	 */
	
	public boolean setResult(boolean result){
		return this.result=result;
	}
	
	/**
	 * implement the toString method to print out the final result of the inspection. 
	 */
	public String toString(){
		return "Operation= "+this.getOperation()+" Result= "+getResult()+"\n";
	}
}
