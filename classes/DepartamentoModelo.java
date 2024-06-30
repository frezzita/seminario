package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DepartamentoModelo {
    private Connection connection;

    public DepartamentoModelo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DepartamentoModelo departamentoModelo = new DepartamentoModelo();
    }

    public void agregarDepartamento(String numero, int piso, int edificioId, double porcentajeParticipacion) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, numero);
            preparedStatement.setInt(2, piso);
            preparedStatement.setInt(3, edificioId);
            preparedStatement.setDouble(4, porcentajeParticipacion);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarDepartamento(int departamentoId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM departamento WHERE departamento_id = ?");
            preparedStatement.setInt(1, departamentoId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarDepartamento(int departamentoId, String numero, int piso, int edificioId, double porcentajeParticipacion) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE departamento SET numero = ?, piso = ?, edificio_id = ?, porcentaje_participacion = ? WHERE departamento_id = ?");
            preparedStatement.setString(1, numero);
            preparedStatement.setInt(2, piso);
            preparedStatement.setInt(3, edificioId);
            preparedStatement.setDouble(4, porcentajeParticipacion);
            preparedStatement.setInt(5, departamentoId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public List<Departamento> buscarDepartamentosPorEdificio(int edificioId) {
        List<Departamento> departamentos = new ArrayList<Departamento>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM departamento WHERE edificio_id = ?");
            preparedStatement.setInt(1, edificioId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Departamento departamento = new Departamento();
                departamento.setDepartamentoId(resultSet.getInt("departamento_id"));
                departamento.setNumero(resultSet.getString("numero"));
                departamento.setPiso(resultSet.getInt("piso"));
                departamento.setEdificioId(resultSet.getInt("edificio_id"));
                departamento.setPorcentajeParticipacion(resultSet.getDouble("porcentaje_participacion"));
                departamentos.add(departamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamentos;
    }

    public Departamento buscarDepartamentoPorId(int departamentoId) {
        Departamento departamento = new Departamento();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM departamento WHERE departamento_id = ?");
            preparedStatement.setInt(1, departamentoId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                departamento.setDepartamentoId(resultSet.getInt("departamento_id"));
                departamento.setNumero(resultSet.getString("numero"));
                departamento.setPiso(resultSet.getInt("piso"));
                departamento.setEdificioId(resultSet.getInt("edificio_id"));
                departamento.setPorcentajeParticipacion(resultSet.getDouble("porcentaje_participacion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamento;
    }
}

