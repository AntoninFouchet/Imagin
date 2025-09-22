/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zakina
 */
public class CategorieTest {
    
    private Categorie cat ;
    
    public CategorieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        cat = new Categorie();
        cat.setId(1);
        cat.setLibelle("developpeur web");

        
        Salarie s1 = new Salarie(); // constructeur vide
        s1.setId(1);
        s1.setNom("Dupont");

        cat.addIntervenant(s1);
        
        Salarie s2 = new Salarie();
        s2.setId(2);
        s2.setNom("Durant");
        cat.addIntervenant(s2);

        Prestataire p1 = new Prestataire();
        p1.setId(3);
        p1.setNom("Michel");
        
        cat.addIntervenant(p1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Categorie.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = cat.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Categorie.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        cat.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getLibelle method, of class Categorie.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        String expResult = "developpeur web";
        String result = cat.getLibelle();
        assertEquals(expResult, result);
 
    }


    
     /**
     * Test of getNbIntervenants method, of class Categorie.
     */
    @Test
    public void testGetNbIntervenants() {
        System.out.println("getNbIntervenants");
        int expResult = 3;
        int result = cat.getNbIntervenants();
             
        for (Intervenant i : cat.getLesIntervenants()){
            if (i instanceof Salarie){
                System.out.println(i.getNom() + " est un salarié");
            }
            else
            {
                  System.out.println(i.getNom() + " est un prestataire");
            }
            
        }
        assertEquals(expResult, result);
 
    }
 
    
}
