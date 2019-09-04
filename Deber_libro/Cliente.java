/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_libro;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Cliente {

    private String numero_de_cuenta;
    private int saldo_inicio;
    private int total_articulos;
    private int total_crecito;
    private int limite_de_credito;

    public String getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(String numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public int getSaldo_inicio() {
        return saldo_inicio;
    }

    public void setSaldo_inicio(int saldo_inicio) {
        this.saldo_inicio = saldo_inicio;
    }

    public int getTotal_articulos() {
        return total_articulos;
    }

    public void setTotal_articulos(int total_articulos) {
        this.total_articulos = total_articulos;
    }

    public int getTotal_crecito() {
        return total_crecito;
    }

    public void setTotal_crecito(int total_crecito) {
        this.total_crecito = total_crecito;
    }

    public int getLimite_de_credito() {
        return limite_de_credito;
    }

    public void setLimite_de_credito(int limite_de_credito) {
        this.limite_de_credito = limite_de_credito;
    }
    public int calcularSaldo(){
        return saldo_inicio + total_articulos - limite_de_credito;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente objeto = new Cliente();
        System.out.println("Ingrese el numero de cuenta ");
        objeto.setNumero_de_cuenta(entrada.nextLine());
        System.out.println("Ingrese el saldo inicial");
        objeto.setSaldo_inicio(entrada.nextInt());
        System.out.println("Ingrese el total de articulos");
        objeto.setTotal_articulos(entrada.nextInt());
        System.out.println("Ingrese el total de creditos");
        objeto.setTotal_crecito(entrada.nextInt());
        System.out.println("Ingrese el limite de credito");
        objeto.setLimite_de_credito(entrada.nextInt());
        
         // calculo de saldo
        
        int saldo= objeto.calcularSaldo();
        if (saldo>objeto.getLimite_de_credito()){
            System.out.println("Se excedio el limite para su credito");
        }else {
            System.out.println("No se excedio el limite");
        }

    }

   


}
