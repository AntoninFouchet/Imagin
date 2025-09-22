package model;

public abstract class Intervenant {
    private int id;
    private String nom;
    private String prenom;
    private Categorie categorie;
    

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

    
    
    public abstract double calculCoutProjet (int nbJours);
    
    
    
    

    
    
}
