package com.kth.sda.team.integration;
import java.util.ArrayList;

/**
 * The database for the list of the inspections. 
 * @author tmpuser-10213
 *
 */
public class InspectionRegistry {
	private InspectionDTO inspectionDTO = null;
	private ArrayList<InspectionDTO> inspectionList;
	
	/**
	 * The constructor will initialize the inspection database which include the license number and the cost of the inspection.
	 */
	public InspectionRegistry(){
		inspectionList = new ArrayList<InspectionDTO>();
		InspectionDTO newInspection = new InspectionDTO("126",55);
		InspectionDTO newInspection1 = new InspectionDTO("127",56);
		InspectionDTO newInspection2= new InspectionDTO("128",66);
		InspectionDTO newInspection3 = new InspectionDTO("129",87);
		InspectionDTO newInspection4 = new InspectionDTO("130",99);
		InspectionDTO newInspection5 = new InspectionDTO("131",21);
		inspectionList.add(newInspection);
		inspectionList.add(newInspection1);
		inspectionList.add(newInspection2);
		inspectionList.add(newInspection3);
		inspectionList.add(newInspection4);
		inspectionList.add(newInspection5);
	}
	/**
	 * This method will search for a license number in the database and return the cost of the inspection.
	 * @param searchedInspection The inspection that we want to look for in the database.
	 * @return inspectionDTO The inspection car that is exist in the database
	 *         null If inspection was not found. 
	 */
	public InspectionDTO searchMatching(InspectionDTO searchedInspection){
		
		for(InspectionDTO inspectionItem : inspectionList){
			if(inspectionItem.getLicenseNumber().equals(searchedInspection.getLicenseNumber()))
			{
				inspectionDTO=inspectionItem;
				System.out.println("The car license number is: "+inspectionDTO.getLicenseNumber());
				System.out.println("The inspection cost is: "+inspectionDTO.getCost());
				return inspectionDTO;
			}
		}
		System.out.println("No License founded.");
		return inspectionDTO;
	}
}
