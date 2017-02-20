package com.kth.sda.team.controller;

import com.kth.sda.team.integration.*;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by tmpuser-10213 on 2/17/17.
 */
public class InspectionControllerTest {
    private InspectionController newController;
    private InspectionCheckListDTO inspectionChecklistDto;
    private InspectionRegistry inspectionRegistry;
    private QueNumberDisplay displayNumber;
    private Printer printer;
    private ExternalPaymentAuthorizationSystem externalauthSystemOfPayment;
    private GarageDoor garageDoor;
    private InspectionDTO found,inspectionDTO;

    @Before
    public void setUp() {
        InspectionCheckListDTO inspectionChecklistDto = new InspectionCheckListDTO(true,"op1");
        InspectionRegistry inspectionRegistry = new InspectionRegistry();
        QueNumberDisplay displayNumber= new QueNumberDisplay(0);
        Printer printer = new Printer();
        ExternalPaymentAuthorizationSystem externalauthSystemOfPayment = new ExternalPaymentAuthorizationSystem();
        GarageDoor garageDoor = new GarageDoor();
        InspectionDTO found = new InspectionDTO("",0);
        InspectionDTO inspectionDTO = new InspectionDTO("131");
        newController = new InspectionController(inspectionChecklistDto, inspectionRegistry,displayNumber,
        printer,  externalauthSystemOfPayment,  garageDoor);

    }

    @org.junit.Test
    public void startNewInspection() {

       int number= newController.startNewInspection();
        assertEquals(1,number);
        assertNotEquals(0,number);
        assertNotEquals(-1,number);

    }

    @org.junit.Test
    public void searchMatchingLicenseNo() {

        InspectionRegistry inspectionRegistry = new InspectionRegistry();
        InspectionDTO inspectionDTO = new InspectionDTO("131");
        InspectionDTO equaled = inspectionRegistry.searchMatching(inspectionDTO);

        assertEquals(inspectionDTO.getLicenseNumber(), equaled.getLicenseNumber());


        InspectionDTO inspectionDTO2 = new InspectionDTO("1313");
        InspectionDTO notEqualed = inspectionRegistry.searchMatching(inspectionDTO);

        assertNotEquals(inspectionDTO2.getLicenseNumber(), notEqualed.getLicenseNumber());
    }

    @org.junit.Test
    public void testCheckStatusOfPayment() {
        ExternalPaymentAuthorizationSystem externalPaymentAuthorizationSystem = new ExternalPaymentAuthorizationSystem();
        CreditCardDTO creditCardDTO = new CreditCardDTO("1234", "123","123456789", "Alaa", 1234);


        assertEquals(true,externalPaymentAuthorizationSystem.request(creditCardDTO));

        assertNotEquals(false,externalPaymentAuthorizationSystem.request(creditCardDTO));
    }


}
