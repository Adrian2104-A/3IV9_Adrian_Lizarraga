/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypersona;


import java.util.*;
/**
 *
 * @author adrai
 */
public class vistaManipular {
    
    Scanner entrada = new Scanner(System.in);
    
    ControladorPersona crud = new ControladorPersona();
    
    
    public void principal(){
        System.out.println("Bienvenido a la administración del personal de la empresa patito");
        System.out.println("Porfavor elija la opcion deseada"
        + "\n 1. Mostrar lista del personal"
        + "\n 2. Registrar una nueva persona"
        + "\n 3. Editar los datos de una persona"
        + "\n 4. Borrar el registro de una persona"
        + "\n 5. Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch(opcion){
            case 1:
                ArrayList<Persona> listadePersonas = crud.mostrarPersonas();
                for(Persona objeto : listadePersonas){
                System.out.println("El id: " +objeto.getId()
                                  + " El nomre: " +objeto.getNombre() 
                                  + " La edad es: " +objeto.getEdad() +"\n");
                }
                break;
            case 2:
                System.out.println("Ingresa el id de la persona: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingresa el nombre de la persona: ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingresa la edad de la Persona: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                
                Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
                crud.registrarPersona(personaNueva);
                break;
            case 3:
                System.out.println("Ingresa el ID de la persona que desea actualizar sus datos");
                int id = entrada.nextInt();
                
                Persona personaSeleccione = crud.buscarPersona(id);
                
                System.out.println("La informacion de la persona es la siguiente.");
                System.out.println("Id " +personaSeleccione.getId()
                                  + " Nombre " +personaSeleccione.getNombre()
                                  + " Edad " +personaSeleccione.getEdad());
                System.out.println("Ingrese la edad nueva");
                int edadnueva = entrada.nextInt();
                
                personaSeleccione.setNombre(nuevonombre);
                personaSeleccione.SetEdad(edadnueva);
                
                crud.actualizarPersona(personaSeleccione);
                break;
            case 4:
                System.out.println("Ingrese el Id de la persona que desea actualizar sus datos");
                int ideliminar = entrada.nextInt();
                
                Persona eliminarPersona = crud.eliminarPersona(personaEliminar);
                
                System.out.println("Registro eliminado exitosamente");
                break;
            default:
                System.out.println("Digite una opcion correcta");
        }
    }
}
