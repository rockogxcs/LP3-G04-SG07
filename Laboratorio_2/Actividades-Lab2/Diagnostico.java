public class Diagnostico {
    public void aptoVacunaA(Perro perro1) {
        double temp = perro1.getTemp();
        int edad = perro1.getEdad();
        double peso = perro1.getPeso();
        
        if(temp >= 37 && temp <= 40 && peso > 5 && edad > 1)
            System.out.println("DIAGNÓSTICO: El Perro está SANO");
        else
            System.out.println("DIAGNÓSTICO: El Perro está ENFERMO");
    }
    public void aptoVacunaB(Perro perro2) {
        double temp = perro2.getTemp();
        int edad = perro2.getEdad();
        double peso = perro2.getPeso();
        
        if(temp >= 37 && temp <= 40 && peso > 5 && edad > 1)
            System.out.println("DIAGNÓSTICO: El Perro está SANO");
        else
            System.out.println("DIAGNÓSTICO: El Perro está ENFERMO");
    }
}