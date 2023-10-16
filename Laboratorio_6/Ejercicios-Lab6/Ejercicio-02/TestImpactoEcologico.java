import java.util.ArrayList;

class TestImpactoEcologico {
    public static void main(String[] args) {
        Edificio e = new Edificio(10, 100);
        Auto a = new Auto(20000, 10);
        Bicicleta b = new Bicicleta(500);

        ArrayList<ImpactoEcologico> lista = new ArrayList<>();
        lista.add(e);
        lista.add(a);
        lista.add(b);

        for (ImpactoEcologico i : lista) {
            System.out.println("Clase: " + i.getClass().getSimpleName());
            System.out.println("Impacto Ecologico: " + i.obtenerImpactoEcologico());
            System.out.println();
        }
    }
}
