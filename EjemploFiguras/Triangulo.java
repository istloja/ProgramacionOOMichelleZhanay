/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFiguras;

/**
 *
 * @author LENOVO
 */
public class Triangulo extends FiguraBidimensional {

    public double calcularPerimitro(double lado1, double lado2, double lado3) {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public double calcularArea(double base, double altura) {
        area = (base * altura) / 2;

        return area;
    }
}
