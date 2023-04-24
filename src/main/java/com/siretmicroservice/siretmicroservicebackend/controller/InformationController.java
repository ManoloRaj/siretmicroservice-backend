package com.siretmicroservice.siretmicroservicebackend.controller;

import com.siretmicroservice.siretmicroservicebackend.model.Etablissement;
import com.siretmicroservice.siretmicroservicebackend.model.ResponseModel;
import com.siretmicroservice.siretmicroservicebackend.service.GetFromAPIws;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("InformationController")
public class InformationController {


    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @GetMapping("/getOneEtablissement")
    public ResponseModel getOneEtablissement(@RequestParam String siretNumber) {
        GetFromAPIws fromAPIws = new GetFromAPIws();
        return fromAPIws.getOneEtablissement(siretNumber);
    }

    @GetMapping("/getSpecificInformations")
    public String getSpecificInformations(@RequestParam String siretNumber) {
        GetFromAPIws fromAPIws = new GetFromAPIws();
        return fromAPIws.getSpecificInformations(siretNumber);
    }

    @GetMapping("/saveSpecificInformations")
    public String saveSpecificInformations(@RequestParam String siretNumber) {
        GetFromAPIws fromAPIws = new GetFromAPIws();
        return fromAPIws.saveSpecificInformations(siretNumber);
    }
}
