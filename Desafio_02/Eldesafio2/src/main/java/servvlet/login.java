package servvlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginSer", value = "/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try (Connection conn = new conexion().ConectarBD("the_temper_trap")) {
            String sql = "SELECT * FROM clientes WHERE email = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                request.getSession().setAttribute("cliente", rs.getString("nombre"));
                response.sendRedirect("menu.jsp");
            } else {
                sql = "SELECT * FROM empleados WHERE email = ? AND password = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, email);
                stmt.setString(2, password);
                rs = stmt.executeQuery();

                if (rs.next()) {

                    request.getSession().setAttribute("empleado", rs.getString("nombre"));
                    response.sendRedirect("pedidos.jsp");
                } else {

                    response.sendRedirect("index.jsp?error=true");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

            response.sendRedirect("index.jsp?error=true");
        }
    }
}   //login