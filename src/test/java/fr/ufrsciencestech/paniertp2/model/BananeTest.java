/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rb992140
 */
public class BananeTest extends FruitSimpleTest{
    
    // implementation of the abstract factory methods    
    FruitSimple createFruit(double prix, String origine) {       
        return new Banane(prix, origine);     
    }  
    FruitSimple createFruitNull(){  
        return null;    
    }    
    //inutile de redéfinir la méthode testGetPrix() ici}
    
    public BananeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Banane.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = new Banane();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Banane.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Banane instance = new Banane();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Banane.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Banane instance = new Banane();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class Banane.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Banane instance = new Banane();
        instance.setOrigine(origine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Banane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Banane instance = new Banane();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Banane.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Banane instance = new Banane();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSeedless method, of class Banane.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Banane instance = new Banane();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Banane.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Banane.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
