/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author rb992140
 */
public abstract class FruitSimpleTest {
    
    // the factory methods    
    abstract FruitSimple createFruit(double prix, String origine);    
    abstract FruitSimple createFruitNull();    
    // all test methods need to make use of the factory method to create the instance of a fruit    
   
    /**
     * getPrix test
     */
    @Test   
    public void testGetPrix() {        
        System.out.println("getPrix");
        FruitSimple fs = createFruit(0.5, "France");      
        double expected = 0.5;       
        double result = fs.getPrix();    
        assertTrue(expected == result);  
    }
    
    /**
     * Test of getOrigine method, of class FruitSimple.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        FruitSimple instance = new Orange(12,"France");
        String expResult = "France";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FruitSimple.   
     */
    
  
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FruitSimple instance = new Banane(24,"Emirates");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }


     /**
     * Test of toString method, of class Fruit Simple.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FruitSimple instance = new Cerise(0,"");
        String expResult = "FruitSimple de " + "" + " a " + 0 + " euros";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    /**
     * isSeedless test
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        FruitSimple instance = new Orange(23,"Ghana");
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
