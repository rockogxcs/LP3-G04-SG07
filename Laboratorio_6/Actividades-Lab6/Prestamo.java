public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuota;

    // constructor con dos argumentos
    public Prestamo(int numeroDeCuotas, double montoDeCuota)
    {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    // getter y setters
    public int obtenerNumeroDeCuotas() { 
        return numeroDeCuotas; 
    }
    
    public void establecerNumeroDeCuotas(int numeroDeCuotas) { 
        this.numeroDeCuotas = numeroDeCuotas; 
    }
    
    public double obtenerMontoDeCuota() { 
        return montoDeCuota; 
    }
    
    public void establecerMontoDeCuota(double montoDeCuota) { 
        this.montoDeCuota = montoDeCuota;
    }

    // Método obtenerMontoPago
    @Override
    public double obtenerMontoPago()
    {
        return obtenerNumeroDeCuotas() * obtenerMontoDeCuota();
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("prestamo:\nnumero de cuotas: %d\nmonto de cuota: $%.2f", 
        obtenerNumeroDeCuotas(), obtenerMontoDeCuota());
    }
}   // fin de la clase Prestamo