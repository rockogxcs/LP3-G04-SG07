public class TestAgregacion {
    public static void main(String[] args) {
        // Auto sin motor
        Automovil a1 = new Automovil("AU398", 3, "Toyota", "Corolla", null);
        System.out.println(a1.toString());
        System.out.println("\n");

        // Auto con motor
        Motor m1 = new Motor(3728, 1000);
        Automovil a2 = new Automovil("VH742", 5, "Nissan", "Versa", m1);
        System.out.println(a2.toString());
    }
}
