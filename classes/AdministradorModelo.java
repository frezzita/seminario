package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class AdministradorModelo {
    private Connection connection;

    public AdministradorModelo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AdministradorModelo administradorModelo = new AdministradorModelo();
    }

    public void agregarAdministrador(String nombre, String apellido, String email, String telefono) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO administrador (nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, telefono);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarAdministrador(int administradorId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM administrador WHERE administrador_id = ?");
            preparedStatement.setInt(1, administradorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarAdministrador(int administradorId, String nombre, String apellido, String email, String telefono)  {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE administrador SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE administrador_id = ?");
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, telefono);
            preparedStatement.setInt(5, administradorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Administrador> obtenerAdministradores() {
        List<Administrador> administradores = new ArrayList<Administrador>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM administrador");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Administrador administrador = new Administrador();
                administrador.setAdministradorId(resultSet.getInt("administrador_id"));
                administrador.setNombre(resultSet.getString("nombre"));
                administrador.setApellido(resultSet.getString("apellido"));
                administrador.setEmail(resultSet.getString("email"));
                administrador.setTelefono(resultSet.getString("telefono"));
                administradores.add(administrador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return administradores;
    }
}
