/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion;

/**
 *
 * @author LENOVO
 */
public class Mamifero extends Animal {
     private String movilidad;
     private boolean marsupial;

    public Mamifero(String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
    }

    public Mamifero(String movilidad, boolean marsupial, String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
        this.movilidad = movilidad;
        this.marsupial = marsupial;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public boolean isMarsupial() {
        return marsupial;
    }

    public void setMarsupial(boolean marsupial) {
        this.marsupial = marsupial;
    }

    

    
}
