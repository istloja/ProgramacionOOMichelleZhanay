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
public class Encontrar_el_valor_mas_grande {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        int mayor=0,reciente=0;
        for (int i=0; i<10;i++){
            int valor = entrada.nextInt();
            reciente = valor;
            if (valor>mayor){
                mayor = valor;
            }
            
        } 
        System.out.println("El reciente es:" + reciente);
        System.out.println("El mayor es:" + mayor);
    }  
    
}
    

