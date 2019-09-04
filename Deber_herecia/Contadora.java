/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_herecia;

/**
 *
 * @author LENOVO
 */
public class Contadora extends Concesionario{
    public static void main(String[] args) {
        Contadora objeto = new Contadora();
        objeto.setNombre("Victoria");
        System.out.println(objeto.getNombre());
        objeto.prueba();
        
    }
    public String rango;
    public String seguro;
    public int horas_laboradas;

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }
    public void Dias_de_atencion(){
        System.out.println("Los dias de atencion son:" + "Lunes\n" + "a\n"  + "Sabado\n");
    }
    public void prueba(){
        Dias_de_atencion();
        super.Dias_de_atencion();
    }
}
