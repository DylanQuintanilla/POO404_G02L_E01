package sv.edu.udb.util;
import java.sql.*;

//Clase Conexion JDBC
//@author Rafael Torres


public class Conexion {

    //Valores de conexion a MySql

    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    //El puerto es opcional

    private static String JDBC_URL=
    "jdbc:mysql://localhost:3308/personas";

    private static String JDBC_USER="root";
    private static String JDBC_PASS="";
    private static Driver driver=null;

    //para que no haya problemas al obtener la conexion de
    //manera concurrente, se usa la palabra synchronized

    public static synchronized Connection getConnection()
        throws SQLException {
        Connection con = null;

        if(driver ==null){
            try {
                //se registrara el driver

                class.forName(JDBC_DRIVER);

                //con = DriverManager.getConnection(
                //      JDBC_URL, JDBC_USER, JDBC_PASS);
            } catch (Exception e){
                System.out.println("fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,
                JDBC_DRIVER);
    }

    //cierre del resultset
    public static void close(ResultSet rs){
        try{
            if(rs !=null){
                rs.close();
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    //cierre del prepareStatement
    public static void close(PreparedStatement stmt){
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
