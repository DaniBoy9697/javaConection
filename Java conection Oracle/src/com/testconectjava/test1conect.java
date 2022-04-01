package com.testconectjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test1conect {
    public static void main (String[] args){
        String dbURL = "jdbc:oracle:thin:@25.68.223.154:1521:ESIACOM";
        String username = "ESIACOM";
        String password = "ESIACOM";


        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            e.printStackTrace();
        }
        System.out.println("Fin del script");
    }
}
