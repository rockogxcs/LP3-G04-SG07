public class perfilMedico {
    private String nombre;
    private String apellido;
    private String genero;
    private int dDate;
    private int mDate;
    private int yDate;
    private double altura;
    private double peso;

    private int yearsOld;

    public perfilMedico (String nombre, String apellido, String genero, int dDate, int mDate, int yDate, double altura, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.dDate = dDate;
        this.mDate = mDate;
        this.yDate = yDate;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public String getApellido (){
        return this.apellido;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setDia (int dDate){
        this.dDate = dDate;
    }

    public int getDia (){
        return this.dDate;
    }

    public void setMes (int mDate){
        this.mDate = mDate;
    }

    public int getMes (){
        return this.mDate;
    }

    public void setAnio (int yDate){
        this.yDate = yDate;
    }

    public int getAnio (){
        return this.yDate;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public double getAltura (){
        return this.altura;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public double getPeso (){
        return this.peso;
    }

    public void calcularEdad(){
        int year = 2023;

        int calcY = year - yDate;
        yearsOld = calcY;
        
        System.out.println("Usted tiene " + calcY + " años.");
    }

    public void calcularFMC (){
        double rslt = 208 - (0.7 * yearsOld);

        System.out.println("Su Frecuencia Cardiaca Máxima (FMC) es: " + rslt);
    }

    public void calcularIMC (){
        double alturaMetros = getAltura() / 100.0; // Convertir cm a m
        double resultado = getPeso() / (alturaMetros * alturaMetros);

        System.out.println("Su Indice de Masa Corporal (ICM) es: " + resultado);
    }

    public void mostrarInfo(){
        System.out.println("\n     DATOS:");
        System.out.println("================");
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nGenero: " + getGenero() + "\nFecha de nacimiento: " + getDia() + "/" + getMes() + "/" + getAnio() + "\nAltura: " + getAltura() + " cm \nPeso: " + getPeso() + " kg");
        System.out.println("\n   RESULTADOS:");
        System.out.println("================");
        calcularEdad();
        calcularIMC();
        calcularFMC();
    }
}