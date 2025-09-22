/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import model.Salarie;

/**
 *
 * @author sio2
 */
public class TestSalarie {
    

    public static void main (String args[]){

        Salarie s = new Salarie();
        s.setId(1);
        s.setNom("test");
        s.setPrenom("test");
        s.setDtEmbauche("test");
        s.setEchelon(1);
        
        int nbJours = 100;
        double coutProjet = s.calculCoutProjet(nbJours);
      

                

        System.out.println(s.getId() + " " + s.getNom() + " " + s.getPrenom() + " " + s.getDtEmbauche()+ " " + s.getEchelon());
        System.out.println(coutProjet);
        
        
    }
}