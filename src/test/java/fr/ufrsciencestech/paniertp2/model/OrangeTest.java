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
public class OrangeTest extends FruitSimpleTest{
    
        // implementation of the abstract factory methods    
    FruitSimple createFruit(double prix, String origine) {       
        return new Orange(prix, origine);     
    }  
    FruitSimple createFruitNull(){  
        return null;    
    }    
        
    //inutile de redéfinir la méthode testGetPrix() ici}
    
  
    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange(2.0,"Suisse");
        double expResult = 2.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 2.0);

        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.4;
        Orange instance = new Orange(0,"Algerie");
        instance.setPrix(prix);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange(12,"France");
        String expResult = "France";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "Angleterre";
        Orange instance = new Orange(23,"");
        instance.setOrigine(origine);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange(0,"");
        String expResult = "Orange de " + "" + " a " + 0 + " euros";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Orange.   
     */
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Orange instance = new Orange(24,"Emirates");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }


    /**
     * Test of isSeedless method, of class Orange.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Orange instance = new Orange(23,"Ghana");
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Orange.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Orange.main(args);
        fail("The test case is a prototype.");
    }
    
}
