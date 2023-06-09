package com.siretmicroservice.siretmicroservicebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AdresseEtablissement {

    private String complementAdresseEtablissement;
    private String numeroVoieEtablissement;
    private String indiceRepetitionEtablissement;
    private String typeVoieEtablissement;
    private String libelleVoieEtablissement;
    private String codePostalEtablissement;
    private String libelleCommuneEtablissement;
    private String libelleCommuneEtrangerEtablissement;
    private String distributionSpecialeEtablissement;
    private String codeCommuneEtablissement;
    private String codeCedexEtablissement;
    private String libelleCedexEtablissement;
    private String codePaysEtrangerEtablissement;
    private String libellePaysEtrangerEtablissement;


    public String getComplementAdresseEtablissement() {
        return complementAdresseEtablissement;
    }

    public void setComplementAdresseEtablissement(String complementAdresseEtablissement) {
        this.complementAdresseEtablissement = complementAdresseEtablissement;
    }

    public String getNumeroVoieEtablissement() {
        return numeroVoieEtablissement;
    }

    public void setNumeroVoieEtablissement(String numeroVoieEtablissement) {
        this.numeroVoieEtablissement = numeroVoieEtablissement;
    }

    public String getIndiceRepetitionEtablissement() {
        return indiceRepetitionEtablissement;
    }

    public void setIndiceRepetitionEtablissement(String indiceRepetitionEtablissement) {
        this.indiceRepetitionEtablissement = indiceRepetitionEtablissement;
    }

    public String getTypeVoieEtablissement() {
        return typeVoieEtablissement;
    }

    public void setTypeVoieEtablissement(String typeVoieEtablissement) {
        this.typeVoieEtablissement = typeVoieEtablissement;
    }

    public String getLibelleVoieEtablissement() {
        return libelleVoieEtablissement;
    }

    public void setLibelleVoieEtablissement(String libelleVoieEtablissement) {
        this.libelleVoieEtablissement = libelleVoieEtablissement;
    }

    public String getCodePostalEtablissement() {
        return codePostalEtablissement;
    }

    public void setCodePostalEtablissement(String codePostalEtablissement) {
        this.codePostalEtablissement = codePostalEtablissement;
    }

    public String getLibelleCommuneEtablissement() {
        return libelleCommuneEtablissement;
    }

    public void setLibelleCommuneEtablissement(String libelleCommuneEtablissement) {
        this.libelleCommuneEtablissement = libelleCommuneEtablissement;
    }

    public String getLibelleCommuneEtrangerEtablissement() {
        return libelleCommuneEtrangerEtablissement;
    }

    public void setLibelleCommuneEtrangerEtablissement(String libelleCommuneEtrangerEtablissement) {
        this.libelleCommuneEtrangerEtablissement = libelleCommuneEtrangerEtablissement;
    }

    public String getDistributionSpecialeEtablissement() {
        return distributionSpecialeEtablissement;
    }

    public void setDistributionSpecialeEtablissement(String distributionSpecialeEtablissement) {
        this.distributionSpecialeEtablissement = distributionSpecialeEtablissement;
    }

    public String getCodeCommuneEtablissement() {
        return codeCommuneEtablissement;
    }

    public void setCodeCommuneEtablissement(String codeCommuneEtablissement) {
        this.codeCommuneEtablissement = codeCommuneEtablissement;
    }

    public String getCodeCedexEtablissement() {
        return codeCedexEtablissement;
    }

    public void setCodeCedexEtablissement(String codeCedexEtablissement) {
        this.codeCedexEtablissement = codeCedexEtablissement;
    }

    public String getLibelleCedexEtablissement() {
        return libelleCedexEtablissement;
    }

    public void setLibelleCedexEtablissement(String libelleCedexEtablissement) {
        this.libelleCedexEtablissement = libelleCedexEtablissement;
    }

    public String getCodePaysEtrangerEtablissement() {
        return codePaysEtrangerEtablissement;
    }

    public void setCodePaysEtrangerEtablissement(String codePaysEtrangerEtablissement) {
        this.codePaysEtrangerEtablissement = codePaysEtrangerEtablissement;
    }

    public String getLibellePaysEtrangerEtablissement() {
        return libellePaysEtrangerEtablissement;
    }

    public void setLibellePaysEtrangerEtablissement(String libellePaysEtrangerEtablissement) {
        this.libellePaysEtrangerEtablissement = libellePaysEtrangerEtablissement;
    }

    //Method to get Full adress and return string
    public String getFullAdress() {
        return
            " " + (this.complementAdresseEtablissement == null ? "" : this.complementAdresseEtablissement) +
            " " + (this.numeroVoieEtablissement == null ? "" : this.numeroVoieEtablissement) +
            " " + (this.indiceRepetitionEtablissement == null ? "" : this.indiceRepetitionEtablissement) +
            " " + (this.typeVoieEtablissement == null ? "" : this.typeVoieEtablissement) +
            " " + (this.libelleVoieEtablissement == null ? "" : this.libelleVoieEtablissement) +
            " " + (this.codePostalEtablissement == null ? "" : this.codePostalEtablissement) +
            " " + (this.libelleCommuneEtablissement == null ? "" : this.libelleCommuneEtablissement) +
            " " + (this.libelleCommuneEtrangerEtablissement == null ? "" : this.libelleCommuneEtrangerEtablissement) +
            " " + (this.distributionSpecialeEtablissement == null ? "" : this.distributionSpecialeEtablissement) +
            " " + (this.codeCommuneEtablissement == null ? "" : this.codeCommuneEtablissement) +
            " " + (this.codeCedexEtablissement == null ? "" : this.codeCedexEtablissement) +
            " " + (this.libelleCedexEtablissement == null ? "" : this.libelleCedexEtablissement) +
            " " + (this.codePaysEtrangerEtablissement == null ? "" : this.codePaysEtrangerEtablissement) +
            " " + (this.libellePaysEtrangerEtablissement == null ? "" : this.libellePaysEtrangerEtablissement);
    }
}
