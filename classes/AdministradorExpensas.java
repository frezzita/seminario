package classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AdministradorExpensas {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        AdministradorControlador administradorControlador = new AdministradorControlador();
        administradorControlador.agregarAdministrador();
        EdificioControlador edificio_s21 = new EdificioControlador();
        edificio_s21.agregarEdificio();
        DepartamentoControlador departamentoControlador = new DepartamentoControlador();
        ExpensaControlador expensaControlador = new ExpensaControlador();
        ResultadoMensualControlador resultadoMensualControlador = new ResultadoMensualControlador();
        boolean ejecutando = true; 
        while (ejecutando) {
            System.out.println("_______________________________");
            System.out.println("MENU PRINCIPAL - Administrador de expensas");
            System.out.println("___________________________");
            System.out.println("1. Agregar Departamento");
            System.out.println("2. Modificar Departamento");
            System.out.println("3. Ver Departamentos");
            System.out.println("4. Eliminar Departamento");
            System.out.println("5. Agregar Expensas");
            System.out.println("6. Modificar Expensas");
            System.out.println("7. Ver Expensas");
            System.out.println("8. Eliminar Expensas");
            System.out.println("9. Ver info del edificio");
            System.out.println("0. Salir");
            System.out.println("_______________________________");
            System.out.print("Elige una opcion: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    departamentoControlador.agregarDepartamento();
                }
                case 2 -> {
                    departamentoControlador.modificarDepartamento();
                }
                case 3 -> {
                    departamentoControlador.verDepartamentos();
                }
                case 4 -> {
                    departamentoControlador.eliminarDepartamento();
                }
                case 5 -> {
                    expensaControlador.agregarExpensa();
                }
                case 6 -> {
                    expensaControlador.modificarExpensa();
                }
                case 7 -> {
                    expensaControlador.verExpensas();
                }
                case 8 -> {
                    expensaControlador.eliminarExpensa();
                }
                case 9 -> {
                    resultadoMensualControlador.verExpensasPorMes();
                }
                case 0 -> {
                    System.out.println("Programa Finalizado");
                    ejecutando = false;
                }
                default -> System.out.println("Opcion no valida, intenta nuevamente");
            }
        }
    }
}

