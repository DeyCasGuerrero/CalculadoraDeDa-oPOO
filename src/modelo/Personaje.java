package modelo;

public class Personaje {

    private String personaje;
    private int atqBp,nivelPersonaje;
    private double bonoDaño,primerGolpe,probabilidadCritica;
    

    public Personaje(String personaje, int atqBp, double bonoDaño, int nivelPersonaje, double primerGolpe, double probabilidadCritica) {
        this.personaje = personaje;
        this.atqBp = atqBp;
        this.bonoDaño = bonoDaño;
        this.nivelPersonaje=nivelPersonaje;
        this.primerGolpe=primerGolpe;
        this.probabilidadCritica=probabilidadCritica;
    }

    public Personaje() {

    }
    
    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getAtqBp() {
        return atqBp;
    }

    public void setAtqBp(int atqBp) {
        this.atqBp = atqBp;
    }

    public double getBonoDaño() {
        return bonoDaño;
    }

    public void setBonoDaño(double bonoDaño) {
        this.bonoDaño = bonoDaño;
    }

    public int getNivelPersonaje() {
        return nivelPersonaje;
    }

    public void setNivelPersonaje(int nivelPersonaje) {
        this.nivelPersonaje = nivelPersonaje;
    }

    public double getPrimerGolpe() {
        return primerGolpe;
    }

    public void setPrimerGolpe(double primerGolpe) {
        this.primerGolpe = primerGolpe;
    }

    public double getProbabilidadCritica() {
        return probabilidadCritica;
    }

    public void setProbabilidadCritica(double probabilidadCritica) {
        this.probabilidadCritica = probabilidadCritica;
    }
    
   
    public int ataquePersonajes() {
        switch (personaje) {
            case "shogun":
                atqBp = 337;
                break;
            case "hu tao":
                atqBp = 106;
                break;
            case "keching":
                atqBp = 323;
                break;
            case "diluc":
                atqBp = 335;
                break;
            case "ayaka":
                atqBp = 342;
                break;
            case "kazuha":
                atqBp = 297;
                break;
            case "yelan":
                atqBp = 244;
                break;
            case "qiqi":
                atqBp = 287;
                break;
            case "yae":
                atqBp = 339;
                break;
            default:
                atqBp = 0;
        }
        return atqBp;
    }

    @Override
    public String toString() {
        return "Personaje{" + "personaje=" + personaje + ", atqBp=" + atqBp + ", nivelPersonaje=" + nivelPersonaje + ", bonoDa\u00f1o=" + bonoDaño + ", primerGolpe=" + primerGolpe + ", probabilidadCritica=" + probabilidadCritica + '}';
    }

}
