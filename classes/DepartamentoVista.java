package classes;
import java.util.Scanner;
import java.util.List;


public class DepartamentoVista {
    private Scanner scanner;

    public DepartamentoVista() {
        this.scanner = new Scanner(System.in);
    }

    public int obtenerDepartamentoId() {
        System.out.println("Ingrese el id del departamento:");
        return Integer.parseInt(scanner.nextLine());
    }

    public String obtenerNumero() {
        System.out.println("Ingrese el numero del departamento:");
        return scanner.nextLine();
    }

    public int obtenerPiso() {
        System.out.println("Ingrese el piso del departamento:");
        return Integer.parseInt(scanner.nextLine());
    }   

    public int obtenerEdificioId() {
        System.out.println("Ingrese el id del edificio:");
        return Integer.parseInt(scanner.nextLine());
    }

    public double obtenerPorcentajeParticipacion() {
        System.out.println("Ingrese el porcentaje de participacion del departamento:");
        return Double.parseDouble(scanner.nextLine());
    }

    public void imprimirDepartamento(Departamento departamento) {
        System.out.println("Departamento:");
        System.out.println("Id: " + departamento.getDepartamentoId() + ", Numero: " + departamento.getNumero() + ", Piso: " + departamento.getPiso() + ", Edificio Id: " + departamento.getEdificioId() + ", Porcentaje de participacion: " + departamento.getPorcentajeParticipacion());
    }

}