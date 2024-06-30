package classes;
import java.util.Scanner;

public class ExpensaVista {
    private Scanner scanner;

    public ExpensaVista() {
        this.scanner = new Scanner(System.in);
    }

    public int obtenerExpensaId() {
        System.out.println("Ingrese el id de la expensa:");
        return Integer.parseInt(scanner.nextLine());
    }

    public String obtenerFecha() {
        System.out.println("Ingrese la fecha de la expensa (YYYY-mm-dd):");
        return scanner.nextLine();
    }

    public double obtenerMonto() {
        System.out.println("Ingrese el monto de la expensa:");
        return Double.parseDouble(scanner.nextLine());
    }

    public String obtenerConcepto() {
        System.out.println("Ingrese el concepto de la expensa:");
        return scanner.nextLine();
    }

    public int obtenerEdificioId() {
        System.out.println("Ingrese el id del edificio:");
        return Integer.parseInt(scanner.nextLine());
    }

    public void imprimirExpensa(Expensa expensa) {
        System.out.println("Expensa: Id: " + expensa.getExpensaId() + ", Fecha: " + expensa.getFecha() + ", Monto: " + expensa.getMonto() + ", Concepto: " + expensa.getConcepto() + ", Edificio id: " + expensa.getEdificioId());
    }

}
