package model;

public class Prestataire extends Intervenant {
    private boolean forfait;
    private int coutJournalier;

    private Societe societe; 

    public Prestataire() {
        super();
    }

    public Prestataire(int id, String nom, String prenom, boolean forfait, int coutJournalier, Societe societe) {
        super(id, nom, prenom);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.societe = societe;
    }

    public boolean getForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public int getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(int coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }    
    
    public double calculCoutProjet(int nbJours) {
        
        if(forfait){
            return nbJours*societe.getCoutJournalier();
        }else{
            return nbJours*coutJournalier;
        }
    }
}
