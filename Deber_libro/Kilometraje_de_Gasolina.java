/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_libro;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Kilometraje_de_Gasolina {
    

public static void main(String args[])
{ // Abre metodo main
Scanner entrada = new Scanner(System.in);
double galon  ;
double kilometros;

Calculo miObjeto = new Calculo();


System.out.println("Introduzca el numero de galones: (-1 para terminar)");
galon = entrada.nextDouble();
System.out.println("Introduzca el numero de kilometros: ");
kilometros = entrada.nextDouble();

while ( -1 != galon){

System.out.printf("El resultado es : %.2f ", miObjeto.Procesa_Datos(galon, kilometros));
System.out.println();
kilometros = entrada.nextDouble();
} 
}

    private static class Calculo{

        
           public double Procesa_Datos( double gl, double km){
    
           double promedio = km/gl;
            return promedio;
    }

}
        }
    

    