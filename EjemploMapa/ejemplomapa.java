/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploMapa;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ejemplomapa {

    public static void main(String[] args) {
//        HashMap<String, String> mapa = new HashMap<>();
//        
//        Scanner entrada = new Scanner(System.in);
//        String Ciudad = "";
//        String codigo = "";
//        for (int i= 0; i < 5; i++) {
//            System.out.println("Ingrese su codigo" + codigo);
//            codigo = entrada.next();
//            System.out.println("Ingrese su ciudad" + Ciudad);
//            Ciudad = entrada.next();
//            mapa.put(codigo, Ciudad);
//        }
//        System.out.println(mapa);

        HashMap<String, Integer> mapa1 = new HashMap<>();
        Scanner entrada1 = new Scanner(System.in);
        String Cedula = "";
        int edad=0;
        for (int i= 0; i < 3; i++) {
            System.out.println("Ingrese su Cedula" + Cedula);
            Cedula = entrada1.next();
            System.out.println("Ingrese su edad" + edad);
            edad = entrada1.nextInt();
            mapa1.put(Cedula,edad);
        }
        
        System.out.println("Ingrese su cedula"+Cedula);
        Cedula=entrada1.next();
        mapa1.remove(Cedula);
        System.out.println(mapa1);
        

    }
        
    
}
