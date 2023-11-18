package ejercicio3;

public class AppEj3 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Integer int1 = 8;
        Integer int2 = 8;
        Double db1 = 13.2;
        Double db2 = 13.2;
        String str1 = "Hola";
        String str2 = "Adios";
        Persona p1 = new Persona("Juan", 27);
        Persona p2 = new Persona("Felipe", 27);
        
        System.out.println("Dos argumentos de tipo Objeto " + obj1 + " y " + obj1 + ": ");
        System.out.println(isEqualTo(obj1, obj1));
        
        System.out.println("Dos argumentos de tipo Objeto " + obj1 + " y " + obj2 + ": ");
        System.out.println(isEqualTo(obj1, obj2)); 
        
        System.out.println("Dos argumentos de tipo Integer " + int1 + " y " + int2 + ": ");
        System.out.println(isEqualTo(int1, int2));
        
        System.out.println("Dos argumentos de tipo Double " + db1 + " y " + db2 + ": ");
        System.out.println(isEqualTo(db1, db2));
        
        System.out.println("Dos argumentos de tipo String " + str1 + " y " + str2 + ": ");
        System.out.println(isEqualTo(str1, str2));
        
        System.out.println("Dos argumentos de tipo Persona " + p1 + " y " + p2 + ": ");
        System.out.println(isEqualTo(p1, p2));
    }
    
    public static <T> boolean isEqualTo(T a, T b) {
        return a.equals(b);
    }
}
