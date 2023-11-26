package actividad2;

public class AppAct2 {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 3);
        System.out.println(pair1);

        OrderedPair<Integer, String> pair2 = new OrderedPair<>(4, "Hola");
        System.out.println(pair2);

        Persona p1 = new Persona("Kevin", "Calle Italia 121", "987654321");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Datos de Persona", p1);
        System.out.println(pair3);
    }
}
