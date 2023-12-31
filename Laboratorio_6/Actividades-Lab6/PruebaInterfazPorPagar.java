public class PruebaInterfazPorPagar
{
    public static void main( String[] args )
    {
        // crea arreglo PorPagar con cinco elementos
        PorPagar[] objetosPorPagar = new PorPagar[5];
        
        // llena el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(12, 200.00);
        
        System.out.println("Facturas, Empleados y Prestamos procesados en forma polimorfica:\n");
        
        // procesa en forma generica cada elemento en el arreglo objetosPorPagar
        for(PorPagar porPagarActual : objetosPorPagar)
        {
            // imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%s \n%s: $%.2f\n\n", porPagarActual.toString(), "pago vencido", 
            porPagarActual.obtenerMontoPago());
        }   // fin de for
    }   // fin de main
}   // fin de la clase PruebaInterfazPorPagar
