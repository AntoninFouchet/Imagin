package test;

import model.Categorie;
import model.Intervenant;
import model.Prestataire;
import model.Salarie;
import model.Societe;

/**
 * Test de la classe Categorie et de ses relations avec Intervenant
 */
public class TestCategorie {

    public static void main(String[] args) {
  
        Categorie c = new Categorie();
        c.setId(1);
        c.setLibelle("dev");
        
        Societe soc = new Societe();


        Salarie s = new Salarie (1, "Dupont", "Jean","2024-12-06",4);  
        Prestataire p = new Prestataire(2, "Martin", "Paul", true, 500, soc);


        c.addIntervenant(s);
        c.addIntervenant(p);


        s.setCategorie(c);
        p.setCategorie(c);

    System.out.println("Catégorie: " + c.getLibelle() + " (id=" + c.getId() + ")");
    System.out.println("Nombre d'intervenants: " + c.getNbIntervenants());
    System.out.println("Liste des intervenants:");

for (Intervenant i : c.getLesIntervenants()) {
    System.out.println(" - " + i.getId() + " " + i.getNom() + " " + i.getPrenom() + " (Categorie: " + i.getCategorie().getLibelle() + ")");
}


    }
}