package model;

import java.util.ArrayList;

public abstract class Intervenant {
    private int id;
    private String nom;
    private String prenom;
    private Categorie categorie;
    
    private ArrayList<Projet> lesProjets ;
    

    public Intervenant() {
    }

    public Intervenant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    public ArrayList<Projet> getLesProjets() {
        return lesProjets;
    }

    public void setLesProjets(ArrayList<Projet> lesProjets) {
        this.lesProjets = lesProjets;
    }
    public void addProjet(Projet unProjet){
        if (lesProjets ==null ){
            lesProjets = new ArrayList<Projet>();
        }
        lesProjets.add(unProjet);
    }
    public abstract double calculCoutProjet (int nbJours);
    
        public int getNbProjets() {
    if (lesProjets == null) {
        return 0; 
    }
    return lesProjets.size();
    }

    
    
}
