package classes;

public class Expensa {

    private int expensaId;
    private String fecha;
    private double monto;
    private String concepto;
    private int edificioId;

    public Expensa() {}

    public int getExpensaId() {
        return expensaId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEdificioId(int edificioId) {
        this.edificioId = edificioId;
    }

    public double getMonto() {
        return monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getEdificioId() {
        return edificioId;
    }

    public void agregarExpensa(int expensaId, String fecha, double monto, String concepto, int edificioId) {
        this.expensaId = expensaId;
        this.fecha = fecha;
        this.monto = monto;
        this.concepto = concepto;
        this.edificioId = edificioId;

        // Agregar expensa a la base de datos
    }

    public void modificarExpensa(int expensaId, String fecha, double monto, String concepto, int edificioId) {
        this.expensaId = expensaId;
        this.fecha = fecha;
        this.monto = monto;
        this.concepto = concepto;
        this.edificioId = edificioId;

        // Modificar expensa en la base de datos
    }

    public void eliminarExpensa(int expensaId) {
        this.expensaId = 0;
        this.fecha = "";
        this.monto = 0;
        this.concepto = "";
        this.edificioId = 0;

        // Eliminar expensa de la base de datos
    }
}
