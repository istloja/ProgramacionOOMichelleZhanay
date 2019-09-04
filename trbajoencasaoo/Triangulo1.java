/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trbajoencasaoo;

/**
 *
 * @author LENOVO
 */
public class Triangulo1 extends DosDimensiones_2{
    String estilo;
    
    double area(){
        return base*altura/2;
    }
    void mostrarEstilo (){
        System.out.println("Triangulo es " + estilo);
    }

    void setBase(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAltura(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Lados_3{
    public static void main(String[] args) {
        Triangulo t1 =new Triangulo();
        Triangulo t2 =new Triangulo();
        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";
        
        t2.base = 8.0;
        t2.altura = 12.0;
        t2.estilo = "Estilo 2";
        
        System.out.println("Informacion para T1");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su area es:" + t1.area());
        
        System.out.println();
        
        System.out.println("Informacios para T2");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su area es:" + t2.area());
    }
}
