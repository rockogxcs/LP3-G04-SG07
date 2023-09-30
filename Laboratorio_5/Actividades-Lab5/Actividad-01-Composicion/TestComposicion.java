public class TestComposicion {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(197648, 5250.0);
        Cuenta c2 = new Cuenta(846726, 3825.0);
        Cuenta c3 = new Cuenta(568731, 1800.5);
        
        Persona p1 = new Persona(1, "Andre", "Martinez", c1);
        Persona p2 = new Persona(2, "Diego", "Pita", c2);
        Persona p3 = new Persona(3, "Carlos", "Aparicio", c3);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}

