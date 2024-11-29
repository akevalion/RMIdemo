/*
 */
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLServerDemo {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/Users/milton/Desktop/prueba.db";
        String query = "SELECT * FROM Product"; // Consulta SQL para obtener todos los registros

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            // Verificar si la conexión fue exitosa
            if (conn != null) {
                System.out.println("Conexión establecida con SQLite.\n");
            }

            // Mostrar encabezados de la tabla
            System.out.println("ID\tNombre\t\tPrecio\tCantidad");
            System.out.println("-------------------------------------------------");

            // Iterar sobre los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");

// Corregimos el formato
                System.out.printf("%d\t%-10s\t%-20s\t%.2f%n", id, nombre, description, price);

            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
