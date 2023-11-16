package Clases;

import interfaces.calculo;
import interfaces.personaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Personaje;

public class PersonajeGestor implements calculo,personaje {
    
    Personaje persona= new Personaje();
    private List<String> personajes;
    String personaje_encontrado;
    double numeroEncontradoDouble;

    public void inicializarPersonajes() {
        personajes = new ArrayList<>();
        personajes.add("shogun");
        personajes.add("hu tao");
        personajes.add("keching");
        personajes.add("diluc");
        personajes.add("ayaka");
        personajes.add("kazuha");
        personajes.add("yelan");
        personajes.add("qiqi");
        personajes.add("yae");
    }

   public void lista(){
        System.out.println("Lista de personajes de Genshin Impact:");
        for (String personaje : personajes) {
            System.out.println(personaje);
        }
   }
    
   @Override
    public String EvaluarExistencia(String personaje) {
        
        if (personajes == null) {
            JOptionPane.showMessageDialog(null, "LA LISTA NO ESTÁ INICIADA");
            return "";  
        }
        if (personajes.contains(personaje)) {//Con el contains verifico si el personaje está en mi lista
            personaje_encontrado=personaje;
            JOptionPane.showMessageDialog(null, "Su personaje "+personaje_encontrado+" está en está lista");
            persona.setPersonaje(personaje_encontrado);
            
        } else {
            JOptionPane.showMessageDialog(null, "Su personaje no está en la lista, vuelva a iniciar.");
            personaje_encontrado="";
        }  
        return personaje_encontrado;
    }

    

    @Override
    public void EvaluarNumeros(int numero) {
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "COLOCA UN NUMERO MAYOR A CERO EN EL NIVEL DE PERSONAJE");
        } else{
//            numeroEncontradoDouble=numero;
//            persona.setBonoDaño(numeroEncontradoDouble);
        }
    }

    @Override
    public void EvaluarNumeroDouble(double numero) {
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "COLOCA UN NUMERO MAYOR A CERO EN EL ATQ TOTAL GENERAL");
        } else{
//            numeroEncontradoDouble=numero;
//            persona.setBonoDaño(numeroEncontradoDouble);
        }
    }
    
}
