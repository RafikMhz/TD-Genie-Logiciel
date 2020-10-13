package fr.ufrsciencestech.paniertp2.model;

/**
 *
 * @author eb227427
 */
public class Banane extends FruitSimple {
 
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


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Banane");
   }
}