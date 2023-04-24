package com.siretmicroservice.siretmicroservicebackend.model;

public class ResponseModel {
    private Header header;
    private Etablissement etablissement;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
}
