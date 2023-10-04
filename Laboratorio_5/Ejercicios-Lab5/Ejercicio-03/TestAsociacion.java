public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);

        Persona cliente1 = new Persona("Juan", 'A');
        Persona cliente2 = new Persona("Maria", 'B');
        Persona cliente3 = new Persona("Carlos", 'A');

        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente2);
        bbva.agregarCliente(cliente3);
        bcp.darBajaCliente(cliente2);

        System.out.println("Clientes del BCP de tipo 'A':");
        bcp.clientesTipo('A');
        Persona clienteBuscado = new Persona("Juan", 'A');
        boolean encontrado = bcp.buscarCliente(clienteBuscado);
        if (encontrado) {
            System.out.println("Cliente encontrado en el BCP.");
        } else {
            System.out.println("Cliente no encontrado en el BCP.");
        }
    }
}


