public class TestHerencia {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel", 12345678, 28, 1000.0); 
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan", 55333222, 30, "noche", 1200.0);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio", 55333666, 35, "Arequipa", 1100.0); 

        System.out.println(empleado1.toString());
        System.out.println(empleado1.calcularNomina());

        System.out.println(empleado2.toString());
        System.out.println( empleado2.calcularNomina());

        System.out.println(empleado3.toString());
        System.out.println(empleado3.calcularNomina());
    }
}
