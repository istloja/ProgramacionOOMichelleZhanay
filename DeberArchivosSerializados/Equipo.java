/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberArchivosSerializados;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Equipo implements Serializable {
    private String categoria;
    private int jugadores;
    private int numero_copas;
    private String nombre_equipo;

    public Equipo(String categoria, int jugadores, int numero_copas, String nombre_equipo) {
        this.categoria = categoria;
        this.jugadores = jugadores;
        this.numero_copas = numero_copas;
        this.nombre_equipo = nombre_equipo;
    }

    Equipo(String marlon, int i, String ecuador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumero_copas() {
        return numero_copas;
    }

    public void setNumero_copas(int numero_copas) {
        this.numero_copas = numero_copas;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }
    
    
    
}
