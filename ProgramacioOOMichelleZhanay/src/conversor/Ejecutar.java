/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese 1 m a Km \n ingrese 2 para m a Hec \n ingrese 3 para m a Dec \n ingrese 4 para m a dm \n ingrese 5 para m a cm \n ingrese 6 para m a mm ");
        int opc = entrada.nextInt();
        switch (opc){
            case 1:
                Km objeto = new Km ();
                System.out.println("ingrese la cant en metros");
                double cant=entrada.nextDouble();
                System.out.println(objeto.CalcularM_Km(cant));
                break;
            case 2:
                Hec objeto1 = new Hec();
                System.out.println("ingrese la cant en metros");
                double cant1=entrada.nextDouble();
                System.out.println(objeto1.CalcularM_hec(cant1));
                break;
            case 3:
                Dec objeto2= new Dec();
                System.out.println("ingrese la cant en metros");
                double cant2=entrada.nextDouble();
                System.out.println(objeto2.CalcularM_Dec(cant2));
                break;
            case 4:
                deci objeto3= new deci();
                System.out.println("ingrese la cant en metros");
                double cant3=entrada.nextDouble();
                System.out.println(objeto3.CalcularM_deci(cant3));
                break;
            case 5:
                cm objeto4= new cm();
                System.out.println("ingrese la cant en metros");
                double cant4=entrada.nextDouble();
                System.out.println(objeto4.CalcularM_cm(cant4));
                break;
            case 6:
                mm objeto5= new mm();
                System.out.println("ingrese la cant en metros");
                double cant5=entrada.nextDouble();
                System.out.println(objeto5.CalcularM_mm(cant5));
                break;
        }
    }
}
