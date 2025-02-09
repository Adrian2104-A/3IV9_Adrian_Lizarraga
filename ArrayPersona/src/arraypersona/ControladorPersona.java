/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypersona;

import java.util.ArrayList;

/**
 *
 * @author adrai
 */
public class ControladorPersona {
 
    public static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersona;
    }
    
    public void registrarPersona(Persona p){
        
        listaPersona.add(p);       
    }
    
    public Persona buscarPersona(int id){
        
        Persona encontrada = new Persona();
        
        for(Persona p : listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada, registro invalido");
            }
        }
        return encontrada;
    }
    
    public void actualizarPersona(Persona personaActualizada){        
        Persona personaActualizar = buscarPersona(personaActualizada.getId());
        listaPersona.remove(personaActualizar);
        listaPersona.add(personaActualizada);
    }
    
    public void eliminarPersona(Persona personaEliminar){
        listaPersona.remove(personaEliminar);
    }

}
