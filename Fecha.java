/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL;

/**
 *
 * @author LENOVO
 */
public class Fecha {
    private int dia;
    private int mes;
    private  int año;
    private int fechaactual;
    private int fecha;
    private String esBisiesto;

    public Fecha(int dia, int mes, int año, int fechaactual, int fecha, String esBisiesto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.fechaactual = fechaactual;
        this.fecha = fecha;
        this.esBisiesto = esBisiesto;
    }

  
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
   

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public int getFechaactual() {
        return fechaactual;
    }

    public void setFechaactual(int fechaactual) {
        this.fechaactual = fechaactual;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEsBisiesto() {
        return esBisiesto;
    }

    public void setEsBisiesto(String esBisiesto) {
        this.esBisiesto = esBisiesto;
    }
    
     public boolean FechaCorrecta(int dia,int mes, int año){
        if (fecha==fechaactual){
            return true;
        }else{
            return false;
        }
    }
     public boolean esBisiesto(int año,String esBisiesto){
         if (año==365){
             return false;
         }else {
             return true;
         }
     }
     public int DiaSiguiente(int dia){
         dia= dia+1;
         return dia;
     }
}

