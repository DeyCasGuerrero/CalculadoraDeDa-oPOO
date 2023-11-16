package modelo;

public class Artefactos {

    protected double otrosDaños;

    public Artefactos(double otrosDaños) {
        this.otrosDaños = otrosDaños;
        
    }

    public Artefactos() {

    }

    public double getOtrosDaños() {
        return otrosDaños;
    }

    public void setOtrosDaños(double otrosDaños) {
        this.otrosDaños = otrosDaños;
    }

    @Override
    public String toString() {
        return "Artefactos{" + "otrosDa\u00f1os=" + otrosDaños + '}';
    }
    
}
