package classes;
import java.util.List;

public class ExpensaControlador {
    private ExpensaModelo expensaModelo;
    private ExpensaVista expensaVista;

    public ExpensaControlador() {
        this.expensaModelo = new ExpensaModelo();
        this.expensaVista = new ExpensaVista();
    }

    public void agregarExpensa() {
        String fecha = expensaVista.obtenerFecha();
        double monto = expensaVista.obtenerMonto();
        String concepto = expensaVista.obtenerConcepto();
        int edificioId = expensaVista.obtenerEdificioId();
        
        expensaModelo.agregarExpensa(fecha, monto, concepto, edificioId);
    }

    public void eliminarExpensa() {
        int expensaId = this.expensaVista.obtenerExpensaId();
        expensaModelo.eliminarExpensa(expensaId);
    }

    public void modificarExpensa() {
        int expensaId = expensaVista.obtenerExpensaId();
        String fecha = expensaVista.obtenerFecha();
        double monto = expensaVista.obtenerMonto();
        String concepto = expensaVista.obtenerConcepto();
        int edificioId = expensaVista.obtenerEdificioId();
        
        expensaModelo.modificarExpensa(expensaId, fecha, monto, concepto, edificioId);
    }

    public void verExpensa(Expensa expensa) {
        expensaVista.imprimirExpensa(expensa);
    }
    
    public void verExpensas() {
        int edificioId = expensaVista.obtenerEdificioId();
        List<Expensa> expensas = expensaModelo.buscarExpensasPorEdificio(edificioId);

        for (Expensa expensa : expensas) {
            expensaVista.imprimirExpensa(expensa);
        }
    }
}