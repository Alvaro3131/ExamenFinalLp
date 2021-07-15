/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examenfinal.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alvaro Alva
 */
public class Conexion {
     private static final String URL = "jdbc:oracle:thin:@3.238.252.102:1521:ORCL";
    //private static final String URL = "jdbc:oracle:thin:@localhost:49162:XE";
    private static final String USER = "LP";
    private static final String PASS = "123";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static Connection cx = null;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        }

        return cx;
    }

    public void desconectar() {
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
