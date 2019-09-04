package Trabajo_en_Clase;

import java.util.Date;

public class Bicicleta {

    public String tipo;
    public String modelo;
    public double precio;
    public Date fecha_prestamo;
    public boolean estado;

    public Bicicleta(String tipo, String modelo, double precio, Date fecha_prestamo, boolean estado) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha_prestamo = fecha_prestamo;
        this.estado = estado;
    }

    Bicicleta(String bmx, String hp500, int i, int i0, Date date, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + ", modelo=" + modelo + ", precio=" + precio + ", fecha_prestamo=" + fecha_prestamo + ", estado=" + estado + '}';
    }

    
   
    

}
