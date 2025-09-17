package model;

public class Salarie extends Intervenant {
    private String dtEmbauche;
    private String echelon;
    
    private float coutSalarie = 500;
    

    public Salarie() {
        super();
    }

    public Salarie(int id, String nom, String prenom, String dtEmbauche, String echelon) {
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

    public String getEchelon() {
        return echelon;
    }

    public void setEchelon(String echelon) {
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