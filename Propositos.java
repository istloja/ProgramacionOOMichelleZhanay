/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion_Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author LENOVO
 */
public class Propositos {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\LENOVO\\Desktop\\Propositos.txt");
        try {
            FileReader lector = new FileReader(archivo);//pasar el archivo a un objeto
            BufferedReader re = new BufferedReader(lector);// sirve para recorrer el archivo 
            String linea = "";
            while ((linea=re.readLine()) != null) {// leer linea por linea el archivo
                System.out.println(linea);
            }
            re.close();//para cerrar el archivo
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);
        }

    }
    }
    
    

