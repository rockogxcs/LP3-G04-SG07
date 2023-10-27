import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CompraPasajes extends JFrame {
    private final JTextField nombre, documento, fecha;
    private final JButton reiniciar, mostrar;
    private final JCheckBox audifonos, manta, revistas;
    private final JRadioButton primerPiso, segundoPiso;
    private final JComboBox<String> origen, destino;
    private final JList<String> calidad;

    public CompraPasajes() {
        super("Transportes Julsa");
        setLayout(new FlowLayout());

        add(new JLabel("Nombre:"));
        nombre = new JTextField(20);
        add(nombre);

        add(new JLabel("DNI:"));
        documento = new JTextField(10);
        add(documento);

        add(new JLabel("Fecha de Viaje:"));
        fecha = new JTextField(10);
        add(fecha);

        audifonos = new JCheckBox("Audífonos");
        manta = new JCheckBox("Manta");
        revistas = new JCheckBox("Revistas");
        add(audifonos);
        add(manta);
        add(revistas);

        primerPiso = new JRadioButton("1er Piso");
        segundoPiso = new JRadioButton("2do Piso");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(primerPiso);
        grupo.add(segundoPiso);
        add(primerPiso);
        add(segundoPiso);

        origen = new JComboBox<>(new String[]{"Arequipa", "Puno", "Lima"});
        destino = new JComboBox<>(new String[]{"Arequipa", "Puno", "Lima"});
        add(origen);
        add(destino);

        calidad = new JList<>(new String[]{"Económico", "Standard", "VIP"});
        add(calidad);

        reiniciar = new JButton("Reiniciar");
        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText("");
                documento.setText("");
                fecha.setText("");
                audifonos.setSelected(false);
                manta.setSelected(false);
                revistas.setSelected(false);
                primerPiso.setSelected(false);
                segundoPiso.setSelected(false);
                origen.setSelectedIndex(0);
                destino.setSelectedIndex(0);
                calidad.clearSelection();
            }
        });
        add(reiniciar);
        
        mostrar = new JButton("Mostrar");
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (origen.getSelectedItem().equals(destino.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "El origen y el destino no pueden ser los mismos.");
                    return;
                }
                String mensaje = "Nombre: " + nombre.getText() +
                                 "\nDocumento: " + documento.getText() +
                                 "\nFecha de Viaje: " + fecha.getText() +
                                 "\nServicios: " + (audifonos.isSelected() ? "Audífonos " : "") +
                                 (manta.isSelected() ? "Manta " : "") +
                                 (revistas.isSelected() ? "Revistas" : "") +
                                 "\nPiso: " + (primerPiso.isSelected() ? "1er Piso" : "2do Piso") +
                                 "\nOrigen: " + origen.getSelectedItem() +
                                 "\nDestino: " + destino.getSelectedItem() +
                                 "\nCalidad: " + calidad.getSelectedValue();
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });
        
        add(mostrar);
        
        Icon icono = new ImageIcon(getClass().getResource("julsa.jpg"));
        JLabel etiquetaIcono = new JLabel(icono);
        add(etiquetaIcono);
    }
}