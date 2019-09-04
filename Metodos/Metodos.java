/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Metodos {

    /* public static void main(String[] args) {
     saludar();
     Metodos objeto = new Metodos ();// cuando un metodo no es estatico nos toca crear un objeto metodo
     objeto.despedir();
     }
    
     public static void saludar(){ // este presentamos con void main normal
     System.out.println("Hola mundo");
     }
    
     public  void despedir (){ //para presentar creamos un objeto metodo
     System.out.println("Nos vemos");

     }*/
   /* public static void main(String[] args) {
        Metodos objeto = new Metodos ();
        objeto.suma(5,8);
        int suma = objeto.suma1(6,8);
        System.out.println(suma);

    }

    public void suma(int numero1, int numero2) {
        System.out.println("La suma " + (numero1 + numero2));
    }

    public int suma1 (int numero1, int numero2) {
        return numero1 + numero2;
    }*/
    
   /* public static void main(String[] args) {
        Metodos objeto = new Metodos ();
        boolean inicio = objeto.iniciarsesion("Usuario","1234");
        System.out.println(inicio);
    }
    
    public boolean iniciarsesion (String usuario, String contraseña){
        boolean sesion=false;
        if (usuario.equals("Usuario")&&contraseña.equals("1234")){
            sesion=true;
        }
        return sesion;
    }*/
        public static void main(String[] args) {
            
        Scanner entrada=new Scanner (System.in);
        Metodos objeto = new Metodos ();
            System.out.println("ingrese usuario");
        String usuario= entrada.nextLine();
            System.out.println("ingrese contraseña");
        String contraseña = entrada.nextLine();
        
        boolean inicio = objeto.iniciarsesion("Usuario","1234");
        System.out.println(inicio);
        
        if(inicio){ 
            int suma = objeto.suma1(6,8);
            System.out.println(suma);
            int resta = objeto.resta(12, 8);
            System.out.println(resta);
            int multiplicacion = objeto.multiplicacion(5, 4);
            System.out.println(multiplicacion);
            double potencia =objeto.potencia(5,2);
            System.out.println(potencia); 
            double raiz = objeto.raiz(8);
            System.out.println(raiz);
        } else{
            System.out.println("El usuario es incorrecto");
        }
    }  
    public boolean iniciarsesion (String usuario, String contraseña){
        boolean inicio=false;
        if (usuario.equals("Usuario")&&contraseña.equals("1234")){ 
           inicio=true;
        } 
        return inicio;
    }
    public int suma1 (int numero1, int numero2) {
        return numero1 + numero2;
    }
    public int resta (int numero1, int numero2) {
        return numero1 - numero2;
    }
    public int multiplicacion (int numero1, int numero2) {
        return numero1 * numero2;
    }
    public double potencia (int numero1, int numero2){
            return Math.pow(5, 2);
    }
    public double raiz (int numero1){
          return Math.sqrt(8);
    }
      
}
    
        
    
