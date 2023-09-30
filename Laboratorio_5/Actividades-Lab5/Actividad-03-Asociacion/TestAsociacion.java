public class TestAsociacion{
	public static void main(String[] args) {
		Banco bcp = new Banco("BCP");
		Banco bbva = new Banco("BBVA", 30);

		Cuenta c1 = new Cuenta(197648, 2520.0);
		Cuenta c2 = new Cuenta(579380, 503.1);
		Cuenta c3 = new Cuenta(762370, 1200.2);
		Cuenta c4 = new Cuenta(919117, 100520.0);
		
		Persona p1 = new Persona(1, "Pepito", "Juarez", c1, 'A'); // Tipo A
		Persona p2 = new Persona(2, "Ramon", "Valdez", c2, 'B'); // Tipo B
		Persona p3 = new Persona(3, "Fernando", "Rojas", c3, 'A'); // Tipo A
		Persona p4 = new Persona(4, "Ricardo", "Diaz", c4, 'A'); // Tipo A

		// Agregar clientes al BCP y BBVA
		bcp.agregarCliente(p1);
		bcp.agregarCliente(p2);
		
		bbva.agregarCliente(p3);
		bbva.agregarCliente(p4);

		// Buscar clientes
		System.out.println("¿" + p1.getNombre() + " " +  p1.getApellido() + " es cliente del BCP? " + (bcp.buscarCliente(p1) ? "Sí" : "No"));
		System.out.println("¿" + p2.getNombre() + " " +  p2.getApellido() + " es cliente del BBVA? " + (bbva.buscarCliente(p2) ? "Sí" : "No"));
		System.out.println("¿" + p3.getNombre() + " " +  p3.getApellido() + " es cliente del BBVA? " + (bbva.buscarCliente(p3) ? "Sí" : "No"));
		System.out.println("¿" + p4.getNombre() + " " +  p4.getApellido() + " es cliente del BCP? " + (bcp.buscarCliente(p4) ? "Sí" : "No"));

		// Mostrar clientes del BCP y BBVA
		System.out.println(bcp.toString());
		System.out.println(bbva.toString());

        // Listar clientes por tipo
        bcp.clientesTipo('A');
        bcp.clientesTipo('B');
        bbva.clientesTipo('A');
        bbva.clientesTipo('B');
        
        System.out.println("\n");
        
		// Eliminar un cliente del BCP
		Persona clienteEliminado = bcp.darBajaCliente(p1);
		if(clienteEliminado != null){
			System.out.println("El cliente " + clienteEliminado.getNombre() + " ha sido eliminado del banco BCP.");
		}

		// Mostrar clientes del BCP luego de la eliminación
		System.out.println("\nClientes del BCP:");
		System.out.println(bcp.toString());
		
	}
}
