/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.Fracciones;

/**
 *
 * @author LENOVO
 */
public class Fraccion extends Fracciones{
    
    private double suma;
    private double resta;
    
    public static void main(String[] args) {
      Fraccion f1 = new Fraccion (1,4);
      Fraccion f2 = new Fraccion (1,2);
      Fraccion f3 = new Fraccion (4,1);
      Fraccion Suma = f1.sumar(f2);
      Fraccion resta = f2.restar(f3);
        System.out.println(f1.suma(0, 0));
        System.out.println(f2.resta(0, 0));
      
    }

    public Fraccion(int num, int den) {
        super(num, den);
    }

    public Fraccion sumar(Fraccion f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fraccion restar(Fraccion f3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
