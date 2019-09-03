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
public class No_Perecedero extends Producto{
    private String Tipo;

    public No_Perecedero() {
    }

    public No_Perecedero(String Tipo) {
        this.Tipo = Tipo;
    }

    public No_Perecedero(String Tipo, String Nombre, double Precio) {
        super(Nombre, Precio);
        this.Tipo = Tipo;
    }

  
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String toString(){
          return ("Nombre" + Nombre+ "Precio" + Precio+ "Tipo " +Tipo);
    }
    
}
