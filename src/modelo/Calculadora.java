package modelo;

public class Calculadora {

    private int ATQTotalBase, atqTotalF2, ATQTotal;
    private Personaje ObjPersonaje;
    private Arma ObjArma;
    private Artefactos ObjArtefacto;
    private Enemigos ObjEnemigos;
    private double totalDaño, multiplicador,dañoPseudo, dañoPrimerGolpe,dañoCritico;

    public Calculadora(Personaje ObjPersonaje, Arma ObjArma, Artefactos ObjArtefacto, Enemigos ObjEnemigos) {
        this.ObjPersonaje = ObjPersonaje;
        this.ObjArma = ObjArma;
        this.ObjArtefacto = ObjArtefacto;
        this.ObjEnemigos = ObjEnemigos;
    }
    
    public Calculadora(int ATQTotalBase, double dañoCritico, double multiplicador, double dañoPrimerGolpe, String personaje, int AtqBp, int nivelPersonaje, double primerGolpe, double probabilidadCritica, int atqBArma, double BonifiacionArma, double bonoDaño, int ATQTotal, double otrosDaños, String enemigo, int nivelEnemigo, double resistencia) {
        this.ATQTotalBase = ATQTotalBase;
        this.ATQTotal = ATQTotal;
        this.multiplicador = multiplicador;
        this.dañoPrimerGolpe=dañoPrimerGolpe;
        this.dañoCritico=dañoCritico;
        this.ObjPersonaje = new Personaje(personaje, AtqBp, bonoDaño, nivelPersonaje,primerGolpe,probabilidadCritica);
        this.ObjArtefacto = new Artefactos(otrosDaños);
        this.ObjArma = new Arma(atqBArma, BonifiacionArma);
        this.ObjEnemigos = new Enemigos(enemigo, resistencia, nivelEnemigo);
    }

    public Calculadora() {

    }

    // OBJETO PERSONAJE
    public Personaje getObjPersonaje() {
        return ObjPersonaje;
    }

    public void setObjPersonaje(Personaje ObjPersonaje) {
        this.ObjPersonaje = ObjPersonaje;
    }

    // OBJETO ARMA
    public Arma getObjArma() {
        return ObjArma;
    }

    public void setObjArma(Arma ObjArma) {
        this.ObjArma = ObjArma;
    }

    //Objeto Artefactos
    public Artefactos getObjArtefacto() {
        return ObjArtefacto;
    }

    public void setObjArtefacto(Artefactos ObjArtefacto) {
        this.ObjArtefacto = ObjArtefacto;
    }

    //Objeto Enemigo
    public Enemigos getObjEnemigos() {
        return ObjEnemigos;
    }

    public void setObjEnemigos(Enemigos ObjEnemigos) {
        this.ObjEnemigos = ObjEnemigos;
    }

    // GETTERS Y SETTES DE LA CLASE CALCULADORA :V
    public int getATQTotalBase() {
        return ATQTotalBase;
    }

    public void setATQTotalBase(int ATQTotalBase) {
        this.ATQTotalBase = ATQTotalBase;
    }

    public int getAtqTotalF2() {
        return atqTotalF2;
    }

    public void setAtqTotalF2(int atqTotalF2) {
        this.atqTotalF2 = atqTotalF2;
    }

    public int getATQTotal() {
        return ATQTotal;
    }

    public void setATQTotal(int ATQTotal) {
        this.ATQTotal = ATQTotal;
    }

    public double getTotalDaño() {
        return totalDaño;
    }

    public void setTotalDaño(double totalDaño) {
        this.totalDaño = totalDaño;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getDañoPrimerGolpe() {
        return dañoPrimerGolpe;
    }

    public void setDañoPrimerGolpe(double dañoPrimerGolpe) {
        this.dañoPrimerGolpe = dañoPrimerGolpe;
    }

    public double getDañoPseudo() {
        return dañoPseudo;
    }

    public void setDañoPseudo(double dañoPseudo) {
        this.dañoPseudo = dañoPseudo;
    }

    public double getDañoCritico() {
        return dañoCritico;
    }

    public void setDañoCritico(double dañoCritico) {
        this.dañoCritico = dañoCritico;
    }
    
    //METODOS 
    public int atqBaseTotal() {
        ATQTotalBase = ObjPersonaje.getAtqBp() + ObjArma.getAtqBArma();
        return ATQTotalBase;
    }

    public int atqTotalFase2() {
        atqTotalF2 = ATQTotalBase + ATQTotal;
        return atqTotalF2;
    }

    public double dañoTotal() {
        totalDaño = atqTotalF2 + ((atqTotalF2 * ObjPersonaje.getBonoDaño()) / 100 + ((atqTotalF2 * ObjArtefacto.getOtrosDaños()) / 100));
        return totalDaño;
    }

    public double multiplicador() {
        double divisor = ObjEnemigos.getNivelEnemigo() + ObjPersonaje.getNivelPersonaje() + 200;
        multiplicador = (ObjPersonaje.getNivelPersonaje()+100)/divisor;
        return multiplicador;
    }
    
    public void DañoPseudoReal(){
        dañoPseudo=totalDaño*(ObjEnemigos.getResistencia()*multiplicador);
    }
    
    public double dañoPrimerGolpe(){
        dañoPrimerGolpe = Math.round(dañoPseudo*(ObjPersonaje.getPrimerGolpe()/100));
        return dañoPrimerGolpe;
    }
    
    public double primerGolpeDañoCritico(){
        dañoCritico=Math.round(dañoPrimerGolpe*(1+(ObjPersonaje.getProbabilidadCritica()/100)));
        return dañoCritico;
    }

    //Un ToString 

    @Override
    public String toString() {
        return "Calculadora{" + "ATQTotalBase=" + ATQTotalBase + ", atqTotalF2=" + atqTotalF2 + ", ATQTotal=" + ATQTotal + ", ObjPersonaje=" + ObjPersonaje + ", ObjArma=" + ObjArma + ", ObjArtefacto=" + ObjArtefacto + ", ObjEnemigos=" + ObjEnemigos + ", totalDa\u00f1o=" + totalDaño + ", multiplicador=" + multiplicador + ", da\u00f1oPseudo=" + dañoPseudo + '}';
    }
   

}
