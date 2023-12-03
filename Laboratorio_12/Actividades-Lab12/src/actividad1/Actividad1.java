package Lab12.Ejercicios;

import java.sql.*;

public class Actividad1 {

    private static final String URL = "jdbc:mysql://localhost:3306/laboratorio";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            //insertar();
            //recuperar();
            //actualizar();
            borrar();

            connection = getConnection();
            connection.setAutoCommit(false); 

            connection.commit(); 
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void insertar() throws SQLException {
        try (Connection connection = getConnection();
            Statement statement = connection.createStatement()) {

            String insertQuery = "INSERT INTO tabla1 (id, nombre, edad) VALUES ('1', 'Juan', '18')";
            statement.executeUpdate(insertQuery);
            System.out.println("Registro insertado correctamente.");
        }
    }

    private static void recuperar() throws SQLException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM tabla1")) {

            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getString("id") +
                        ", nombre: " + resultSet.getString("nombre") +
                        ", edad: " + resultSet.getString("edad"));
            }
        }
    }

    private static void actualizar() throws SQLException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            String updateQuery = "UPDATE tabla1 SET id='2' WHERE nombre='Pedro'";
            statement.executeUpdate(updateQuery);
            System.out.println("Registro actualizado correctamente.");
        }
    }

    private static void borrar() throws SQLException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            String deleteQuery = "DELETE FROM tabla1 WHERE nombre='Juan'";
            statement.executeUpdate(deleteQuery);
            System.out.println("Registro borrado correctamente.");
        }
    }

    private static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

