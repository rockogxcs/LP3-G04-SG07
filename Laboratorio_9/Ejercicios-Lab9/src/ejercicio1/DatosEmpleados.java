package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

class DatosEmpleados extends JFrame {
    private final JTextField numeroField, nombreField, sueldoField;

    private final JTable resultTable;
    private final DefaultTableModel tableModel;
    
    public DatosEmpleados() {
        super("Empleados");
        setLayout(new BorderLayout());

        // Datos de empleado para ingresar
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Número:"));
        numeroField = new JTextField(10);
        inputPanel.add(numeroField);

        inputPanel.add(new JLabel("Nombre:"));
        nombreField = new JTextField(20);
        inputPanel.add(nombreField);

        inputPanel.add(new JLabel("Sueldo:"));
        sueldoField = new JTextField(10);
        inputPanel.add(sueldoField);
        add(inputPanel, BorderLayout.NORTH);
        
        // Boton "agregar empleado"
        JButton addButton = new JButton("Agregar empleado");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                agregarEmpleado();
            }
        });
        add(addButton, BorderLayout.SOUTH);
        
        // Crear borde con título
        TitledBorder border = new TitledBorder("Datos del empleado");
        inputPanel.setBorder(border);

        // Tabla de empleados 
        String[] columnNames = {"Número", "Nombre", "Sueldo"};
        tableModel = new DefaultTableModel(columnNames, 0);
        resultTable = new JTable(tableModel);
        add(new JScrollPane(resultTable), BorderLayout.CENTER);

        reporteEmpleados();
    }

    private void agregarEmpleado() {
        try {
            FileWriter writer = new FileWriter("src/ejercicio1/empleados.txt", true);
            writer.write(numeroField.getText() + "\n");
            writer.write(nombreField.getText() + "\n");
            writer.write(sueldoField.getText() + "\n");
            writer.close();
            tableModel.addRow(new Object[]{numeroField.getText(), nombreField.getText(), sueldoField.getText()});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void reporteEmpleados() {
        try {
            FileReader reader = new FileReader("src/ejercicio1/empleados.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            tableModel.setRowCount(0);
            while ((line = bufferedReader.readLine()) != null) {
                String numero = line;
                String nombre = bufferedReader.readLine();
                String sueldo = bufferedReader.readLine();
                tableModel.addRow(new Object[]{numero, nombre, sueldo});
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}