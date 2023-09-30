package Lab4;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Ej2_Class[] personas = new Ej2_Class[8];
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldoHombresTrabajan = 0;
        int sueldoMujeresTrabajan = 0;

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Ej2_Class();
            if (personas[i].getGenero() == 1) {
                hombres ++;
                if (personas[i].getTrabaja() == 1) {
                    hombresTrabajan ++;
                    sueldoHombresTrabajan += personas[i].getSueldo();
                }
            } else {
                mujeres++;
                if (personas[i].getTrabaja() == 1) {
                    mujeresTrabajan ++;
                    sueldoMujeresTrabajan += personas[i].getSueldo();
                }
            }
        }

        double porcentajeHombres = (double) hombres / personas.length * 100;
        double porcentajeMujeres = (double) mujeres / personas.length * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / hombres * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / mujeres * 100;
        double promedioSueldoHombresTrabajan = (double) sueldoHombresTrabajan / hombresTrabajan;
        double promedioSueldoMujeresTrabajan = (double) sueldoMujeresTrabajan / mujeresTrabajan;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres);
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres);
        System.out.println("Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan);
        System.out.println("Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan);
        System.out.println("Sueldo promedio de hombres: " + promedioSueldoHombresTrabajan);
        System.out.println("Sueldo promedio de mujeres: " + promedioSueldoMujeresTrabajan);
    }
}



