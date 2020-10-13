
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
    public boolean equals(Object o){  
        if(o != null && getClass() == o.getClass()){
            FruitSimple fr = (FruitSimple) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'un FruitSimple peu avoir des pepins comme l'orange
        return false;
    }
    @Override
    public String toString(){
        return "FruitSimple de " + origine + " a " + prix + " euros";
    }

}



