package Clases;

import GUI.GenshinCal;
import javax.swing.JFrame;
import modelo.Arma;
import modelo.Personaje;

public class Main {

    public static void main(String[] args) {
        GenshinCal ventana = new GenshinCal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
