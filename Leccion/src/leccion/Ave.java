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
public class Ave extends Animal{
   private String tipopico;
   private String movilidad;

    public Ave(String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
    }

    public Ave(String tipopico, String movilidad, String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
        this.tipopico = tipopico;
        this.movilidad = movilidad;
    }

    public String getTipopico() {
        return tipopico;
    }

    public void setTipopico(String tipopico) {
        this.tipopico = tipopico;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }
   

   
   
}
