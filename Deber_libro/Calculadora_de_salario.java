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
public class Calculadora_de_salario {
    public static void main(String[] args) {
        int horas_trabajadas;
        int sueldo_por_horas;
        int sueldo ;
        double sueldo2 ;
        int horas_extras = 0;
        int sueldo_final;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduzca el valor de cada hora trabajada");
        sueldo_por_horas=entrada.nextInt();
        System.out.println("Introduzca las horas trabajadas");
        horas_trabajadas=entrada.nextInt();
        if(horas_trabajadas<40){   
            sueldo=(horas_trabajadas*sueldo_por_horas);
            System.out.println("El sueldo bruto es " + sueldo);
            
                
        }if(horas_trabajadas>40){
            sueldo2=(horas_extras+horas_trabajadas*sueldo_por_horas)*1.5;
            System.out.println("El sueldo es " + sueldo2);
        }
            
        
        }
        }
        
        
        
                
    
    

