package fr.ufrsciencestech.paniertp2.model;

public class Jus implements Fruit{

private Fruit fr;

    public Jus(Fruit t){
        this.fr=t;
    }

    @Override
    public boolean isSeedless() {
        return fr.isSeedless();
    }

    @Override
    public double getPrix() {
        return fr.getPrix();
    }

    
    public String toString() {
        return fr.toString();
    }

    @Override
    public String getOrigine() {
        return fr.getOrigine();
    }

    
}