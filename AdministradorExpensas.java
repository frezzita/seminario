

import java.util.Scanner;
import java.util.ArrayList;

public class AdministradorExpensas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Edificio edificio_s21 = new Edificio(0, "Edificio Siglo 21", "Libertador 1234", 0);
        boolean ejecutando = true; 

        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Expensa> expensas = new ArrayList<>();
        Administrador administrador = new Administrador(0, "Juan", "Perez", "juanperez@gmail.com", "1234567890");

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
                    System.out.print("Piso del departamento: ");
                    int piso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Numero o letra del departamento: ");
                    String numero = scanner.nextLine();

                    System.out.print("Porcentaje de participacion: ");
                    double porcentajeParticipacion = scanner.nextDouble();

                    // departamento id = length of array
                    int departamentoId = departamentos.size();

                    Departamento nuevoDepartamento = new Departamento(departamentoId, numero, piso, edificio_s21.getEdificioId(), porcentajeParticipacion);

                    departamentos.add(nuevoDepartamento);

                    System.out.println("Departamento agregado con exito");
                }

                case 2 -> {
                    System.out.print("Ingrese el id del departamento a modificar: ");
                    int idDepartamento = scanner.nextInt();

                    Departamento departamentoAModificar = null;

                    for (Departamento departamento : departamentos) {
                        if (departamento.getDepartamentoId() == idDepartamento) {
                            departamentoAModificar = departamento;
                        }
                    }

                    if (departamentoAModificar != null) {
                        System.out.print("Piso del departamento: ");
                        int nuevoPiso = scanner.nextInt();
                        scanner.nextLine();
    
                        System.out.print("Numero o letra del departamento: ");
                        String nuevoNumero = scanner.nextLine();
    
                        System.out.print("Porcentaje de participacion: ");
                        double nuevoPorcentajeParticipacion = scanner.nextDouble();

                        departamentoAModificar.setPiso(nuevoPiso);
                        departamentoAModificar.setNumero(nuevoNumero);
                        departamentoAModificar.setPorcentajeParticipacion(nuevoPorcentajeParticipacion);

                        System.out.println("Departamento modificado con exito");
                    } else {
                        System.out.println("No se encontro el departamento");
                    }

                }
                
                case 3 -> {
                    System.out.println("Departamentos del edificio: ");
                    for (Departamento departamento : departamentos) {
                        // si el departamento pertenece al edificio
                        if (departamento.getEdificioId() == edificio_s21.getEdificioId()) {
                            System.out.println("Piso: " + departamento.getPiso() + " - Numero: " + departamento.getNumero() + " - Porcentaje de participacion: " + departamento.getPorcentajeParticipacion() + " - Id Departamento: " + departamento.getDepartamentoId());
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese el id del departamento a eliminar: ");
                    int idDepartamento = scanner.nextInt();

                    Departamento departamentoAEliminar = null;

                    for (Departamento departamento : departamentos) {
                        if (departamento.getDepartamentoId() == idDepartamento) {
                            departamentoAEliminar = departamento;
                        }
                    }

                    if (departamentoAEliminar != null) {
                        departamentos.remove(departamentoAEliminar);
                        System.out.println("Departamento eliminado con exito");
                    } else {
                        System.out.println("No se encontro el departamento");
                    }
                }
                
                case 5 -> {

                    System.out.print("Monto de la expensa: ");
                    double monto = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Fecha de la expensa (ddmmaaaa): ");
                    String fecha = scanner.nextLine();

                    System.out.print("Concepto de la expensa: ");
                    String concepto = scanner.nextLine();

                    // expensa id = length of array
                    int expensaId = expensas.size();

                    Expensa nuevaExpensa = new Expensa(expensaId, fecha, monto, concepto, edificio_s21.getEdificioId());

                    expensas.add(nuevaExpensa);

                    System.out.println("Expensa agregada con exito");

                }

                case 6 -> {
                    System.out.print("Ingrese el id de la expensa a modificar: ");
                    int idExpensa = scanner.nextInt();

                    Expensa expensaAModificar = null;

                    for (Expensa expensa : expensas) {
                        if (expensa.getExpensaId() == idExpensa) {
                            expensaAModificar = expensa;
                        }
                    }

                    if (expensaAModificar != null) {
                        System.out.print("Nuevo monto de la expensa: ");
                        double nuevoMonto = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Nuevo concepto de la expensa: ");
                        String nuevoConcepto = scanner.nextLine();

                        System.out.print("Nueva fecha de la expensa (ddmmaaaa): ");
                        String nuevaFecha = scanner.nextLine();

                        expensaAModificar.setFecha(nuevaFecha);
                        expensaAModificar.setMonto(nuevoMonto);
                        expensaAModificar.setConcepto(nuevoConcepto);

                        System.out.println("Expensa modificada con exito");
                    } else {
                        System.out.println("No se encontro la expensa");
                    }
                }

                case 7 -> {
                    System.out.println("Expensas cargadas: ");
                    for (Expensa expensa : expensas) {
                        // si la expensa pertenece al edificio y es del mes en curso
                        if (expensa.getEdificioId() == edificio_s21.getEdificioId()) {
                            System.out.println("Fecha: " + expensa.getFecha() + " - Monto: " + expensa.getMonto() + " - Concepto: " + expensa.getConcepto() + " - Id Expensa: " + expensa.getExpensaId());
                        }
                    }
                }
                
                case 8 -> {
                    System.out.print("Ingrese el id de la expensa a eliminar: ");
                    int idExpensa = scanner.nextInt();

                    Expensa expensaAEliminar = null;

                    for (Expensa expensa : expensas) {
                        if (expensa.getExpensaId() == idExpensa) {
                            expensaAEliminar = expensa;
                        }
                    }

                    if (expensaAEliminar != null) {
                        expensas.remove(expensaAEliminar);
                        System.out.println("Expensa eliminada con exito");
                    } else {
                        System.out.println("No se encontro la expensa");
                    }
                }
                
                case 9 -> {
                    System.out.println("Nombre del edificio: " + edificio_s21.getNombre());
                    System.out.println("Direccion del edificio: " + edificio_s21.getDireccion());
                    System.out.println("Administrador del edificio: " + administrador.getNombre() + " " + administrador.getApellido());
                    System.out.println("-----------------------------");
                    System.out.println("Departamentos del edificio: ");
                    for (Departamento departamento : departamentos) {
                        // si el departamento pertenece al edificio
                        if (departamento.getEdificioId() == edificio_s21.getEdificioId()) {
                            System.out.println("Piso: " + departamento.getPiso() + " - Numero: " + departamento.getNumero() + " - Porcentaje de participacion: " + departamento.getPorcentajeParticipacion());
                        }
                    }

                    System.out.println("-----------------------------");
                    System.out.println("Expensas del edificio: ");
                    for (Expensa expensa : expensas) {
                        // si la expensa pertenece al edificio
                        if (expensa.getEdificioId() == edificio_s21.getEdificioId()) {
                            System.out.println("Fecha: " + expensa.getFecha() + " - Monto: " + expensa.getMonto() + " - Concepto: " + expensa.getConcepto());
                        }
                    }
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

