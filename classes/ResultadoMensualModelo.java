package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ResultadoMensualModelo {
    private Connection connection;

    public ResultadoMensualModelo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ResultadoMensual> expensasPorMes(int anio, int mes, int edificio_id) {
        List<ResultadoMensual> resultadosMensuales = new ArrayList<ResultadoMensual>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM resultadomensual WHERE anio = ? AND mes = ? AND edificio_id = ?");
            preparedStatement.setInt(1, anio);
            preparedStatement.setInt(2, mes);
            preparedStatement.setInt(3, edificio_id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ResultadoMensual resultadoMensual = new ResultadoMensual();
                resultadoMensual.setAnio(resultSet.getInt("anio"));
                resultadoMensual.setMes(resultSet.getInt("mes"));
                resultadoMensual.setNumero(resultSet.getString("numero"));
                resultadoMensual.setPiso(resultSet.getInt("piso"));
                resultadoMensual.setMonto(resultSet.getDouble("monto"));
                resultadoMensual.setEdificioId(resultSet.getInt("edificio_id"));
                resultadosMensuales.add(resultadoMensual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultadosMensuales;
    }
}