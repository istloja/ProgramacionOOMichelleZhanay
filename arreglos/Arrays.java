
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {
        //ARREGLOS
        //1.
        
      /* int arreglo[] = new int[5];
        arreglo[0]=4;
        arreglo [1]=6;
        arreglo [2]=7;
        arreglo [3]=87;
        arreglo [4]=12;
         for(int i=0;i<arreglo.length;i++){
            System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
        }*/
        
        //2.
        
       /* Scanner dato = new Scanner (System.in);
        int arreglo[] = new int[5];
    
        //INGRESO DE DATOS AL ARREGLO POR TECLADO
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese un valor al vector");
            arreglo[i]=dato.nextInt();
            
        }
        // MOSTREAR LOS DAtOS DEL ARREGLO POR PANTALLA 
         for(int i=0;i<arreglo.length;i++){
            System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
        }*/
        
               
        // ARREGLO CON JOPTIONPANE
        
        //1.
        
        /*int arreglo[] = new int[5];
        arreglo [0]=4;
        arreglo [1]=6;
        arreglo [2]=7;
        arreglo [3]=87;
        arreglo [4]=12;
        for(int i=0;i<arreglo.length;i++){
            JOptionPane.showMessageDialog(null,"El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]); 
        }*/
        
        //2.
        
       /* int arreglo[] = new int[5];
         for(int i=0;i<arreglo.length;i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el vector")); 
        }
        for(int i=0;i<arreglo.length;i++){
            JOptionPane.showMessageDialog(null,"El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]); 
        }*/
        
       /* Scanner dato = new Scanner (System.in);
        int t=0;
        System.out.println("Ingrese el tamaño del arreglo");
        t= dato.nextInt();
        int arreglo[] = new int[t];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese un valor al vector");
            arreglo[i]=dato.nextInt();
        }
         for(int i=0;i<arreglo.length;i++){
            System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
        }*/
        
        // Guardar los numero pares en un vector del 2 al 100.
      /* Scanner dato = new Scanner (System.in);
        int a=2;
        System.out.println("Ingrese el tamaño del arreglo");
         int arreglo[] = new int[50];
         for(int i=0;i<arreglo.length;i++){
             arreglo[i]=a;
             a=a+2;
            System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
         }*/
        
        
        // SERIE FIBONACI
       /*  Scanner dato = new Scanner (System.in);
        int n=0;
        int a=0;
        int b=1;
        int c;
        System.out.println("Ingrese el tamaño del arreglo");
        n= dato.nextInt();
        int arreglo[] = new int[n];
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=b;
             c=a+b;
             a=b;
             b=c;
        }
        for(int i=0;i<arreglo.length;i++){
            
            System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
         }*/
        
        //COMO ORDENAR DATOS DE MAYOR A MENOR 
        Scanner dato = new Scanner (System.in);
        int t=0,aux;
        System.out.println("Ingrese el tamaño del arreglo");
        t= dato.nextInt();
        int arreglo[] = new int[t];
        // ingrese los datos al arreglo por teclado
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese un valor al arreglo");
            arreglo[i]=dato.nextInt();
        }
        //ORDENARLO POR EL METODO BURBUJA
         for (int i=0;i<arreglo.length-1;i++){
              for (int j=0;j<arreglo.length-1;j++){
                  if (arreglo[j]>arreglo[j+1]){
                      aux=arreglo[j];
                      arreglo[j]= arreglo[j+1];
                      arreglo[j+1]=aux;
                  }
              }
         }
         for(int i=0;i<arreglo.length;i++){
             System.out.println("El valor del vector en el indice "+"["+i+"]"+ " es igual a: "+arreglo[i]);
         }
     }
}
