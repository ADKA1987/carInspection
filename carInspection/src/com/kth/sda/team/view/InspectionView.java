package com.kth.sda.team.view;

import com.kth.sda.team.controller.InspectionController;
import com.kth.sda.team.integration.CreditCardDTO;
import com.kth.sda.team.integration.InspectionCheckListDTO;
import com.kth.sda.team.integration.InspectionDTO;
import com.kth.sda.team.model.Inspection;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author tmpuser-10229
 * 
 */
public class InspectionView {

	/**
	 *  
	 * @param inspectionController
	 */
	public InspectionView(InspectionController inspectionController) {


		inspectionController.startNewInspection();
		inspectionController.closeDoor();
		
		InspectionDTO inspectionDTO = new InspectionDTO("131");
		InspectionDTO found = inspectionController.searchMatchingLicenseNo(inspectionDTO);
		if(found != null){
			CreditCardDTO creditCardDTO = new CreditCardDTO("1234", "123","123456789", "Alaa", 1234);
			
			
			boolean status = inspectionController.checkStatusOfPayment(creditCardDTO);
			if (status) {
				
				inspectionController.payInspection(found, creditCardDTO);
				Inspection inspection = inspectionController.createInspectionfromDTO();
				List<InspectionCheckListDTO> inspections = inspection.getInspectionCheckList();
				Scanner scanner = new Scanner(System.in);

				int operationNumber = 0;
				boolean defaults = true;
				while ((defaults == true) && (operationNumber < inspections.size())) {
					String answer;
					do {
						System.out.println(inspections.get(operationNumber).getOperation()
								+ " please choose yes, no or exit");
						answer = scanner.next();
					} while ((answer.equals("yes") == false)
							&& (answer.equals("no") == false)
							&& (answer.equals("exit") == false));

					if (answer.equals("yes")) {
						System.out
								.println("would you like to check it or no! please enter true or false");
						boolean b = scanner.nextBoolean();
						inspections.get(operationNumber).setResult(b);
					}
					if (answer.equals("exit")) {
						defaults = false;
					}
					operationNumber++;
				}
				inspectionController.printResult(inspections);
				inspectionController.openDoor();
				inspectionController.closeDoor();
			} else {
				System.out.println("The CreditCard number is wrong.");
			}
		}
	}
}
