package com.siretmicroservice.siretmicroservicebackend.service;

import com.opencsv.CSVWriter;
import com.siretmicroservice.siretmicroservicebackend.model.ResponseModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class GetFromAPIws {
    private RestTemplate restTemplate = new RestTemplate();

    //I get API informations from php API that I create (in cloud) to avoid HTTPS SSL error
    //The php
    private String url = "http://localhost/test_API.php";

    //Get all the information and return a STRING
    public String getOneEtablissementString(String siretNumber) {
        String donnees = this.restTemplate.getForObject(this.url + "?siret=" + siretNumber, String.class);
        return donnees;
    }

    //Get all the information and return a JSON
    public ResponseModel getOneEtablissement(String siretNumber) {
        ResponseModel donnees = this.restTemplate.getForObject(this.url + "?siret=" + siretNumber, ResponseModel.class);
        return donnees;
    }

    //Get specific information and return a STRING
    public String getSpecificInformations(String siretNumber) {

        ResponseModel donnees = this.restTemplate.getForObject(this.url + "?siret=" + siretNumber, ResponseModel.class);


        String siret = donnees.getEtablissement().getSiret();
        String nic = donnees.getEtablissement().getNic();
        String fullAdresseComplet = donnees.getEtablissement().getAdresseEtablissement().getFullAdress();
        String fullAdresseComplet2 = donnees.getEtablissement().getAdresse2Etablissement().getFullAdress();
        String creationDate = donnees.getEtablissement().getDateCreationEtablissement();
        String fullName = donnees.getEtablissement().getUniteLegale().getDenominationUniteLegale();

        return
                "SIRET : " + siret + "\n" +
                        "NIC : " + nic + "\n" +
                        "FULL ADRESS : " + fullAdresseComplet + " " + fullAdresseComplet2 + "\n" +
                        "CREATION DATE : " + creationDate + "\n" +
                        "FULL NAME : " + fullName
                ;
    }

    //Get specific information and save it in CSV File
    public String saveSpecificInformations(String siretNumber) {

        ResponseModel donnees = this.restTemplate.getForObject(this.url + "?siret=" + siretNumber, ResponseModel.class);

        String siret = donnees.getEtablissement().getSiret();
        String nic = donnees.getEtablissement().getNic();
        String fullAdresseComplet = donnees.getEtablissement().getAdresseEtablissement().getFullAdress();
        String fullAdresseComplet2 = donnees.getEtablissement().getAdresse2Etablissement().getFullAdress();
        String creationDate = donnees.getEtablissement().getDateCreationEtablissement();
        String fullName = donnees.getEtablissement().getUniteLegale().getDenominationUniteLegale();

        //Save the file in variable by rows
        String CSV_FILE_PATH = "companiesInformations.csv";
        String[] rowDataToInsert = {
                siret, nic, (fullAdresseComplet + fullAdresseComplet2), creationDate, fullName
        };
        ArrayList<String[]> allDataToInsert = new ArrayList<String[]>();
        allDataToInsert.add(rowDataToInsert);

        //Save the file in file by rows
        try {
            FileWriter fileWriter = new FileWriter(CSV_FILE_PATH, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            csvWriter.writeAll(allDataToInsert);
            csvWriter.close();
            return "SAVED SUCCESSFULLY";
        } catch (IOException e) {
            return "Error";
        }
    }
}
