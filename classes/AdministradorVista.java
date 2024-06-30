package classes;
import java.util.Scanner;

public class AdministradorVista {
    private Scanner scanner;

    public AdministradorVista() {
        this.scanner = new Scanner(System.in);
    }

    public int obtenerAdministradorId() {
        System.out.println("Ingrese el id del administrador:");
        return Integer.parseInt(scanner.nextLine());
    }

    public String obtenerNombre() {
        System.out.println("Ingrese el nombre del administrador:");
        return scanner.nextLine();
    }

    public String obtenerApellido() {
        System.out.println("Ingrese el apellido del administrador:");
        return scanner.nextLine();
    }

    public String obtenerEmail() {
        System.out.println("Ingrese el email del administrador:");
        return scanner.nextLine();
    }

    public String obtenerTelefono() {
        System.out.println("Ingrese el telefono del administrador:");
        return scanner.nextLine();
    }
}
