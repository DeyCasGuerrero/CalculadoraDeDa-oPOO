package Clases;

import interfaces.calculo;
import javax.swing.JOptionPane;
import modelo.Artefactos;

public class ArtefactoGestor implements calculo {

    public Artefactos arte = new Artefactos();

    
    @Override
    public void EvaluarNumeros(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void EvaluarNumeroDouble(double numero) {
        try {
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a cero en el ATQ TOTAL GENERAL.");
            } else {
//                arte.setOtrosDaños(numero);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el número. Asegúrate de ingresar un valor válido.");
        }
    }

}
