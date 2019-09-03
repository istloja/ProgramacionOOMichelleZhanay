/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.Producto;

/**
 *
 * @author LENOVO
 */
public class Perecedero extends Producto {
    private int dias_para_calducar;
    private String dias_para_caducar;
    

    public Perecedero() {
    }

    public Perecedero(int dias_para_calducar) {
        this.dias_para_calducar = dias_para_calducar;
    }

    Perecedero(int i, String producto2, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public int getDias_para_calcular() {
        return dias_para_calducar;
    }

    public void setDias_para_calcular(int dias_para_calcular) {
        this.dias_para_calducar = dias_para_calcular;
    }
    
    public double Calcular (int Cantidad ){
        double total = (Cantidad* this.Precio);
        switch (this.dias_para_calducar){
            case 1:
                total=(total/4);
                break;
            case 2:
                total = (total/3);
                break;
            case 3:
                total=(total/2);
                break;
        }
        return(total);
    }
    public String toString(){
        return ("Nombre" + Nombre+ "Precio" + Precio+ "Dias a Caducar " +dias_para_caducar);
    }
}
