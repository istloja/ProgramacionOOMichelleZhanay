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
public class Estudiante extends Persona{
    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();
        objeto.setNombre("Michelle");
        System.out.println(objeto.getNombre());
        objeto.prueba();
        
    }  
    private float nota;
    private float codigo_estudiante;

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setCodigo_estudiante(float codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }
    public void ingresar_al_sistema(){
        System.out.println("Usted acaba de ingresar al sistema");
    }
    public void prueba(){
        ingresar_al_sistema();
        super.ingresar_al_sistema();
    }
    
}
