/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

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
 


    /**
     * Test of toString method, of class Banane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Banane instance = new Banane(34,"");
        String expResult = "Banane de " + "" + " a " + 34 + " euros";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Banane.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Banane instance = new Banane(344,"Iran");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSeedless method, of class Banane.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Banane instance = new Banane(344,"Iran");
        boolean expResult = true;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Banane.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Banane.main(args);
        fail("The test case is a prototype.");
    }
    
}
