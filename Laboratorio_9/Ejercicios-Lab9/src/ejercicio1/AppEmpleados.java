package ejercicio1;

import javax.swing.*;

public class AppEmpleados {
    public static void main(String[] args) {
        JFrame ventana = new DatosEmpleados();
        ventana.setSize(300,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}