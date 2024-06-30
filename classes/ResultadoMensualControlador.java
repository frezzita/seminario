package classes;
import java.util.List;

public class ResultadoMensualControlador {
    private ResultadoMensualModelo resultadoMensualModelo;
    private ResultadoMensualVista resultadoMensualVista;

    public ResultadoMensualControlador() {
        this.resultadoMensualModelo = new ResultadoMensualModelo();
        this.resultadoMensualVista = new ResultadoMensualVista();
    }

    public void verExpensasPorMes() {
        int anio = resultadoMensualVista.obtenerAnio();
        int mes = resultadoMensualVista.obtenerMes();
        int edificio_id = resultadoMensualVista.obtenerEdificioId();
        List<ResultadoMensual> resultadosMensuales = resultadoMensualModelo.expensasPorMes(anio, mes, edificio_id);

        for (ResultadoMensual resultadoMensual : resultadosMensuales) {
            resultadoMensualVista.imprimirExpensa(resultadoMensual);
        }
    }
}