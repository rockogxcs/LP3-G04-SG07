public class ContadorTest3 {
    public static void main(String[] args) {
        Contador c1, c2, c3;

        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Valor inicial del último contador creado: " + Contador.getUltimoContador());

        c1 = new Contador(3);
        System.out.println("\nc1 - Valor: " + c1.getValor());
        System.out.println("c1 - Acumulador: " + Contador.acumulador());
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Valor inicial del último contador creado: " + Contador.getUltimoContador());

        c2 = new Contador(8);
        System.out.println("\nc2 - Valor: " + c2.getValor());
        System.out.println("c2 - Acumulador: " + Contador.acumulador());
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Valor inicial del último contador creado: " + Contador.getUltimoContador());

        c3 = new Contador();
        System.out.println("\nc3 - Valor: " + c3.getValor());
        System.out.println("c3 - Acumulador: " + Contador.acumulador());
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Valor inicial del último contador creado: " + Contador.getUltimoContador());
    }
}
