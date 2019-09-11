package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public static void main(String[] args) {
        Conexion obj = new Conexion();
        obj.Conexion("root", "root");

    }
}
