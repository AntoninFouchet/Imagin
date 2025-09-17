package model;

import java.util.ArrayList;

public class Societe {
    private int id;
    private String raisonSociale;
    private String adresse;
    private int copos;
    private String ville;
    private double coutJournalier;

    private ArrayList<Prestataire> lesPrestataires; // OneToMany

    public Societe() {
        lesPrestataires = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCopos() {
        return copos;
    }

    public void setCopos(int copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public ArrayList<Prestataire> getLesPrestataires() {
        return lesPrestataires;
    }

    public void setLesPrestataires(ArrayList<Prestataire> lesPrestataires) {
        this.lesPrestataires = lesPrestataires;
    }

    public void addPrestataire(Prestataire unPrestataire) {
        if (lesPrestataires == null) {
            lesPrestataires = new ArrayList<>();
        }
        lesPrestataires.add(unPrestataire);

    }
}
