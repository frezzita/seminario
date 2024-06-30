package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class EdificioModelo {
    private Connection connection;

    public EdificioModelo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EdificioModelo edificioModelo = new EdificioModelo();
    }

    public void agregarEdificio(String nombre, String direccion, int administradorId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO edificio (nombre, direccion, administrador_id) VALUES (?, ?, ?)");
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, direccion);
            preparedStatement.setInt(3, administradorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarEdificio(int edificioId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM edificio WHERE edificio_id = ?");
            preparedStatement.setInt(1, edificioId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarEdificio(int edificioId, String nombre, String direccion, int administradorId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE edificio SET nombre = ?, direccion = ?, telefono = ? WHERE edificio_id = ?");
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, direccion);
            preparedStatement.setInt(3, administradorId);
            preparedStatement.setInt(4, edificioId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void verEdificio(int edificioId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM edificio WHERE edificio_id = ?");
            preparedStatement.setInt(1, edificioId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Edificio ID: " + resultSet.getInt("edificio_id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
                System.out.println("Direccion: " + resultSet.getString("direccion"));
                System.out.println("Telefono: " + resultSet.getString("telefono"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}