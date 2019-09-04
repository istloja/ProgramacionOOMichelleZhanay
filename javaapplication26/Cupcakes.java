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
public class Cupcakes {
    
    private String ingredientes;
    private int cantidad;
    private String sabor;
    private double precio;
    
     public void consultar(){
        System.out.println("Esta es la receta de los cupcakes");
    }
    public void vender(){
        System.out.println("Este es el precio de los cupcakes " + 0.60);
    }
    public void preparar(){
        System.out.println("Esta fue la preparacion de los cupcakes");
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
         Cupcakes cupcakeobjeto=new Cupcakes();
         cupcakeobjeto.setCantidad(10);
         cupcakeobjeto.setSabor("vainilla");
         cupcakeobjeto.setPrecio(0.60);
        cupcakeobjeto.consultar();
        cupcakeobjeto.vender();
        cupcakeobjeto.preparar();
          System.out.println(cupcakeobjeto.getCantidad());
          System.out.println(cupcakeobjeto.getSabor());
          System.out.println(cupcakeobjeto.getPrecio());
    }
    
}
