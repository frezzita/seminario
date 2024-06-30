package classes;

public class AdministradorControlador {

    private AdministradorModelo administradorModelo;
    private AdministradorVista administradorVista;

    public AdministradorControlador() {
        this.administradorModelo = new AdministradorModelo();
        this.administradorVista = new AdministradorVista();
    }
    
    public void agregarAdministrador() {
        String nombre = administradorVista.obtenerNombre();
        String apellido = administradorVista.obtenerApellido();
        String email = administradorVista.obtenerEmail();
        String telefono = administradorVista.obtenerTelefono();
        
        administradorModelo.agregarAdministrador(nombre, apellido, email, telefono);
    }

    public void eliminarAdministrador() {
        int administradorId = this.administradorVista.obtenerAdministradorId();
        administradorModelo.eliminarAdministrador(administradorId);
    }

    public void modificarAdministrador() {
        int administradorId = administradorVista.obtenerAdministradorId();
        String nombre = administradorVista.obtenerNombre();
        String apellido = administradorVista.obtenerApellido();
        String email = administradorVista.obtenerEmail();
        String telefono = administradorVista.obtenerTelefono();
        
        administradorModelo.modificarAdministrador(administradorId, nombre, apellido, email, telefono);
    }
}
