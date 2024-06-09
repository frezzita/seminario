package classes;

import classes.Departamento;
import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private int edificio_id;
    private String nombre;
    private String direccion;
    private int administradorId;

    public Edificio() {}

    public int getEdificioId() {
        return edificio_id;
    }

    public void setEdificioId(int edificio_id) {
        this.edificio_id = edificio_id;
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

    public void agregarEdificio(int edificio_id, String nombre, String direccion, int administradorId) {
        this.edificio_id = edificio_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.administradorId = administradorId;
        
        // Agregar edificio a la base de datos
    }

    public void modificarEdificio(int edificio_id, String nombre, String direccion, int administradorId) {
        this.edificio_id = edificio_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.administradorId = administradorId;
        
        // Modificar edificio en la base de datos
    }

    public void eliminarEdificio(int edificio_id) {
        this.edificio_id = 0;
        this.nombre = "";
        this.direccion = "";
        this.administradorId = 0;
        
        // Eliminar edificio de la base de datos
    }

    public List<Departamento> verDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        // Buscar departamentos en la base de datos
        // a implementar con la base de datos
        return departamentos;
    }
}
