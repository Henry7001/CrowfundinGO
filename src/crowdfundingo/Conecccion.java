package crowdfundingo;

import java.sql.*;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conecccion {

    public String NOMBRESG = "";
    public String id = "";

    public String coneccion(String username, String Pass) throws SQLException {
        String a = "";
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true;user=app;password=app");
        con.setSchema("APP");
        Statement s = con.createStatement();
        s.execute("SELECT USUARIO, CONTRASEÑA,NOMBRES,APELLIDOS FROM USUARIO WHERE USUARIO='" + username + "' AND CONTRASEÑA='" + Pass + "'");
        ResultSet rs = s.getResultSet();

        while (rs.next()) {
            a = rs.getString("USUARIO") + ";" + rs.getString("CONTRASEÑA");
            this.NOMBRESG = rs.getString("NOMBRES") + " " + rs.getString("APELLIDOS");
            //this.id=rs.getString("ID");
        }

        return a;
    }

    public void insertUser(String Nombres, String Apellidos, String username, String Pass) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true;user=app;password=app");
        con.setSchema("APP");
        Statement s = con.createStatement();
        String ide = rand(1, 9999);
        System.out.print(ide);
        s.execute("INSERT INTO USUARIO VALUES (" + ide + ",'" + Nombres + "','" + Apellidos + "','" + username + "','" + Pass + "')");
        s.execute("SELECT ID FROM USUARIO WHERE USUARIO='" + username + "'");
        ResultSet rs = s.getResultSet();
        String temp = "";
        while (rs.next()) {
            temp = rs.getString("ID");
            System.out.println(temp);
        }
        if (temp.isEmpty() == false) {
            JOptionPane.showMessageDialog(null, "Usuario: " + Nombres + " " + Apellidos + ", creado.");
        }
    }

    public void chgpass(String username, String Pass) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true;user=app;password=app");
        con.setSchema("APP");
        Statement s = con.createStatement();
        s.execute("UPDATE USUARIO SET CONTRASEÑA='" + Pass + "' WHERE USUARIO='" + username + "'");
    }

    public static String rand(int min, int max) {
        String randomNum = String.valueOf(Math.floor(Math.random() * (max - min)));
        return randomNum;
    }

}
