package model;

public class Salarie extends Intervenant {
    private String dtEmbauche;
    private int echelon;
    
    private float coutSalarie = 500;
    

    public Salarie() {
        super();
    }

    public Salarie(int id, String nom, String prenom, String dtEmbauche, int echelon) {
        super(id, nom, prenom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public String getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(String dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public float getCoutSalarie() {
        return coutSalarie;
    }

    public void setCoutSalarie(float coutSalarie) {
        this.coutSalarie = coutSalarie;
    }
    
    
    public double calculCoutProjet(int nbJours){
        return coutSalarie * nbJours;
    }
    
  
    
}