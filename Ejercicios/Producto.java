/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.Producto;

/**
 *
 * @author LENOVO
 */
public class Producto {
    String Nombre;
    double Precio;
   

    public Producto() {
    }

    public Producto(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public double Calcular(double Cantidad){
        
        return (this.Precio*Cantidad);
        
    }
    public String toString(){
        return ("Nombre" + Nombre+ "Precio" + Precio);
    }
}
