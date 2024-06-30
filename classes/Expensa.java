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

    public void setExpensaId(int expensaId) {
        this.expensaId = expensaId;
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

}
