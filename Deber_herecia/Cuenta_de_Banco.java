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
public class Cuenta_de_Banco {
    public String Dueño;
    public float Dolares;

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public float getDolares() {
        return Dolares;
    }

    public void setDolares(float Dolares) {
        this.Dolares = Dolares;
    }
    public void Actualizacion_de_Saldo(){
        System.out.println("Su saldo esta actualizado");
    }
    public void Saldo_en_dolares (){
        System.out.println("Su saldo es:"+22+"Dolares");
    }
    
}
