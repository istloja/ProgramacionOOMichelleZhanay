/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.Empleados.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class comercial extends Empleado {
    private double comision; 

    public comercial() {
    }

    public comercial(double comison) {
        this.comision = comison;
    }

    public comercial(double comison, String Nombre, int Edad, double Salario) {
        super(Nombre, Edad, Salario);
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
      
     return ("NOMBRE: "+ Nombre +"EDAD: "+Edad +"SALARIO: "+Salario+"COMISION: "+comision);
 }
    
}
