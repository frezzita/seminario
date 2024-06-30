package classes;

import java.util.ArrayList;
import java.util.List;

public class ResultadoMensual {

    private int anio;
    private int mes;
    private String numero;
    private int piso;
    private double monto;
    private int edificio_id;

    public ResultadoMensual() {}

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPiso() {
        return piso;
    }

    public double getMonto() {
        return monto;
    }

    public int getEdificioId() {
        return edificio_id;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setEdificioId(int edificio_id) {
        this.edificio_id = edificio_id;
    }
}
