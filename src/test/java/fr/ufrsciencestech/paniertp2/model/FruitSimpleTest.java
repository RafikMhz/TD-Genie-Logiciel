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
public abstract class FruitSimpleTest {
    
    // the factory methods    
    abstract FruitSimple createFruit(double prix, String origine);    
    abstract FruitSimple createFruitNull();    
// all test methods need to make use of the factory method to create the instance of a fruit    
   
    @Test   
    public void testGetPrix() {        
        FruitSimple fs = createFruit(0.5, "France");      
        double expected = 0.5;       
        double result = fs.getPrix();    
        assertTrue(expected == result);  
    }
    
    
    
    public FruitSimpleTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
