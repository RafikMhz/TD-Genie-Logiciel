package fr.ufrsciencestech.paniertp2.model;

/**
 *
 * @author eb227427
 */
public class Cerise extends FruitSimple {

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

    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Cerise");
   }
}


