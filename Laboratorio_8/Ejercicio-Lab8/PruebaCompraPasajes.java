import javax.swing.JFrame;

public class PruebaCompraPasajes {
    public static void main(String[] args) {
      CompraPasajes ventana = new CompraPasajes();
      ventana.setSize(400, 450);
      ventana.setVisible(true);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
