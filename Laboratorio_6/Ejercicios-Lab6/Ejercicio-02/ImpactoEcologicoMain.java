package Lab6.Ejercicios;

import java.util.ArrayList;

public class ImpactoEcologicoMain {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        Edificio edificio = new Edificio(25, 4);
        Auto auto = new Auto(2000, 230);
        Bicicleta bicicleta = new Bicicleta(4, 20);

        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            if (objeto instanceof Edificio) {
                System.out.println("Impacto Ecologico del edificio: " + objeto.obtenerImpactoEcologico());
            } else if (objeto instanceof Auto) {
                System.out.println("Impacto Ecologico del auto: " + objeto.obtenerImpactoEcologico());
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Impacto Ecologico de la bicicleta: " + objeto.obtenerImpactoEcologico());
            }
        }
    }   
}
