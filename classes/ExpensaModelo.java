package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ExpensaModelo {
    private Connection connection;

    public ExpensaModelo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExpensaModelo expensaModelo = new ExpensaModelo();
    }

    public void agregarExpensa(String fecha, double monto, String concepto, int edificioId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO expensa (fecha, monto, concepto, edificio_id) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, fecha);
            preparedStatement.setDouble(2, monto);
            preparedStatement.setString(3, concepto);
            preparedStatement.setInt(4, edificioId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarExpensa(int expensaId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM expensa WHERE expensa_id = ?");
            preparedStatement.setInt(1, expensaId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarExpensa(int expensaId, String fecha, double monto, String concepto, int edificioId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE expensa SET fecha = ?, monto = ?, concepto = ?, edificio_id = ? WHERE expensa_id = ?");
            preparedStatement.setString(1, fecha);
            preparedStatement.setDouble(2, monto);
            preparedStatement.setString(3, concepto);
            preparedStatement.setInt(4, edificioId);
            preparedStatement.setInt(5, expensaId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Expensa> buscarExpensasPorEdificio(int edificioId) {
        List<Expensa> expensas = new ArrayList<Expensa>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM expensa WHERE edificio_id = ?");
            preparedStatement.setInt(1, edificioId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Expensa expensa = new Expensa();
                expensa.setExpensaId(resultSet.getInt("expensa_id"));
                expensa.setFecha(resultSet.getString("fecha"));
                expensa.setMonto(resultSet.getDouble("monto"));
                expensa.setConcepto(resultSet.getString("concepto"));
                expensa.setEdificioId(resultSet.getInt("edificio_id"));
                expensas.add(expensa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return expensas;
    }
}