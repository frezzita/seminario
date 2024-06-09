package classes;

import java.util.ArrayList;
import java.util.List;

public class ResultadoMensual {

    private int anio;
    private int mes;
    private String numero;
    private int piso;
    private double monto;
    private int edificio_id;

    public ResultadoMensual() {}

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public String getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public double getMonto() {
        return monto;
    }

    public int getEdificioId() {
        return edificio_id;
    }

    public List<ResultadoMensual> expensasPorMes(int anio, int mes, int edificio_id) {
        // Obtener resultados mensuales de la base de datos
        return new ArrayList<ResultadoMensual>();
    }
}
