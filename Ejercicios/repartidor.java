/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author LENOVO
 */
public class repartidor extends Empleado {
    private int zona;
    int numero=0;
    private double Plus;

    public repartidor(int zona) {
        this.zona = zona;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public  boolean Plus(){
      if(super.getEdad()<25 && this.zona==3){
         double Nuevo=(super.getSalario()+this.Plus);   
         super.setSalario(Nuevo);
         return true;
      }
   return(false);   
     
  }
     
  public String toString(){
        String Edad = null;
        String Salario = null;
  
      
  return ("NOMBRE: "+Nombre+"EDAD: "+Edad+"SALARIO: "+Salario+"Zona"+zona);
 }
  }

  
    

   

