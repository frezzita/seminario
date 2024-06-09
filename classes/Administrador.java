package classes;

public class Administrador {
    private int administradorId;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Administrador() {}

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarAdministrador(int administradorId, String nombre, String apellido, String email, String telefono) {
        this.administradorId = administradorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        
        // Agregar administrador a la base de datos
    }

    public void modificarAdministrador(int administradorId, String nombre, String apellido, String email, String telefono) {
        this.administradorId = administradorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        
        // Modificar administrador en la base de datos
    }

    public void eliminarAdministrador(int administradorId) {
        this.administradorId = 0;
        this.nombre = "";
        this.apellido = "";
        this.email = "";
        this.telefono = "";
        
        // Eliminar administrador de la base de datos
    }
}