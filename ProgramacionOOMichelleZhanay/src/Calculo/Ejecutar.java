
package Calculo;

import static Calculo.Calcular.grados;
import java.util.Scanner;


public class Ejecutar {

    private static double valor;
    private static double grados;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la funcion trigonometrica: \n 1 para Seno \n 2 para Coseno \n 3 para Tangente");
        int res = entrada.nextInt();
        switch (res) {
            case 1:
               CalculoSeno objeto = new CalculoSeno();
                System.out.println("Ingrese el valor");
                double grado = entrada.nextDouble();
                double valor = entrada.nextDouble();
                System.out.println("El grado es "+objeto.CalculoGrados(grado));
                System.out.println("El valor de seno es "+objeto.CalculoSeno(valor));
                break;
            case 2:
               CalculoCoseno objeto1 = new CalculoCoseno();
                System.out.println("Ingrese el valor");
                double grado1 = entrada.nextDouble();
                double valor1 = entrada.nextDouble();
                System.out.println("El grado es "+objeto1.CalculoGrado1(grado1));
                System.out.println("El valor de seno es "+objeto1.CalculoCoseno(valor1));
               break;
            case 3:
                CalculoTangente objeto2 = new CalculoTangente();
                System.out.println("Ingrese el valor");
                double grado2 = entrada.nextDouble();
                double valor2 = entrada.nextDouble();
                System.out.println("El grado es "+objeto2.CalculoGrado2(grado2));
                System.out.println("El valor de seno es "+objeto2.CalculoTangente(valor2));
                break;
        }
    }

   

 
}
    