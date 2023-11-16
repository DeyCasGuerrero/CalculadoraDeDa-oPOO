package Clases;

import interfaces.calculo;
import javax.swing.JOptionPane;
import modelo.Arma;

public class ArmaGestor implements calculo {

    public Arma arma = new Arma();

    @Override
    public void EvaluarNumeros(int numero) {
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "COLOCA UN NUMERO MAYOR A CERO");
        } else {
            // arma.setAtqBArma(numero); YOU CAN HELP TO SET FROM THIS CLASS (i can't do that)  
        }
     
    }

    @Override
    public void EvaluarNumeroDouble(double numero) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
