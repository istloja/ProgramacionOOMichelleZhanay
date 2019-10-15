/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class base_dato {

    public void Base_dato(String usuario, String clave) {

        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection michelle = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            System.out.println(michelle.getCatalog());
            Statement s = michelle.createStatement(); // inicializamos la consulta
            ResultSet resultado = s.executeQuery("Select * from persona");
            while (resultado.next()) {
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getInt("cedula"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void escribir(String usuario, String clave, int idpersona, String nombre, String apellido, String cedula, int edad) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("inser into persona values (? , ? , ? , ? , ?)");
            s.setInt(1, idpersona);
            s.setString(2, nombre);
            s.setString(3, apellido);
            s.setString(4, cedula);
            s.setInt(5, edad);
            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        base_dato conec = new base_dato();
//        conec.Base_dato("root","root");
//        conec.escribir("root", "root",112512,"Juan","Riofrio","1104162787",23);
//        conec.escribir("root", "root",125545,"Maribel","Riofrio","1201456975",18);
//conec.actualizar("root", "root", 122546, "Carmen");
//        conec.actualizar("root", "root", 5, "Carmen", "Salinas", "1104162548");// para cambiar nombres 
//        conec.actualizar("root", "root", 1, "Katherin", "Zhanay", "115486974");
conec.eliminar("root", "root",1);
    }

    public void actualizar(String usuario, String clave, int idpersona, String nombre, String apellido, String cedula) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("UPDATE persona set nombre=?,apellido=? ,cedula=? where idpersona=?");
            s.setString(1, nombre);
            s.setString(2, apellido);
            s.setString(3, cedula);
            s.setInt(4, idpersona);
            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
       
    }
    
    public void eliminar (String usuario, String clave,int idpersona) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("DELETE from persona where idpersona=?"); 
            s.setInt(1, idpersona);
            s.executeUpdate();
           
}       catch (SQLException e) {
            System.out.println(e);
        }
    }
}


