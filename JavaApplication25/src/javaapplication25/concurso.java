
package javaapplication25;

import java.util.Scanner;

public class concurso {
    private static Object arreglo;
    public static void main(String[] args) {
        
        //1.Declara dos varibles numericas con el valor que desees muestra en pantalla suma, resta, multiplicacion , division y modulo
       
        /*int a=5,b=9;
        System.out.println("el resultado de la operacion es:" + (a+b));
        System.out.println("el resultado de la operacion es:" + (a-b));
        System.out.println("el resultado de la operacion es:" + (a*b));
        System.out.println("el resultado de la operacion es:" + (a/b));
        System.out.println("el resultado de la operacion es:" + (a%b));*/
        
        //2.Ingrese el valor de un producto y calcule el iva
        
        /* Scanner dato = new Scanner(System.in);
        double producto,c;
        System.out.println("ingrese el valor de un producto");
        producto = dato.nextDouble();
        System.out.println("el valor es " + producto*0.12);// solo para calcular el iva de un valor */
        
        //3. Muestre los numero del 1 al 100
        
        /* for(int i=0;i<101;i++){
            System.out.println(i);
        }*/
        
        //4. Ingrese un numero y que diga si es para o impar
        
       /* Scanner dato = new Scanner(System.in);
        int a=0;
        System.out.println("ingrese un numero");
       a=dato.nextInt();
       if (a%2==0){
           System.out.println("el numero es par");
       }else {
           System.out.println("el numero es impar");
       }*/
        
        //5. calcula el area de un circulo
        
        /* double radio=0,a=0;
        Scanner dato= new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=dato.nextDouble();
        a=radio*(Math.PI)*2;
        System.out.println("el area es " + a);*/
        
        //6. un numero ingresado calcule si es primo o no 
        
        Scanner dato = new Scanner(System.in);
        int a;
        System.out.println("ingrese un numero");
       a=dato.nextInt();
       if (a%2==0){
           System.out.println("no es primo");
       }else {
           System.out.println("es primo ");
       }
        
        
        
    }
    }

  
    

