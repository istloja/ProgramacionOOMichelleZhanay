/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerialisable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class LeeryEscribir {

    public void escribirarchivo(String rutaArchivo, Persona persona) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            ejemplo.writeObject(persona);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error " + e);

        }
    }

    public void leerarchivo(String rutaArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            Object auxiliar = leer.readObject();

            //System.out.println(persona.getMascota().getNombre()); / lo utilizas solo para leer un solo objeto
            while (auxiliar != null) { // esto es para leer varios objetos 
                Persona persona = (Persona) auxiliar;
                System.out.println(persona.getMascota().getNombre());
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);

        }
    }

    public void escribir_lista(String rutaArchivo, List<Persona> listaPersona) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            for (Persona persona : listaPersona) {
                ejemplo.writeObject(persona);

            }
        } catch (Exception e) {

        }

    }

    public List<Persona> lista(String rutaArchivo) {
        List<Persona> lista = new ArrayList<>();

        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            Object aux = leer.readObject();
            while (aux != null) { 
                Persona persona = (Persona)aux;
                lista.add (persona);
                aux = leer.readObject();
                
            }
        } catch (Exception e) {

        }
        return lista;
    }

    public static void main(String[] args) {
        LeeryEscribir obj = new LeeryEscribir();
        Persona objeto = new Persona("Juan", "Cartuche", 25, new Mascota("Rufus", 4));
        Persona objeto2 = new Persona("Sheila", "Zhanay", 16, new Mascota("Luna", 4));
        Persona objeto3 = new Persona("Luis", "Torres", 20, new Mascota("Firulais", 4));
        Persona objeto4 = new Persona("Aaron", "Maria", 10, new Mascota("Pico", 4));
        List<Persona> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        obj.escribir_lista("C:\\Users\\LENOVO\\Desktop\\Datos.txt", lista);
        obj.leerarchivo("C:\\Users\\LENOVO\\Desktop\\Datos.txt");
        List<Persona>lista1=obj.lista("C:\\Users\\LENOVO\\Desktop\\Datos.txt");
        for (Persona persona : lista1){
            System.out.println(persona.getNombre());
        }

        //obj.escribirarchivo("C:\\Users\\LENOVO\\Desktop\\Datos.txt", objeto);
        // obj.leerarchivo("C:\\Users\\LENOVO\\Desktop\\Datos.txt");
    }
}
