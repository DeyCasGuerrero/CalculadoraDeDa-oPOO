package modelo;

public class Enemigos {

    private String enemigos;
    private double resistencia;
    private int nivelEnemigo;

    public Enemigos(String enemigos, double resistencia, int nivelEnemigo) {
        this.enemigos = enemigos;
        this.resistencia = resistencia;
        this.nivelEnemigo = nivelEnemigo;
    }

    public Enemigos() {

    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public String getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(String enemigos) {
        this.enemigos = enemigos;
    }

    public int getNivelEnemigo() {
        return nivelEnemigo;
    }

    public void setNivelEnemigo(int nivelEnemigo) {
        this.nivelEnemigo = nivelEnemigo;
    }

    public double ResistenciaEnemigos() {
        switch (enemigos) {
            case "hilichurl":
                resistencia = 0.9;
                break;
            case "slimes":
                resistencia = 0.9;
                break;
            case "Mitachurls":
                resistencia = 0.7;
                break;
            //PUEDES COLOCAR MAS ENEMIGOS O ADAPTARLO A COMO QUIERAS 
            default:
                throw new AssertionError();
        }
        return resistencia;
    }

    @Override
    public String toString() {
        return "Enemigos{" + "enemigos=" + enemigos + ", resistencia=" + resistencia + ", nivelEnemigo=" + nivelEnemigo + '}';
    }

    
}
