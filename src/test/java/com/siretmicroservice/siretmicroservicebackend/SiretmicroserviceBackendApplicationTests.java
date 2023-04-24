package com.siretmicroservice.siretmicroservicebackend;

import com.opencsv.CSVWriter;
import com.siretmicroservice.siretmicroservicebackend.controller.InformationController;
import com.siretmicroservice.siretmicroservicebackend.model.ResponseModel;
import com.siretmicroservice.siretmicroservicebackend.service.GetFromAPIws;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@SpringBootTest
class SiretmicroserviceBackendApplicationTests {
    //Service instance
    @Autowired
    private GetFromAPIws getFromAPIws = new GetFromAPIws();

    //Controller instance
    @Autowired
    private InformationController informationController = new InformationController();

    @Test
    void testService() {

        String t1 = getFromAPIws.getOneEtablissementString("31302979500017");

        String t2 = getFromAPIws.getOneEtablissement("31302979500017").toString();

        String t3 = getFromAPIws.getSpecificInformations("31302979500017");

        String t4 = getFromAPIws.saveSpecificInformations("31302979500017");

        System.out.println("TEST SERVICES\n \n");
        System.out.println("TEST REUSSI t1: \n" + t1 + "\n \n");
        System.out.println("TEST REUSSI t2: \n" + t2 + "\n \n");
        System.out.println("TEST REUSSI t3: \n" + t3 + "\n \n");
        System.out.println("TEST REUSSI t4: \n" + t4 + "\n \n");

    }

    @Test
    void testController() {

        String t1 = informationController.getOneEtablissement("31302979500017").toString();

        String t2 = informationController.getSpecificInformations("31302979500017");

        String t3 = informationController.saveSpecificInformations("31302979500017");

        System.out.println("TEST CONTROLLER\n \n");
        System.out.println("TEST REUSSI t1: \n" + t1 + "\n \n");
        System.out.println("TEST REUSSI t2: \n" + t2 + "\n \n");
        System.out.println("TEST REUSSI t3: \n" + t3 + "\n \n");
    }


}
