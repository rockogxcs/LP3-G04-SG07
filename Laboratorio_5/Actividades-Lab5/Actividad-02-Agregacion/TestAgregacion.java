public class TestAgregacion {
    public static void main(String[] args) {
        Motor m1 = new Motor(951, 3200);
        Motor m2 = new Motor(186, 4500);
        Motor m3 = new Motor(459, 2530);

        Automovil a1 = new Automovil("VOZ-460", 4, "Toyota", "Corolla", m1);
        Automovil a2 = new Automovil("FZR-825", 2, "Hyundai", "Elantra", m2);
        Automovil a3 = new Automovil("ZLT-931", 2, "Rockstar", "Admiral", m3);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}