/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Archivos {
    public static void main(String[] args) {
       int op = 0;
        Scanner dato = new Scanner(System.in);
        try {
            System.out.println("Elija la opcion:  1) Enlistar los archivos de escritorio   2) Enlistar los archivos de documentos  3) Enlistar los archivos de imagenes  4) Enlistar los archivos de videos   5) Enlistar los archivos de musica");
            op = dato.nextInt();
            if (op > 0) {
                switch (op) {
                    case 1:
                        File carpeta = new File("C:\\Users\\LENOVO\\Desktop");
                        String[] archivos = carpeta.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 2:
                        File carpeta1 = new File("C:\\Users\\lENOVO\\Documents");
                        archivos = carpeta1.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 3:
                        File carpeta2 = new File("C:\\Users\\lENOVO\\Pictures");
                        archivos = carpeta2.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 4:
                        File carpeta3 = new File("C:\\Users\\LENOVO\\Videos");
                        archivos = carpeta3.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 5:
                        File carpeta4 = new File("C:\\Users\\LENOVO\\Downloads");
                        archivos = carpeta4.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    default:
                        System.out.println("Por favor ingrese un numero del 1 al 5 ");
                        break;
                }
            } else {
                System.out.println("ingrese un numero mayor a 0");
            }
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion" + e);
        }
        System.out.println("El numero ingresado es" + op);
    }
}
