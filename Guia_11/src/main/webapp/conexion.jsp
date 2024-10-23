<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/13/2024
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection cx = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
    con = DriverManager.getConnection("jdbc:mysql://localhost/personabddg8", "root", "Carta.345617");
    String valor;
%>
