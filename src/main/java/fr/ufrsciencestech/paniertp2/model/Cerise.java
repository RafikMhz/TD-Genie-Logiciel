package fr.ufrsciencestech.paniertp2.model;

/**
 *
 * @author eb227427
 */
public class Cerise extends FruitSimple implements Fruit {

    
    public Cerise(double prix, String origine)
    {
        super(prix,origine);
    }
    
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }
    
   
    public boolean isSeedless() {  //predicat indiquant qu'une Cerise n'a pas de pepins
        return true;
    }
}


