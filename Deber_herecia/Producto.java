
package Deber_herecia;


public class Producto {
    public float precio;
    public String calidad;
    public int fecha_caducidad;
    public int codigo;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(int fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void mostrar_fecha (){
        System.out.println(" La fecha es:" + 12 +"/"+02+"/"+2019);
    }
    public void mostrar_el_precio (){
        System.out.println("El precio es:" + 3.65);
    }
    
    
}
