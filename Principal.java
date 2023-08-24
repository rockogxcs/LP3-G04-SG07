import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		int intentos = 3;
		do {
			vida ++;
			int vidasrest = intentos - vida + 1;
			System.out.println("Vida: " + vida + " | Intentos restantes: " + vidasrest + "\t¿Cuál es el número secreto? ");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}while(vida < intentos && !fl );
		if (fl == true) {
			System.out.println("Adivinaste en " + vida + " intentos!!!!");
			if (vida == 1){
				System.out.println("Usted ha ganado un pasaje al Caribe.");
			}else if (vida == 2){
				System.out.println("Usted ha ganado una visita al museo más cercano a su casa.");
			}else{
				System.out.println("Usted ha ganado una entrada al cine.");
			}
		}else
			System.out.println("Ups, perdiste...");
	}

}

asd