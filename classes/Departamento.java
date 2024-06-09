package classes;

class Departamento {
    private int departamentoId;
    private String numero;
    private int piso;
    private int edificioId;
    private double porcentajeParticipacion;

    public Departamento(int departamentoId, String numero, int piso, int edificioId, double porcentajeParticipacion) {
        this.departamentoId = departamentoId;
        this.numero = numero;
        this.piso = piso;
        this.edificioId = edificioId;
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getEdificioId() {
        return edificioId;
    }

    public void setEdificioId(int edificioId) {
        this.edificioId = edificioId;
    }

    public double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    public void setPorcentajeParticipacion(double porcentajeParticipacion) {
        this.porcentajeParticipacion = porcentajeParticipacion;
    }
}