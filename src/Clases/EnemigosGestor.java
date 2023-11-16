
package Clases;

import interfaces.calculo;
import interfaces.personaje;
import java.util.ArrayList;
import java.util.List;
import modelo.Enemigos;


public class EnemigosGestor implements personaje, calculo{
    private List<String> enemigos;
    Enemigos enemigo = new Enemigos ();
    
    public void inicializarEnemigos() {
        enemigos = new ArrayList<>();
        enemigos.add("hilichurl");
        enemigos.add("slimes");
        enemigos.add("Mitachurls");
        //SI DESEA AGREGAR MAS ENEMIGOS
    }
    
    public List<String> obtenerEnemigos(){
        return enemigos;
    }

    @Override
    public String EvaluarExistencia(String personaje) {
        if(enemigos.contains(personaje)){
//            enemigo.setEnemigos(personaje);  
        }
        return "";
    }

    @Override
    public void EvaluarNumeros(int numero) {
        if(numero<0){
            
        }else{
            
        }
    }

    @Override
    public void EvaluarNumeroDouble(double numero) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    

}
