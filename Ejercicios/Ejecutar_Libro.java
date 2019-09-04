/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.Libro;

/**
 *
 * @author LENOVO
 */
public class Ejecutar_Libro extends Libro {

    public static void main(String[] args) {
        Libro L1 =  new Libro("Las Rosas","12531","Artuto",120);
        Libro L2 = new Libro("Los Mares","12546","Cristian",125);
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L1.Mayor (0) );
        
        
        
        

        

    }


    public Ejecutar_Libro(String ISBN, String Titulo, String Autor, int numeroPaginas) {
        super(ISBN, Titulo, Autor, numeroPaginas);
        
    }

    

}
