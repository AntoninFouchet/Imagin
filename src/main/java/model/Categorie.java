/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Categorie {
    private int id;
    private String libelle;
    
    private ArrayList<Intervenant> lesIntervenants ;

    public Categorie() {
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
            
    public ArrayList<Intervenant> getLesIntervenants() {
        return lesIntervenants;
    }

    public void setLesIntervenants(ArrayList<Intervenant> lesIntervenants) {
        this.lesIntervenants = lesIntervenants;
    }
    public void addIntervenant(Intervenant unIntervenant){
        if (lesIntervenants ==null ){
            lesIntervenants = new ArrayList<Intervenant>();
        }
        lesIntervenants.add(unIntervenant);
    }
    public int getNbIntervenants() {
    if (lesIntervenants == null) {
        return 0; 
    }
    return lesIntervenants.size();
}

    
    
    
    
    
    
    

}
