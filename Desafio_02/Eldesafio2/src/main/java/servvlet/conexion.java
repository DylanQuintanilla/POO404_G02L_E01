package servvlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static Connection ConectarBD(String bd) {
        Connection conexion;
        String host = "jdbc:mysql://localhost:3306/" +bd;
        String user = "root";
        String password = "123456";

        System.out.println("Conectando...");
        try {
            conexion = DriverManager.getConnection(host + bd, user, password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    public static void Desconectar(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Desconectado");
            } catch (SQLException e) {
                System.out.println("Error al desconectar: " + e.getMessage());
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("No hay conexión para cerrar.");
        }
    }
}  //conexion
