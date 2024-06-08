public class Edificio {
    private int edificioId;
    private String nombre;
    private String direccion;
    private int administradorId;

    public Edificio(int edificioId, String nombre, String direccion, int administradorId) {
        this.edificioId = edificioId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.administradorId = administradorId;
    }

    public int getEdificioId() {
        return edificioId;
    }

    public void setEdificioId(int edificioId) {
        this.edificioId = edificioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }
}
