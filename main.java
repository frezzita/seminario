import classes.AdministradorExpensas;

public class main {
    // ejecutar AdministradorExpensas dentro de classes
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Your existing code
            AdministradorExpensas administrador = new AdministradorExpensas();
            administrador.iniciar();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
