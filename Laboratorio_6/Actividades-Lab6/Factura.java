public class Factura implements PorPagar
{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    
    // constructor con cuatro argumentos
    public Factura(String pieza, String descripcion, int cuenta, double precio)
    {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta);     // valida y almacena la cantidad
        establecerPrecioPorArticulo(precio);    // valida y almacena el precio por articulo
    }   // fin del constructor de Factura con cuatro argumentos
    
    // getters y setters
    public String obtenerNumeroPieza(){ 
        return numeroPieza; 
    }

    public void establecerNumeroPieza(String numeroPieza){
        this.numeroPieza = numeroPieza; 
    }

    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }
    
    public void establecerDescripcionPieza(String descripcionPieza){ 
        this.descripcionPieza = descripcionPieza;
    }

    public int obtenerCantidad(){ 
        return cantidad; 
    }
    
    public void establecerCantidad(int cantidad){ 
        this.cantidad = cantidad; 
    }

    public double obtenerPrecioPorArticulo() { 
        return precioPorArticulo; 
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) { 
        this.precioPorArticulo = precioPorArticulo; 
    }

    // metodo requerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double obtenerMontoPago()
    {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }   // fin del metodo obtenerMontoPago
    
    // toString
    @Override
    public String toString() {
        return String.format("factura:\nnumero de Pieza: %s (%s)\ncantidad: %d\nprecio por articulo: %.2f", 
        obtenerNumeroPieza(), obtenerDescripcionPieza(), obtenerCantidad(), obtenerPrecioPorArticulo());
    }
}   // fin de la clase Factura
