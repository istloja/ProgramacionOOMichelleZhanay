/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author LENOVO
 */
public class cliente extends persona {
    public static void main(String[] args) {
        cliente objeto = new cliente ();
        objeto.setForma_de_pago("efectivo");
        System.out.println(objeto.getForma_de_pago());
        objeto.prueba();
    }
    private String forma_de_pago;
    private int fecha_de_ingreso;
    private int fecha_de_salida;

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public int getFecha_de_ingreso() {
        return fecha_de_ingreso;
    }

    public void setFecha_de_ingreso(int fecha_de_ingreso) {
        this.fecha_de_ingreso = fecha_de_ingreso;
    }

    public int getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(int fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }
    
    public void despedida(){
        System.out.println("Gracias por el servicio");
  
    }
    public void prueba (){
        despedida();
        super.despedirse();
    }
    
}
