/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2.model;

import java.util.Observable;

/**
 *
 * @author celine
 */
public class Modele extends Observable{
    private Panier panier;

    
    public Modele(){
        panier = new Panier(10);
    }
    public void update(int incr) throws PanierPleinException, PanierVideException {
        if (incr == -1){
            panier.retrait();
        }
        else{
            if (!panier.estPlein()){
                Fruit orange = new Orange(0.5, "Espagne");
                panier.ajout(orange);
            }
        }

        System.out.println(panier.toString());
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getTaillePanier());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }

    /**
     * @return size of panier
     */
    public int getTaillePanier() {
        return panier.getTaillePanier();
    }

    /**
     * @param panier the panier to set
     */
    public void setPanier(Panier panier) {
        this.panier = panier;
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getTaillePanier());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }
    
}
