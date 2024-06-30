package classes;
import java.util.Scanner;

public class EdificioVista {
    private Scanner scanner;

    public EdificioVista() {
        this.scanner = new Scanner(System.in);
    }

    public int obtenerEdificioId() {
        System.out.println("Ingrese el id del edificio:");
        return Integer.parseInt(scanner.nextLine());
    }

    public void agregarEdificio() {
        System.out.println("Ingrese el nombre del edificio:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la direccion del edificio:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el id del administrador:");
        int administradorId = Integer.parseInt(scanner.nextLine());
    }

    public void modificarEdificio() {
        System.out.println("Ingrese el id del edificio:");
        int edificio_id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nombre del edificio:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la direccion del edificio:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el id del administrador:");
        int administradorId = Integer.parseInt(scanner.nextLine());
    }

    public void eliminarEdificio() {
        System.out.println("Ingrese el id del edificio:");
        int edificio_id = Integer.parseInt(scanner.nextLine());
    }

    public String obtenerNombre() {
        System.out.println("Ingrese el nombre del edificio:");
        return scanner.nextLine();
    }

    public String obtenerDireccion() {
        System.out.println("Ingrese la direccion del edificio:");
        return scanner.nextLine();
    }

    public int obtenerAdministradorId() {
        System.out.println("Ingrese el id del administrador:");
        return Integer.parseInt(scanner.nextLine());
    }

}
