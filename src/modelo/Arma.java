
package modelo;


public class Arma {
    private int atqBArma;
   

    public Arma(int atqBArma, double BonifiacionArma) {
        this.atqBArma = atqBArma;

    }
    public Arma(){
        
    }

    public int getAtqBArma() {
        return atqBArma;
    }

    public void setAtqBArma(int atqBArma) {
        this.atqBArma = atqBArma;
    }

    @Override
    public String toString() {
        return "Arma{" + "atqBArma=" + atqBArma + '}';
    }


  
    
  
}
