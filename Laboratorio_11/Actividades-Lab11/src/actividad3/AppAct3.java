package actividad3;

public class AppAct3 {
    public static void main(String[] args) {
        Bag<Integer> bag1 = new Bag<>(2);
        Bag<String> bag2 = new Bag<>(5);
        Bag<Persona> bag3 = new Bag<>(5);
        Bag<String> bag4 = new Bag<>(1);

        try {
            bag1.add(14);
            bag1.add(5);
            bag2.add("Limones");
            Persona persona = new Persona("Javier", "Av Argentina 102", "9 11 1234-5678");
            bag3.add(persona);
            System.out.println("Bolsa 1: " + bag1);
            System.out.println("Bolsa 2: " + bag2);
            System.out.println("Bolsa 3: " + bag3);
            
            //Bolsa llena
            bag4.add("Papas Lays");
            bag4.add("Chocolate");
            System.out.println("Bolsa 4: " + bag3);
        } catch (IsFull e) {
            e.printStackTrace();
        }
    }
}
