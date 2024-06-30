import classes.AdministradorExpensas;

public class main {
    // ejecutar AdministradorExpensas dentro de classes
    public static void main(String[] args) {
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            AdministradorExpensas administrador = new AdministradorExpensas();
            administrador.iniciar();
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
}
