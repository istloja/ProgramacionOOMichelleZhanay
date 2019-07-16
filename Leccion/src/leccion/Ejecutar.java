/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion;

/**
 *
 * @author LENOVO
 */
public class Ejecutar {
    public static void main(String[] args) {
        Animal objetoanimal=new Animal ("perro", 20, 50, "blanco", 6);
        Ave objetoanimal2 = new Ave ("Carroña", "area","buitre", 8, 50, "negro", 5);
        Mamifero objetoanimal3 = new Mamifero("Bipedo", true, "Canguro", 30, 1.80,"Cafe", 20);
        System.out.println(objetoanimal.informacionAnimal());
        System.out.println(objetoanimal2.informacionAnimal());
        System.out.println(objetoanimal3.informacionAnimal());
    }
   
            
           
    
}
