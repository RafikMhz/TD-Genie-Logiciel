package fr.ufrsciencestech.paniertp2.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class PanierTest {
    @Test
    public void testAjoutPanierVide() throws PanierPleinException {
        Panier p = new Panier(3); // initialisation
        //Orange o = new Orange(0.5, "Espagne"); // non null

        Orange mocko = mock(Orange.class);
        when(mocko.getPrix()).thenReturn(0.5);
        when(mocko.getOrigine()).thenReturn("Espagne");

        p.ajout(mocko);
        assertFalse(p.estVide());
        assertTrue(p.getTaillePanier()==1);

    }
    @Test
    public void testAjoutPanier1Element() throws PanierPleinException {
        Panier p = new Panier(3); // initialisation

        Orange mocko = mock(Orange.class);
        when(mocko.getPrix()).thenReturn(0.5);
        when(mocko.getOrigine()).thenReturn("Espagne");

        p.ajout(mocko);
        p.ajout(mocko);
        assertFalse(p.estVide());
        assertTrue(p.getTaillePanier()==2);
    }
    @Test
    public void testAjoutPanierPresquePlein() throws PanierPleinException {
        Panier p = new Panier(3); // initialisation

        Orange mocko = mock(Orange.class);
        when(mocko.getPrix()).thenReturn(0.5);
        when(mocko.getOrigine()).thenReturn("Espagne");

        p.ajout(mocko);
        p.ajout(mocko);
        p.ajout(mocko);
        assertTrue(p.estPlein());
    }

    @Test(expected = PanierPleinException.class)
    public void testAjoutPanierPlein() throws PanierPleinException {
        Panier p = new Panier(1); // initialisation

        Orange mocko = mock(Orange.class);
        when(mocko.getPrix()).thenReturn(0.5);
        when(mocko.getOrigine()).thenReturn("Espagne");
        p.ajout(mocko);
        p.ajout(mocko);
        //assertThrows(PanierPleinException.class, () -> p.ajout(mocko)); // alternative à expected = PanierPleinException.class

    }


}
