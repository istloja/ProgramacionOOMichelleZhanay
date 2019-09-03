/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRABAJO_BIMESTRAL.pesoyaltura;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private String Nombre;
    private int edad;
    private int Dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String Nombre, int edad, int Dni, char sexo, double peso, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Dni = Dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }
    public int CalcularIMC (double peso,double altura){
        double calcular =(peso/Math.pow(altura,2 ));
        if (calcular >=20 && calcular<=25){
            return 0;
        } else  if(calcular <20) {
            return -1;
        }else {
            return 1;
        }
    }
    
    public boolean MayordeEdad(int edad){
        if (edad>=18){
            return true;
        }else {
            return false;
        }
    }

}
