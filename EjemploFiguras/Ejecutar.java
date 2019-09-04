/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFiguras;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingre 1 para circulo \n 2 para triangulo  \n 3 para cuadrado");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                Circulo objeto = new Circulo();
                System.out.println("Ingrese el radio");
                double radio = entrada.nextDouble();
                System.out.println("El area es:" + objeto.calcularArea(radio));
                System.out.println("El perimeto es:" + objeto.calcularPerimetro(radio));
            case 2:
                Triangulo objeto1 = new Triangulo();
                System.out.println("Ingrese el Lado");
                double lado = entrada.nextDouble();
                System.out.println("El area es:" + objeto1.calcularArea(lado, lado));
                System.out.println("El perimeto es:" + objeto1.calcularPerimitro(lado, lado, lado));
            case 3:
                Cuadrado objeto2 = new Cuadrado();
                System.out.println("Ingrese el Lado");
                double lado1 = entrada.nextDouble();
                System.out.println("El area es:" + objeto2.calcularArea(lado1));
                System.out.println("El perimeto es:" + objeto2.calcularPerimetro(lado1));

                break;
        }
    }

}
