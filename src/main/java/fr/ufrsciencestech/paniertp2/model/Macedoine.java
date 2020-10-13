package fr.ufrsciencestech.paniertp2.model;

import java.util.ArrayList;

public class Macedoine implements Fruit {

    private ArrayList<Fruit> fr;
    
    public Macedoine(Fruit f1, Fruit f2) {

        // instanciation du tableau
        this.fr = new ArrayList<>();

        // ajoute dans la liste les fruits en parametre
        if (f1 != null && f2 != null) {
            fr.add(f1);
            fr.add(f2);
        } else {
            System.out.println("Besoin de deux fruits en parametre");
        }
    }

    // ajoute dans la liste de fruits
    public void ajoute(Fruit f) {
        if (f != null) {
            this.fr.add(f);
        } else {
            System.out.println("Aucun fruit ajouté");
        }
    }

    @Override
    public boolean isSeedless() {

        for (int i = 0; i < fr.size(); i++) {
            if (this.fr.get(i).isSeedless()) {
                return true; // si le boolean isSeedless est vrai ce qu'il n'y a pas de pepin dans la
                             // macedoine
                             // de fruits
            }
        }
        return false;
    }

    public String toString() {
        
    String s = "";

        for(int j=0 ; j < fr.size() ; j++){

            s+=  fr.get(j).toString()+"/n" ;  
        }
        return s;
    }

    @Override
    public double getPrix() {
        return 0;
    }

    @Override
    public String getOrigine() {
        return null;
    }


    
}