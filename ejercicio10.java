package ejericio10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class ejercicio10 {

    public static void main(String[] args) {
        String linea = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("ingrese el texto a escribir");
        String texto = entrada.nextLine();
        ejercicio10 objeto = new ejercicio10();
        objeto.Escribir(direccion, texto);
        ejercicio10 objeto1 = new ejercicio10();
        objeto.Leer(direccion, linea);
        ejercicio10 objeto2 = new ejercicio10();
        objeto.mayusculas(direccion);

    }

    public void Escribir(String direccion, String texto) {

        try {
            FileWriter fichero = new FileWriter(direccion);
            PrintWriter escribir = new PrintWriter(fichero);
            escribir.println(texto);
            fichero.close();
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e.getMessage());
        }

    }

    public void Leer(String direccion, String linea) {
        try {
            FileReader lector = new FileReader(direccion);
            BufferedReader re = new BufferedReader(lector);

            while ((linea = re.readLine()) != null) {
                System.out.println(linea);
            }
            re.close();
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e);
        }
    }

    public void mayusculas(String direccion) {
        try {
            FileReader lector = new FileReader(direccion);
            BufferedReader re = new BufferedReader(lector);
            int valor = re.read();
            while (valor != -1) {
                char caracter = (char) valor;
                if (caracter >= 96 && caracter <= 122) {
                    caracter -= 32;
                } else if (caracter >= 65 && caracter <= 90) {
                    caracter += 32;
                }
                System.out.print(caracter);
                valor = re.read();
            }
            re.close();

        } catch (Exception e) {
            System.out.println("ocurrio el error" + e);
        }

    }
}
