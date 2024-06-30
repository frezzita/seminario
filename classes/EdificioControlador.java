package classes;

public class EdificioControlador {

    private EdificioModelo edificioModelo;
    private EdificioVista edificioVista;
    

    public EdificioControlador() {
        this.edificioModelo = new EdificioModelo();
        this.edificioVista = new EdificioVista();
    }

    public void agregarEdificio() {
        String nombre = edificioVista.obtenerNombre();
        String direccion = edificioVista.obtenerDireccion();
        int administradorId = edificioVista.obtenerAdministradorId();

        edificioModelo.agregarEdificio(nombre, direccion, administradorId);
    }

    public void modificarEdificio() {
        int edificio_id = edificioVista.obtenerEdificioId();
        String nombre = edificioVista.obtenerNombre();
        String direccion = edificioVista.obtenerDireccion();
        int administradorId = edificioVista.obtenerAdministradorId();

        edificioModelo.modificarEdificio(edificio_id, nombre, direccion, administradorId);
    }

    public void eliminarEdificio() {
        int edificio_id = edificioVista.obtenerEdificioId();

        edificioModelo.eliminarEdificio(edificio_id);
    }

    public void verEdificio() {
        int edificio_id = edificioVista.obtenerEdificioId();

        edificioModelo.verEdificio(edificio_id);
    }

    
}