/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author adrai
 */
public class gys {
    
    private String nombre;
    private int edad;
    private int puntuaje;

    public gys(String nombre, int edad, int puntuaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntuaje = puntuaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuaje() {
        return puntuaje;
    }

    public void setPuntuaje(int puntuaje) {
        this.puntuaje = puntuaje;
    }
    
    
    
}
