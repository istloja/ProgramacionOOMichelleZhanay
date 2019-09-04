/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescrituradearchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author LENOVO
 */
public class Clasescrituradearchivos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter("C:\\Users\\LENOVO\\Desktop\\prueba.txt");
            escritor = new PrintWriter(archivo);
            escritor.println("hola");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        archivo.close();
    }
}


