package com.kth.sda.team.startup;

import com.kth.sda.team.controller.InspectionController;
import com.kth.sda.team.integration.ExternalPaymentAuthorizationSystem;
import com.kth.sda.team.integration.GarageDoor;
import com.kth.sda.team.integration.InspectionCheckListDTO;
import com.kth.sda.team.integration.InspectionRegistry;
import com.kth.sda.team.integration.Printer;
import com.kth.sda.team.integration.QueNumberDisplay;
import com.kth.sda.team.view.View;


/**
 * The Main class for car inspection 
 * @author Team ABIH
 *
 */
public class Main {
	private static boolean result= false;
	private static String operation="";

/**
 * The start method for the car inspection project.
 * @param args
 */
	public static void main(String args[]){
		
		InspectionRegistry inspectionRegistry=new InspectionRegistry();
		InspectionCheckListDTO inspectionChecklistDto=new InspectionCheckListDTO(result, operation);
		QueNumberDisplay displaynumber = new QueNumberDisplay(0);
		GarageDoor garageDoor=new GarageDoor();
		ExternalPaymentAuthorizationSystem authSystemOfPayment=new ExternalPaymentAuthorizationSystem();
		Printer printer = new Printer();



		InspectionController inspectionController=new InspectionController(inspectionChecklistDto,inspectionRegistry,displaynumber,
				printer,authSystemOfPayment,garageDoor);



		View newView = new View(inspectionController);	
		
	}
}
