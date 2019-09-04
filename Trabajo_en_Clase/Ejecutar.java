
package Trabajo_en_Clase;

import java.util.Date;
import java.util.LinkedList;


public class Ejecutar {
    public static void main(String[] args) {
        LinkedList cola = new LinkedList();
        Bicicleta objeto1=new Bicicleta("BMX", "hp500", 300,00, new Date(), false);
        cola.add(objeto1);
        Bicicleta objeto2 = new Bicicleta ("Montañera", "C1000", 450,00, new Date(),false);
        cola.add(objeto2);
        Bicicleta objeto3 = new Bicicleta ("Paseo","10dc",250,00,new Date (),false);
        cola.add(objeto3);
        Bicicleta objeto4 = new Bicicleta ("Megamo","1000",350,00,new Date (),false);
        cola.add(objeto4);
        Bicicleta objeto5 = new Bicicleta ("BMC","B200",550,00,new Date (),false);
        cola.add(objeto5);
        Bicicleta objeto6 = new Bicicleta ("CANYON","C150",650,00,new Date (),false);
        cola.add(objeto6);
        Bicicleta objeto7 = new Bicicleta ("LOOK","LK50",250,00,new Date (),false);
        cola.add(objeto7);
        Bicicleta objeto8 = new Bicicleta ("PROTEK","PK500",350,00,new Date (),false);
        cola.add(objeto8);
        Bicicleta objeto9 = new Bicicleta ("CANNONDALE","CNN1000",750,00,new Date (),false);
        cola.add(objeto9);
        Bicicleta objeto10 = new Bicicleta ("BIANCHI","BI500",450,00,new Date (),false);
        cola.add(objeto10);
        for (Object cola1 : cola) {
            System.out.println(cola1);
                
            }
        
        
    }
    
}
