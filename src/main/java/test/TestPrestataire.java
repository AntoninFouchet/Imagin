/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import model.Prestataire;
import model.Salarie;
import model.Societe;


/**
 *
 * @author sio2
 */
public class TestPrestataire {
    

    public static void main (String args[]){

        Prestataire p = new Prestataire();
        p.setId(1);
        p.setNom("test");
        p.setPrenom("test");
        p.setForfait(false);
        p.setCoutJournalier(10);
        
        Prestataire p1 = new Prestataire();
        p1.setId(2);
        p1.setNom("test2");
        p1.setPrenom("test2");
        p1.setForfait(true);
        p1.setCoutJournalier(10);
        
        Salarie salarie = new Salarie(2,"Jack", "Uzi","2025-05-05", "255");
        
        
        
        Societe s = new Societe();
        s.setRaisonSociale("test");
        s.setAdresse("test");
        s.setCopos(545);
        s.setVille("test");
        s.setCoutJournalier(50);
        
        
        p.setSociete(s);
        p1.setSociete(s);
      
        
        int nbJours = 100;
        double coutProjet = p.calculCoutProjet(nbJours);
        double coutProjet1 = p1.calculCoutProjet(nbJours);
        double coutProjet2 = salarie.calculCoutProjet(nbJours);
        
        
        
        

                

        System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom() + " " + coutProjet);
        System.out.println(p1.getId() + " " + p1.getNom() + " " + p1.getPrenom() + " " + coutProjet1);
        System.out.println(salarie.getId() + " " + salarie.getNom() + " " + salarie.getPrenom() + " " + coutProjet2);
        
        
       
    }
}