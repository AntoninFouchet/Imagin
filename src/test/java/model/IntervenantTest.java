package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntervenantTest {
    
    private Salarie salarie;
    private Prestataire prestataire;
    
    public IntervenantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Création d'un salarié
        salarie = new Salarie();
        salarie.setId(1);
        salarie.setNom("Dupont");
        salarie.setPrenom("Jean");
        
        // Création de projets pour le salarié
        Projet p1 = new Projet();
        p1.setId(101);
        p1.setLibelle("Site web");
        Projet p2 = new Projet();
        p2.setId(102);
        p2.setLibelle("Application mobile");
        salarie.addProjet(p1);
        salarie.addProjet(p2);
        
        // Création d'un prestataire
        prestataire = new Prestataire();
        prestataire.setId(2);
        prestataire.setNom("Martin");
        prestataire.setPrenom("Paul");
        
        // Création de projets pour le prestataire
        Projet p3 = new Projet();
        p3.setId(201);
        p3.setLibelle("Serveur cloud");
        prestataire.addProjet(p3);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetIdNomPrenom() {
        assertEquals(1, salarie.getId());
        assertEquals("Dupont", salarie.getNom());
        assertEquals("Jean", salarie.getPrenom());
        
        assertEquals(2, prestataire.getId());
        assertEquals("Martin", prestataire.getNom());
        assertEquals("Paul", prestataire.getPrenom());
    }

    @Test
    public void testAddProjetEtGetNbProjets() {
        // Test pour le salarié
        int nbProjetsSalarie = salarie.getNbProjets();
        System.out.println("Nombre de projets de " + salarie.getNom() + ": " + nbProjetsSalarie);
        assertEquals(2, nbProjetsSalarie);
        
        // Test pour le prestataire
        int nbProjetsPrestataire = prestataire.getNbProjets();
        System.out.println("Nombre de projets de " + prestataire.getNom() + ": " + nbProjetsPrestataire);
        assertEquals(1, nbProjetsPrestataire);
    }
    
    @Test
    public void testGetLesProjets() {
        ArrayList<Projet> projetsSalarie = salarie.getLesProjets();
        assertEquals("Site web", projetsSalarie.get(0).getLibelle());
        assertEquals("Application mobile", projetsSalarie.get(1).getLibelle());
        
        ArrayList<Projet> projetsPrestataire = prestataire.getLesProjets();
        assertEquals("Serveur cloud", projetsPrestataire.get(0).getLibelle());
    }
    
    @Test
    public void testSetCategorie() {
        Categorie cat = new Categorie();
        cat.setId(10);
        cat.setLibelle("Développement");
        
        salarie.setCategorie(cat);
        prestataire.setCategorie(cat);
        
        assertEquals("Développement", salarie.getCategorie().getLibelle());
        assertEquals("Développement", prestataire.getCategorie().getLibelle());
    }
}
