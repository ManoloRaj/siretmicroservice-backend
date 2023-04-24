package com.siretmicroservice.siretmicroservicebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PeriodeEtablissement {


    private String dateFin;
    private String dateDebut;
    private String etatAdministratifEtablissement;
    private Boolean changementEtatAdministratifEtablissement;
    private String enseigne1Etablissement;
    private String enseigne2Etablissement;
    private String enseigne3Etablissement;
    private Boolean changementEnseigneEtablissement;
    private String denominationUsuelleEtablissement;
    private Boolean changementDenominationUsuelleEtablissement;
    private String activitePrincipaleEtablissement;
    private String nomenclatureActivitePrincipaleEtablissement;
    private Boolean changementActivitePrincipaleEtablissement;
    private String caractereEmployeurEtablissement;
    private Boolean changementCaractereEmployeurEtablissement;


    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getEtatAdministratifEtablissement() {
        return etatAdministratifEtablissement;
    }

    public void setEtatAdministratifEtablissement(String etatAdministratifEtablissement) {
        this.etatAdministratifEtablissement = etatAdministratifEtablissement;
    }

    public Boolean getChangementEtatAdministratifEtablissement() {
        return changementEtatAdministratifEtablissement;
    }

    public void setChangementEtatAdministratifEtablissement(Boolean changementEtatAdministratifEtablissement) {
        this.changementEtatAdministratifEtablissement = changementEtatAdministratifEtablissement;
    }

    public String getEnseigne1Etablissement() {
        return enseigne1Etablissement;
    }

    public void setEnseigne1Etablissement(String enseigne1Etablissement) {
        this.enseigne1Etablissement = enseigne1Etablissement;
    }

    public String getEnseigne2Etablissement() {
        return enseigne2Etablissement;
    }

    public void setEnseigne2Etablissement(String enseigne2Etablissement) {
        this.enseigne2Etablissement = enseigne2Etablissement;
    }

    public String getEnseigne3Etablissement() {
        return enseigne3Etablissement;
    }

    public void setEnseigne3Etablissement(String enseigne3Etablissement) {
        this.enseigne3Etablissement = enseigne3Etablissement;
    }

    public Boolean getChangementEnseigneEtablissement() {
        return changementEnseigneEtablissement;
    }

    public void setChangementEnseigneEtablissement(Boolean changementEnseigneEtablissement) {
        this.changementEnseigneEtablissement = changementEnseigneEtablissement;
    }

    public String getDenominationUsuelleEtablissement() {
        return denominationUsuelleEtablissement;
    }

    public void setDenominationUsuelleEtablissement(String denominationUsuelleEtablissement) {
        this.denominationUsuelleEtablissement = denominationUsuelleEtablissement;
    }

    public Boolean getChangementDenominationUsuelleEtablissement() {
        return changementDenominationUsuelleEtablissement;
    }

    public void setChangementDenominationUsuelleEtablissement(Boolean changementDenominationUsuelleEtablissement) {
        this.changementDenominationUsuelleEtablissement = changementDenominationUsuelleEtablissement;
    }

    public String getActivitePrincipaleEtablissement() {
        return activitePrincipaleEtablissement;
    }

    public void setActivitePrincipaleEtablissement(String activitePrincipaleEtablissement) {
        this.activitePrincipaleEtablissement = activitePrincipaleEtablissement;
    }

    public String getNomenclatureActivitePrincipaleEtablissement() {
        return nomenclatureActivitePrincipaleEtablissement;
    }

    public void setNomenclatureActivitePrincipaleEtablissement(String nomenclatureActivitePrincipaleEtablissement) {
        this.nomenclatureActivitePrincipaleEtablissement = nomenclatureActivitePrincipaleEtablissement;
    }

    public Boolean getChangementActivitePrincipaleEtablissement() {
        return changementActivitePrincipaleEtablissement;
    }

    public void setChangementActivitePrincipaleEtablissement(Boolean changementActivitePrincipaleEtablissement) {
        this.changementActivitePrincipaleEtablissement = changementActivitePrincipaleEtablissement;
    }

    public String getCaractereEmployeurEtablissement() {
        return caractereEmployeurEtablissement;
    }

    public void setCaractereEmployeurEtablissement(String caractereEmployeurEtablissement) {
        this.caractereEmployeurEtablissement = caractereEmployeurEtablissement;
    }

    public Boolean getChangementCaractereEmployeurEtablissement() {
        return changementCaractereEmployeurEtablissement;
    }

    public void setChangementCaractereEmployeurEtablissement(Boolean changementCaractereEmployeurEtablissement) {
        this.changementCaractereEmployeurEtablissement = changementCaractereEmployeurEtablissement;
    }
}
