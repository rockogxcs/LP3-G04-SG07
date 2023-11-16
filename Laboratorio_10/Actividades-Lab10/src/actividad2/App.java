package actividad2;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n",
        3, 4, 5, 6, minimo(3,4,5,6));
        
        System.out.printf("Minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
        6.6, 7.7, 8.8, 9.9, minimo(6.6,7.7,8.8,9.9));

        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",
        "pera", "zanahoria", "uva", "manzana", minimo("pera","zanahoria","uva","manzana"));

        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",
        new Persona("Juan"), new Persona("Ana"), new Persona("Pedro"), new Persona("Maria"),
        minimo(new Persona("Juan"), new Persona("Pedro"), new Persona("Maria"), new Persona("Ana")));
    }
    
    public static <T extends Comparable<T>> T minimo (T w, T x, T y, T z){
        T min = w;
        if(x.compareTo(min) < 0)
            min = x;
        if(y.compareTo(min) < 0)
            min = y;
        if(z.compareTo(min) < 0)
            min = z;
        return min;
    }
}
