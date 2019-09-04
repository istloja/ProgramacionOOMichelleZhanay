/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class metodos_string {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String persona="Maria";
        String nombre= "Juan";
        System.out.println(persona.lastIndexOf("a"));
        System.out.println(persona.toUpperCase());
        System.out.println(persona.toLowerCase());
        System.out.println(persona.concat(nombre));
        System.out.println(persona.equalsIgnoreCase(nombre));
        System.out.println(Arrays.toString(persona.toCharArray()));
        
}
}