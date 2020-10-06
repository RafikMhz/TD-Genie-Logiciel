/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2.controler;

import fr.ufrsciencestech.paniertp2.model.Modele;
import fr.ufrsciencestech.paniertp2.model.PanierPleinException;
import fr.ufrsciencestech.paniertp2.model.PanierVideException;
import fr.ufrsciencestech.paniertp2.view.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author celine
 */
public class Controleur implements ActionListener {
    private Modele m;
    private VueG vg;
    
    @Override
    public void actionPerformed(ActionEvent e){   //Invoked when an action occurs
        if(((Component)e.getSource()).getName().equals("Plus")) {
            try {
                m.update(1);
            } catch (PanierPleinException | PanierVideException panierPleinException) {
                panierPleinException.printStackTrace();
            }
        }
        else {
            try {
                m.update(-1);
            } catch (PanierPleinException | PanierVideException panierPleinException) {
                panierPleinException.printStackTrace();
            }
        }
    }
    public void setModele(Modele m){
        this.m = m;
    }
    public void setVue(VueG vg){
        this.vg = vg;
    }
}
