package Lab9.Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordCount {
    private JFrame frame;
    private JTextField tField;
    private JTextArea tArea;

    private int palabras(String texto){
        String[] tamanioTexto = texto.split("\\s+");
        int contador = 0;
        for(String textoFinal : tamanioTexto){
            if(!textoFinal.isEmpty() && palabraValida(textoFinal)){
                contador ++;
            }
        }
        return contador;
    }

    private int letras(String texto){
        int contador = 0;
        for (char caracter : texto.toCharArray()){
            contador ++;
        }
        return contador;
    }

    private boolean palabraValida(String texto){
        for (char caracter : texto.toCharArray()){
            if(!Character.isLetterOrDigit(caracter)){
                return false;
            }
        }
        return true;
    }
    private void analizarArchivo(){
        String ruta = tField.getText();

        if (ruta.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Ingrese la ruta del archivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        File archivo = new File(ruta);

        try {
            Scanner entrada = new Scanner (archivo);

            int lineas = 0, palabras = 0, letras = 0;

            while (entrada.hasNextLine()){
                String linea = entrada.nextLine();
                lineas++;
                palabras += palabras(linea);
                letras += letras(linea);
            }

            String resultado = "Archivo: '" + archivo.getName() + "':\n" + "Lineas: " + lineas + "\n" + "Palabras: " + palabras + "\n" + "Letras: " + letras;

            tArea.setText(resultado);
            entrada.close();
        }

        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(frame,"Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                WordCount ventana = new WordCount();
                ventana.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public WordCount(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        JLabel labelArchivo = new JLabel("Ruta del Archivo:");
        panel.add(labelArchivo);

        tField = new JTextField();
        panel.add(tField);
        tField.setColumns(20);

        JButton boton = new JButton("OK");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                analizarArchivo();
            }
        });
        panel.add(boton);

        tArea = new JTextArea();
        tArea.setEditable(false); 
        JScrollPane sPane = new JScrollPane(tArea);
        frame.getContentPane().add(sPane, BorderLayout.CENTER);
    }
}

