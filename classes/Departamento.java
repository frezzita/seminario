package classes;

class Departamento {
    private int departamento_id;
    private String numero;
    private int piso;
    private int edificio_id;
    private double porcentajeParticipacion;

    public Departamento() {}

    public int getDepartamentoId() {
        return departamento_id;
    }

    public void setDepartamentoId(int departamento_id) {
        this.departamento_id = departamento_id;
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
        return edificio_id;
    }

    public void setEdificioId(int edificio_id) {
        this.edificio_id = edificio_id;
    }

    public double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    public void setPorcentajeParticipacion(double porcentajeParticipacion) {
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    public void agregarDepartamento(int departamento_id, String numero, int piso, int edificio_id, double porcentajeParticipacion) {
        // Agregar departamento a la base de datos
        
        this.departamento_id = departamento_id;
        this.numero = numero;
        this.piso = piso;
        this.edificio_id = edificio_id;
        this.porcentajeParticipacion = porcentajeParticipacion;

        // Agregar departamento a la base de datos mysql

        /*
        Crear conexión a la base de datos
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "seminario");

            // Crear query
            String query = "INSERT INTO departamentos (numero, piso, edificio_id, porcentaje_participacion) VALUES (?, ?, ?, ?)";

            // ejecutar query
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, departamento.getNumero());
            preparedStmt.setInt(2, departamento.getPiso());
            preparedStmt.setInt(3, departamento.getEdificioId());
            preparedStmt.setDouble(4, departamento.getPorcentajeParticipacion());
            
            preparedStmt.execute();

            // buscar el id de la base de datos
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID() as id");
            if (rs.next()) {
                departamento.setDepartamentoId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        */
    }

    public void eliminarDepartamento(int departamento_id) {
        // limpiar objecto
        this.departamento_id = 0;
        this.numero = "";
        this.piso = 0;
        this.edificio_id = 0;
        this.porcentajeParticipacion = 0;

        // Eliminar departamento de la base de datos

        
        // Crear conexión a la base de datos
        // Connection conn = null;
        // try {
        //     conn = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "seminario");

        //     // Crear query
        //     String query = "DELETE FROM departamentos WHERE id = ?";

        //     // ejecutar query
        //     PreparedStatement preparedStmt = conn.prepareStatement(query);
        //     preparedStmt.setInt(1, departamento_id);
            
        //     preparedStmt.execute();
        // } catch (SQLException e) {
        //     System.out.println(e.getMessage());
        // }
    }

    public void modificarDepartamento(int departamento_id, String numero, int piso, int edificio_id, double porcentajeParticipacion) {
        // Modificar departamento en el objeto
        this.numero = numero;
        this.piso = piso;
        this.edificio_id = edificio_id;
        this.porcentajeParticipacion = porcentajeParticipacion;
        // Modificar departamento en la base de datos


        // Crear conexión a la base de datos
        // Connection conn = null;
        // try {
        //     conn = DriverManager.getConnection("jdbc:mysql://localhost:7788/gestion_expensas", "root", "seminario");

        //     // Crear query
        //     String query = "UPDATE departamentos SET numero = ?, piso = ?, edificio_id = ?, porcentaje_participacion = ? WHERE id = ?";

        //     // ejecutar query
        //     PreparedStatement preparedStmt = conn.prepareStatement(query);
        //     preparedStmt.setString(1, numero);
        //     preparedStmt.setInt(2, piso);
        //     preparedStmt.setInt(3, edificio_id);
        //     preparedStmt.setDouble(4, porcentajeParticipacion);
        //     preparedStmt.setInt(5, departamento_id);
            
        //     preparedStmt.execute();
        // } catch (SQLException e) {
        //     System.out.println(e.getMessage());
        // }

    }
}