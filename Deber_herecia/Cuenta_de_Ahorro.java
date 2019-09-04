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
public class Cuenta_de_Ahorro extends Cuenta_de_Banco {
    public static void main(String[] args) {
        Cuenta_de_Ahorro objeto = new Cuenta_de_Ahorro();
        objeto.setDueño("Dayana");
        System.out.println(objeto.getDueño());
        objeto.prueba();
        
    }
    private float interes_anual_por_ahorra;

    public float getInteres_anual_por_ahorra() {
        return interes_anual_por_ahorra;
    }

    public void setInteres_anual_por_ahorra(float interes_anual_por_ahorra) {
        this.interes_anual_por_ahorra = interes_anual_por_ahorra;
    }
    
    public void Actualizacion_de_Saldo(){
        System.out.println("No dispone de saldo en su cuenta");
    }
    public void prueba(){
        Actualizacion_de_Saldo();
        super.Actualizacion_de_Saldo();
    }
    
}
