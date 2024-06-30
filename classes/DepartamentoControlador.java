package classes;
import java.util.List;

public class DepartamentoControlador {
    private DepartamentoModelo departamentoModelo;
    private DepartamentoVista departamentoVista;

    public DepartamentoControlador() {
        this.departamentoModelo = new DepartamentoModelo();
        this.departamentoVista = new DepartamentoVista();
    }

    public void agregarDepartamento() {
        // int departamento_id = departamentoVista.obtenerDepartamentoId();
        String numero = departamentoVista.obtenerNumero();
        int piso = departamentoVista.obtenerPiso();
        int edificio_id = departamentoVista.obtenerEdificioId();
        double porcentajeParticipacion = departamentoVista.obtenerPorcentajeParticipacion();
        
        departamentoModelo.agregarDepartamento(numero, piso, edificio_id, porcentajeParticipacion);
    }

    public void eliminarDepartamento() {
        int departamento_id = departamentoVista.obtenerDepartamentoId();
        departamentoModelo.eliminarDepartamento(departamento_id);
    }

    public void modificarDepartamento() {
        int departamento_id = departamentoVista.obtenerDepartamentoId();
        String numero = departamentoVista.obtenerNumero();
        int piso = departamentoVista.obtenerPiso();
        int edificio_id = departamentoVista.obtenerEdificioId();
        double porcentajeParticipacion = departamentoVista.obtenerPorcentajeParticipacion();
        
        departamentoModelo.modificarDepartamento(departamento_id, numero, piso, edificio_id, porcentajeParticipacion);
    }

    public void verDepartamentos() {
        int edificio_id = departamentoVista.obtenerEdificioId();
        List<Departamento> departamentos = departamentoModelo.buscarDepartamentosPorEdificio(edificio_id);

        for (Departamento departamento : departamentos) {
            departamentoVista.imprimirDepartamento(departamento);
        }
    }

    public void verDepartamento() {
        int departamento_id = departamentoVista.obtenerDepartamentoId();
        departamentoModelo.buscarDepartamentoPorId(departamento_id);
    }
}