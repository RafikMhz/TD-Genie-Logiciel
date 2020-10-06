package fr.ufrsciencestech.paniertp2.model;

/**
 *
 * @author eb227427
 */
public class Banane extends FruitSimple implements Fruit {
 

    
    public Banane(double prix, String origine)
    {
        super(prix,origine);
    }
    
    @Override
    public String toString(){
        return "Banane de " + origine + " a " + prix + " euros";
    }

    public boolean isSeedless() {  //predicat indiquant qu'une fraise n'a pas de pepins
        return true;
    }
}