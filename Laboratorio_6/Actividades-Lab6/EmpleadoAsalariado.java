public class EmpleadoAsalariado extends Empleado
{
    private double salarioSemanal;
    
    // constructor con cuatro argumentos
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario)
    {
        super(nombre, apellido, nss);   // pasa argumentos al constructor de Empleado
        establecerSalarioSemanal(salario); // valida y almacena el salario
    }   // fin del constructor de EmpleadoAsalariado con cuatro argumentos
    
    public double obtenerSalarioSemanal() { 
        return salarioSemanal; 
    }
    
    public void establecerSalarioSemanal(double salarioSemanal) { 
        this.salarioSemanal = salarioSemanal; 
    }
    
    // calcula los ingresos; implementa el método de la interfaz PorPagar
    // que era abstracto en la superclase Empleado
    @Override
    public double obtenerMontoPago()
    {
        return obtenerSalarioSemanal();
    }   // fin del método obtenerMontoPago

    // toString
    @Override
    public String toString() {
        return String.format("%s\nsalario semanal: $%.2f", 
        super.toString(), obtenerSalarioSemanal());
    }
}   // fin de la clase EmpleadoAsalariado