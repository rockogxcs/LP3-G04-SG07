package ejercicio1;

import java.util.List;

public class AppEj1 {
    public static void main(String[] args) {
        try {
            CandyBags bag1 = new CandyBags(4);
            Goodies g1 = new Goodies();
            g1.id = 0001;
            g1.description = "Cua Cua";
            g1.price = 1.5f;
            bag1.add(g1);

            Goodies g2 = new Goodies();
            g2.id = 0002;
            g2.description = "Chinchin";
            g2.price = 3f;
            bag1.add(g2);

            Goodies g3 = new Goodies();
            g3.id = 0003;
            g3.description = "Globopop";
            g3.price = 4.99f;
            bag1.add(g3);
            
            Goodies g4 = new Goodies();
            g4.id = 0003;
            g4.description = "Globopop";
            g4.price = 4.99f;
            bag1.add(g4);

            System.out.println("\nLa golosina mas barata: " + bag1.cheapest().description);

            List<Goodies> caro = bag1.mostExpensive(2);
            System.out.println("Las golosinas mas caras: " + caro);
        } catch (IsFull | IsEmpty e) {
            e.printStackTrace();
        }
    }
}
