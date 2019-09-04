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
public class Galletas_de_chispas_de_chocolate {

    private String ingredientes;
    private int cantidad;
    private String sabor;
    private double precio;

    public void consultar() {
        System.out.println("Esta es la receta de la galleta");
    }

    public void vender() {
        System.out.println("Este es el precio de la galleta " + 0.35);
    }

    public void preparar() {
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
        Galletas_de_chispas_de_chocolate galletaobjeto = new Galletas_de_chispas_de_chocolate();
        galletaobjeto.setCantidad(4);
        galletaobjeto.setSabor("chispas_de_chocolate");
        galletaobjeto.consultar();
        galletaobjeto.vender();
        galletaobjeto.preparar();
        System.out.println(galletaobjeto.getSabor());
        System.out.println(galletaobjeto.getCantidad());

    }
}
