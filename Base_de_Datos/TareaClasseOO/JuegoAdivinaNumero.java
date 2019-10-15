/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaClasseOO;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JuegoAdivinaNumero extends Juego{
private int vidas;
int numero ;



    public JuegoAdivinaNumero() {
    }

    public JuegoAdivinaNumero(int vidas, int numero) {
        this.vidas = vidas;
        this.numero = numero;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public int Juega() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int ReiniciaPartida(int numero){
    
    numero = (int) (Math.random()*10);
    return numero;
    
}
    public static void main(String[] args) {
        int Numero=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 10 ");
        Numero = entrada.nextInt();
        System.out.println();
    }


}
