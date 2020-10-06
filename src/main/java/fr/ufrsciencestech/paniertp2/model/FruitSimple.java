
package fr.ufrsciencestech.paniertp2.model;

/**
 *
 * @author eb227427
 */
public abstract class  FruitSimple implements Fruit{
    protected double prix;
    protected String origine;

    public FruitSimple(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Non Renseigné";  
	else
            this.origine = origine;
    }

    
    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String country){
	this.origine=country;
    }

    @Override
    public String toString(){
        return "FruitSimple de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Cerise fr = (Cerise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

}



