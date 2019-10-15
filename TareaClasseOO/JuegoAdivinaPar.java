/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaClasseOO;

/**
 *
 * @author LENOVO
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public int ValidaNumero() {
        int par = 0;
        if (numero % 2 ==0) {
            return numero;

        } else {
            System.out.println("Error");
        }
        return 0;

    }

}
