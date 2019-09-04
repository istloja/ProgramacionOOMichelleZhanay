/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author LENOVO
 */
public class Galletas_rellenas_de_nutella {
    
      private String ingredientes;
    private int cantidad;
    private String sabor;
    private double precio;
    
     public void consultar(){
        System.out.println("Esta es la receta de la galleta");
    }
    public void vender(){
        System.out.println("Este es el precio de la galleta " + 0.35);
    }
    public void preparar(){
        System.out.println("Esta fue la preparacion de la galleta");
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
      public static void main(String[] args) {
         Galletas_rellenas_de_nutella galletaobjeto=new Galletas_rellenas_de_nutella();
         galletaobjeto.setCantidad(2);
         galletaobjeto.setSabor("vainilla_rellena_de_nutella");
        galletaobjeto.consultar();
        galletaobjeto.vender();
        galletaobjeto.preparar();
          System.out.println(galletaobjeto.getCantidad());
          System.out.println(galletaobjeto.getSabor());
    }
    
}
