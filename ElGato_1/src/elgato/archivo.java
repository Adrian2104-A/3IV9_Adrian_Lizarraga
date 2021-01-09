/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgato;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane; 

/**
 *
 * @author adrai
 */
public class archivo extends Registrar {
    
    public void archivos(){
    Registrar jugador1 = new Registrar(nombre, edad);
        Registrar jugador2 = new Registrar(nombre, edad);
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATOS"))){
            oos.writeObject(jugador1);
            oos.writeObject(jugador2);
            }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    public void leer(){
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATOS"))){
            while(true){
            Registrar aux = (Registrar)ois.readObject();
            JOptionPane.showMessageDialog(null, aux.getNombre());
            JOptionPane.showMessageDialog(null, aux.getEdad());
            JOptionPane.showMessageDialog(null, "");
            }
            }catch(ClassNotFoundException e){
            }catch(EOFException e){
            }catch(IOException e){
            }
        }
}
