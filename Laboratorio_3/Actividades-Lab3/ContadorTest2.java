public class ContadorTest2 {
	public static void main(String[] args) {
		Contador c1;
		System.out.println("Acumulador: " + Contador.acumulador());
		c1 = new Contador();
		System.out.println("Valor inicial de c1: " + c1.getValor());
		c1.inc();
		System.out.println("Incremento en c1.");
		System.out.println("Acumulador final: " + Contador.acumulador);
	}
}
