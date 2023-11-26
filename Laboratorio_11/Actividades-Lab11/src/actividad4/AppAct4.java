package actividad4;

public class AppAct4 {
    public static void main(String[] args) {
        Bag<Goodies> bag = new Bag<>(7);

        try {
            bag.add(new Biscuits(1, "Galleta Oreo", 1.5f, "Vainilla"));
            bag.add(new Chocolates(2, "Chocolate Sublime", 2.0f, "Almendras"));
            bag.add(new Soda(3, "Gaseosa Sprite", 1.0f, "Limón", "Sprite"));
            bag.add(new Sweet(4, "Caramelo de Yogurt", 0.5f, "Fresa", "Mermelada"));

            System.out.println("Bolsa: " + bag);
        } catch (IsFull e) {
            e.printStackTrace();
        }
    }
}
