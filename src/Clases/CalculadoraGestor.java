package Clases;

import interfaces.calculo;
import javax.swing.JOptionPane;
import modelo.Calculadora;
import modelo.Personaje;

public class CalculadoraGestor implements calculo {

    public Calculadora calculo = new Calculadora();
    Personaje persona = new Personaje();

 
    @Override
    public void EvaluarNumeros(int numero) {
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "COLOCA UN NUMERO MAYOR A CERO EN EL ATQ TOTAL GENERAL");
        } 
    }

    @Override
    public void EvaluarNumeroDouble(double numero) {

    }

}
