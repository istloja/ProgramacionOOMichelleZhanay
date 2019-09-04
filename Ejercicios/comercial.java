/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class comercial extends Empleado {
    private double comision; 
    private double Plus;

    public comercial() {
    }

    public comercial(double comison) {
        this.comision = comison;
    }
    public  boolean Plus(){
      if(super.getEdad()>30 && this.comision>300 )
      {
          double NuevoSalario =(super.getSalario()+this.Plus);
          super.setSalario(NuevoSalario);
          return true;
      }
         return false;
    }
   
      public String toString(){
        String Edad = null;
        String Salario = null;
      
     return ("NOMBRE: "+ Nombre +"EDAD: "+Edad +"SALARIO: "+Salario+"COMISION: "+comision);
 }
    
}
