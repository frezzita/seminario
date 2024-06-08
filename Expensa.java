public class Expensa {

    private int expensaId;
    private String fecha;
    private double monto;
    private String concepto;
    private int edificioId;

    public Expensa(int expensaId, String fecha, double monto, String concepto, int edificioId) {
        this.expensaId = expensaId;
        this.fecha = fecha;
        this.monto = monto;
        this.concepto = concepto;
        this.edificioId = edificioId;
    }

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
}
