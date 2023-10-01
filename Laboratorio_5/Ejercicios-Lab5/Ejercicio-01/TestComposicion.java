public class TestComposicion{
    public static void main(String[] args) {
        Persona p1 = new Persona(2734, "Oscar", "Gutierrez", 'C');
        System.out.println(p1.toString());
        System.out.println("\n");

        p1.getCuenta().depositar(2500);   // Deposita 2500 soles a Oscar (p1)
        System.out.println("\tSe depositaron S/.2500 a Oscar");
        System.out.println(p1.toString());
        System.out.println("\n");

        Persona p2 = new Persona(2735, "Alfonso", "Mateluna", 'B');
        System.out.println(p2.toString());
        System.out.println("\n");

        p2.getCuenta().depositar(5000);   // Deposita 5000 soles a Alfonso (p2)
        System.out.println("\tSe depositaron S/.5000 a Alfonso");
        System.out.println(p2.toString());
        System.out.println("\n");

        Persona p3 = new Persona(2736, "Angela", "Gomez", 'E');
        System.out.println(p3.toString());
        System.out.println("\n");

        p3.getCuenta().depositar(8000);   // Deposita 8000 soles a Angela (p3)
        System.out.println("\tSe depositaron S/.8000 a Angela");
        System.out.println(p3.toString());
        System.out.println("\n");
        
        p2.getCuenta().retirar(300);   // Se retiran 300 soles a Alfonso (p2)
        System.out.println("\tSe retiraron S/.300 a Alfonso");
        System.out.println(p2.toString());
        System.out.println("\n");
        
        p1.getCuenta().retirar(-20);   // Se intenta retiran -20 soles a Oscar (p1)
        System.out.println("\tNo se pudo retirar el dinero a Oscar");
        System.out.println(p1.toString());
        System.out.println("\n");
    }
}
