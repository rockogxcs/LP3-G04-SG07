package Lab4;

import java.util.Random;

public class Ej2_Class {
    private int genero; 
    private int trabaja;
    private int sueldo;
 
    public int getGenero() {
        return genero;
    }

    public int getTrabaja() {
        return trabaja;
    }

    public int getSueldo() {
        return sueldo;
    }

    public Ej2_Class() {
        Random random = new Random();
        this.genero = random.nextInt(2) + 1; 
        this.trabaja = random.nextInt(2) + 1;

        if (this.trabaja == 1) {
            this.sueldo = random.nextInt(2051) + 950; 
        } else {
            this.sueldo = 0;
        }
    }

}


