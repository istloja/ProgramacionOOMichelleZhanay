package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Conexion {

    public void Conexion(String usuario, String clave) {

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
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        Conexion poo = new Conexion();
        poo.Conexion("root", "root");
        try {
             poo.escribir("root", "root", 11 , "Nilvania" , "Geminis" , "1900557214", 18);
             poo.escribir("root", "root", 13 , "Nilvania" , "Guerrero" , "190447214", 19);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        Scanner entrada = new Scanner (System.in);
        String idpersona = "";
            String nombre = "";
            String apellido = "";
            String cedula = "";
            String edad = "";
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese su informacion para registrarse en la base de datos:");
            System.out.println("Ingrese idpersona" + idpersona);
            idpersona = entrada.next();
            System.out.println("Ingrese tu nombre" + nombre);
            nombre = entrada.next();
            System.out.println("Ingrese su apellido" + apellido);
            apellido = entrada.next();
            System.out.println("Ingrese su cedula" + cedula);
            cedula = entrada.next();
            System.out.println("Ingrese su edad " + edad);
            edad = entrada.next();
            System.out.println("Se guardo en la base de datos.");
            
        }
    }

}
