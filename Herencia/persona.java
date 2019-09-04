package Herencia;

public class persona {
     private String nombre;
     private String direccion;
     private int telefono;
     private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
     private int cedula;
     
     
     public void saludar(){
        System.out.println("Hola buen dia");
    }
    public void despedirse(){
        System.out.println("Hasta luego");
    }  
    
    
}
