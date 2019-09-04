/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerialisable;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private Mascota mascota;

    public Persona(String nombre, String apellido, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public static void main(String[] args) {
        Persona objeto = new Persona("Michelle", "Zhanay",25,new Mascota("Lucas",4));
        Mascota obj = new Mascota ("Lucas",4);
        Persona objeto1 = new Persona ("Martin","Camacho",26,obj);
        System.out.println("La  mascota de " + objeto.getNombre() + " se llama " + objeto.getMascota() .getNombre() );
        
    }
    
    
}
