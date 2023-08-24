package Ejercicio2;

public class perfilMedico {
    private String firstName;
    private String lastName;
    private String genero;
    private int dDate;
    private int mDate;
    private int yDate;
    private double height;
    private double weight;

    private int yearsOld;

    public perfilMedico (String firstName_, String lastName_, String genero_, int dDate_, int mDate_, int yDate_, double height_, double weight_){
        this.firstName = firstName_;
        this.lastName = lastName_;
        this.genero = genero_;
        this.dDate = dDate_;
        this.mDate = mDate_;
        this.yDate = yDate_;
        this.height = height_;
        this.weight = weight_;
    }

    public void setFirstName (String firstName_){
        this.firstName = firstName_;
    }

    public String getFirstName (){
        return this.firstName;
    }

    public void setLastName (String lastName_){
        this.lastName = lastName_;
    }

    public String getLastName (){
        return this.lastName;
    }

    public void setGenero(String genero_){
        this.genero = genero_;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setDayDate (int dDate_){
        this.dDate = dDate_;
    }

    public int getDayDate (){
        return this.dDate;
    }

    public void setMonthDate (int mDate_){
        this.mDate = mDate_;
    }

    public int getMonthDate (){
        return this.mDate;
    }

    public void setYeardate (int yDate_){
        this.yDate = yDate_;
    }

    public int getYearDate (){
        return this.yDate;
    }

    public void setHeight (double height_){
        this.height = height_;
    }

    public double getHeight (){
        return this.height;
    }

    public void setWeight (double weight_){
        this.weight = weight_;
    }

    public double getWeight (){
        return this.weight;
    }

    public void calcYO(){
        int year = 2023;

        int calcY = year - yDate;
        yearsOld = calcY;
        int calcD = 23 - dDate;
        int calcM = 8 - mDate;
        
        System.out.println("Usted tiene " + calcY + " años con " + calcM + " meses y " + calcD + " días.");
    }

    public void calcFMC (){
        double rslt = 208 - 0.7 * yearsOld;

        System.out.println("La frecuencia Cardiaca del paciente es: " + rslt);
    }

    public void calcIMC (){
        double resultado = getWeight() / getHeight();

        System.out.println("Su masa corporal es: " + resultado);
    }

    public void showInfo(){
        System.out.println("\n  DATOS:\nNombre: " + getFirstName() + "\nApellidos: " + getLastName() + "\nGenero: " + getGenero() + "\nFecha de nacimiento: " + getDayDate() + "/" + getMonthDate() + "/" + getYearDate() + "\nAltura: " + getHeight() + " cm \nPeso: " + getWeight() + " kg");
        System.out.println("\n\n  CALCULOS:\n");
        calcYO();
        calcIMC();
        calcFMC();
        System.out.println("\n");
    }

}

