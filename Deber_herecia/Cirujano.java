/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_herecia;

/**
 *
 * @author LENOVO
 */
public class Cirujano extends Doctor {
    public static void main(String[] args) {
        Cirujano objeto=new Cirujano ();
        objeto.setNombre("Murphy");
        System.out.println(objeto.getNombre());
        objeto.prueba();
    }
    public String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void Area_laboral(){
        System.out.println("Cirujano Estetico");
        
    }
    public void prueba(){
        Area_laboral();
        super.Area_laboral();
    }
    
    
}
