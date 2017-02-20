package com.kth.sda.team.view;

import com.kth.sda.team.controller.InspectionController;

/**
 * The view of the inspection.
 * @author tmpuser-10229
 *
 */
public class View {
	
	//PaymentController paymentController;
	InspectionController inspectionController;
	/**
	 * The main view for the Inspection.
	 * @param inspectionController
	 */
	public View(InspectionController inspectionController) {
		InspectionView inspectionView =new InspectionView(inspectionController);
		}

}
