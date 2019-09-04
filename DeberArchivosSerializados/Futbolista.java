/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberArchivosSerializados;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Futbolista implements Serializable {

    private int numero;
    private String posicion;
    private int años;
    private String nombre;
    private DeberArchivosSerializados.Equipo equipo;

    public Futbolista(int numero, String posicion, int años, String nombre, Equipo equipo) {
        this.numero = numero;
        this.posicion = posicion;
        this.años = años;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Futbolista verificarMenos(List<Futbolista> lista) {
        Futbolista menor = lista.get(0);
        for (Futbolista futbolista : lista) {
            if (menor.getAños() > futbolista.getAños()) {
                menor = futbolista;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Programacion", 6);
        mapa.put("Ingles", 7);
        mapa.put("Base de datos", 10);
        mapa.put("Algebra", 5);
        System.out.println(mapa.get("Programacion"));
        System.out.println(mapa.get("Ingles"));
        System.out.println(mapa.get("Base de datos"));
        System.out.println(mapa.get("Algebra"));
        System.out.println(mapa.get("Algebra") + 1);
        mapa.remove("Ingles");
        System.out.println(mapa);

        HashMap<String, Equipo> mapa1 = new HashMap<>();
        mapa1.put("Emelec", new Equipo("marlon", 11, "ecuador"));
        mapa1.put("Barcelona", new Equipo("Ramiro", 11, "ecuador"));
        mapa1.put("Nacional", new Equipo("rafael", 11, "ecuador"));
        System.out.println(mapa1.get("Barcelona").getNumerodeTitulos());
        System.out.println(mapa1.get("ecuador").getCiudad());

    }
}
