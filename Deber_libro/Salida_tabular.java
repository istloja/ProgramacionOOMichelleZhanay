/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_libro;

/**
 *
 * @author LENOVO
 */
public class Salida_tabular {

    public static void main(String[] args) {
        int k = 0 ;
       /* String cadena = "Numero \t 10*N \t 100*N \t 1000*N";
        String valor1 = "1 \t 10  \t 100 \t 10000";
        String valor2 = "2 \t 20  \t 200 \t 20000";
        String valor3 = "3 \t 30  \t 300 \t 30000";
        String valor4 = "4 \t 40  \t 400 \t 40000";
        String valor5 = "5 \t 50  \t 500 \t 50000";*/
        for (int i = 1, j = i * 10; i < 6; i++, j = i * 100,k=i*1000) {
           
            System.out.println("\t " + i + " \t " + j+ "\t" + k);

        }
    }
       /* System.out.println(cadena);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println(valor5);

    }*/
}
