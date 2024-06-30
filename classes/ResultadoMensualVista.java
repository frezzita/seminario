package classes;
import java.util.Scanner;

public class ResultadoMensualVista {
    private Scanner scanner;

    public ResultadoMensualVista() {
        this.scanner = new Scanner(System.in);
    }

    public int obtenerAnio() {
        System.out.println("Ingrese el anio:");
        return Integer.parseInt(scanner.nextLine());
    }

    public int obtenerMes() {
        System.out.println("Ingrese el mes:");
        return Integer.parseInt(scanner.nextLine());
    }

    public int obtenerEdificioId() {
        System.out.println("Ingrese el id del edificio:");
        return Integer.parseInt(scanner.nextLine());
    }

    public void imprimirExpensa(ResultadoMensual resultadoMensual) {
        System.out.println("Anio: " + resultadoMensual.getAnio() + ", Mes: " + resultadoMensual.getMes() + ", Numero: " + resultadoMensual.getNumero() + ", Piso: " + resultadoMensual.getPiso() + ", Monto: " + resultadoMensual.getMonto() + ", Edificio ID: " + resultadoMensual.getEdificioId());

    }
}