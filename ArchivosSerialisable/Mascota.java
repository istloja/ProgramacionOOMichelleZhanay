/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerialisable;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Mascota implements Serializable{
    private String nombre;
    
    private int numero_patas;

    public Mascota(String nombre, int numero_patas) {
        this.nombre = nombre;
        this.numero_patas = numero_patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }
    
 }
