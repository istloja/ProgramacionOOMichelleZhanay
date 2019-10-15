/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.ejemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ejemplo {
    
    public static void main(String[] args) {
        HashMap<String, Double> mapa=new HashMap<>(); 
        Scanner entrada = new Scanner(System.in);
        mapa.put("1900681667", 8.25);
        mapa.put("1104162787", 6.25);
        mapa.put("0701994875", 8.00);
        mapa.put("1104254584", 7.55);
        mapa.put("0706658786", 6.75);
        mapa.put("1856479965", 9.05);
        mapa.put("0745669978", 4.50);
        mapa.put("1125459877", 2.69);
        mapa.put("1205454878", 10.0);
        mapa.put("1104162877", 6.99);

        System.out.println(mapa);
    }
    
    public double Calcular(HashMap<String, Double> mapa){
        
        for (Map.Entry<String, Double> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
                 
            
               }
  
        return 0;
    }
    }
    

