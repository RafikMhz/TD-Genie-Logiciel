/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2;

import fr.ufrsciencestech.paniertp2.controler.Controleur;
import fr.ufrsciencestech.paniertp2.model.Modele;
import fr.ufrsciencestech.paniertp2.view.VueConsole;
import fr.ufrsciencestech.paniertp2.view.VueG;
import fr.ufrsciencestech.paniertp2.view.VueGraphAWT;

/**
 *
 * @author celine
 */
public class TestMVC {
    private VueG vueg;      //pour pouvoir changer de vue si on le souhaite
    private Controleur controleur;  //pour pouvoir changer de controleur si on le souhaite
    
    /**
     * @return the vueg
     */
    public VueG getVueg() {
        return vueg;
    }

    /**
     * @param vueg the vueg to set
     */
    public void setVueg(VueG vueg) {
        this.vueg = vueg;
    }

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }

    /**
     * @param controleur the controleur to set
     */
    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }
    
    
    public TestMVC(){
        //sans utiliser SpringIoC :
        //vueg = new VueGraphSwing();
        vueg = new VueGraphAWT();
        controleur = new Controleur();
        Modele modele = new Modele();
        VueConsole vuec = new VueConsole();

        controleur.setModele(modele);                 
        modele.addObserver(vueg);        
        modele.addObserver(vuec);         
        vueg.addControleur(controleur);
    }
    
    public static void main(String[] args){
        TestMVC test = new TestMVC();    //sans utiliser SpringIoC
        
        //La meme chose mais avec SpringIoC :
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestMVC test = (TestMVC)context.getBean("MVC");  //SpringIoC
        test.setControleur( (Controleur)context.getBean("Controleur") );  //SpringIoC
        test.setVueg( (VueG)context.getBean("Vue") );   //SpringIoC
         
        Modele m = new Modele(); 
        test.getControleur().setModele(m);  
        
        m.addObserver(test.getVueg());
        test.getVueg().addControleur(test.getControleur());
        
        VueConsole vuec = new VueConsole();
        m.addObserver(vuec);*/
    }
}
