/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
public class Perro {
    private String raza;
    private int edad;
    private String nombre;
    private String color;
    private double peso;
    
    public void ladrar(){
        System.out.println("soy un perro y ladro");
    }
    public void caminar(){
        System.out.println("soy un perro y camino");
    }
    public void morder(){
        System.out.println("soy un perro y muerdo");
    }
    public static void main(String[] args) {
        Perro perroobjeto=new Perro();
        perroobjeto.ladrar();
        perroobjeto.caminar();
        perroobjeto.morder();
    }
}
