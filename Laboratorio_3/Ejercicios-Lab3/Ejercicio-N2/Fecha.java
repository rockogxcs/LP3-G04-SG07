package Lab3;
import java.util.Scanner;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha (){
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    public Fecha (int day_, int month_, int year_){
        valida(day_, month_, year_);
        this.day = day_;
        this.month = month_;
        this.year = year_;
    }

    public void setDay(int day_){
        this.day = day_;
    }

    public int getDay(){
        return this.day;
    }

    public void setMonth(int month_){
        this.month = month_;
    }

    public int getMonth(){
        return this.month;
    }

    public void setYear(int year_){
        this.year = year_;
    }

    public int getYear(){
        return this.year;
    }

    public void leer (){
        Scanner sDay = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        day = sDay.nextInt();
        
        while (day < 0 || day > 31){
            System.out.println("Ingrese un día valido: ");
            this.day = sDay.nextInt();
        }

        Scanner sMonth = new Scanner(System.in);
        System.out.println("Ingrese el mes: ");
        month = sMonth.nextInt();
        
        while (month < 0 || month > 12)  {
            System.out.println("Ingrese un mes valido: ");
            this.month = sMonth.nextInt();
        }

        Scanner sYear = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        year = sYear.nextInt();
        
        while (year < 1900 || year > 2050)  {
            System.out.println("Ingrese un año valido: ");
            this.year = sYear.nextInt();
   
        }
        valida(day, month, year);  
    }

    public void bisiesto(int year_){
        if ((year_ % 4 == 0) && ((year_ % 100 != 0) || (year_ % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
    }

    public int diaMes(int month_, int year_){

        int[] dayMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        this.year = year_;

        if (month_ < 1 || month_ > 12) {
            System.out.println("Mes invalido, ingrese un mes valido: ");
            Scanner sMonth = new Scanner(System.in);
            month_ = sMonth.nextInt();
        }
        else
            this.month = month_;

        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            return 29;
        }

        return dayMonth[this.month - 1];
    }

    private void valida (int day_, int month_, int year_){
        if (year_ < 1900 || year_> 2050){
            this.year = 1900;
        }
        else
            this.year = year_;
        
        if (month_ < 1 || month_ > 12){
            this.month = 1;
        }
        else
            this.month = month_;

        if (day_ < 1 || day_ > 31){
            this.day = 1;
        }
        else
            this.day = day_;
    }

    public void corta(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public int diasTranscurridos() {

        int[] dayMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = 0;

        for (int i = 1900; i < this.year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totalDays += 366; 
            } else {
                totalDays += 365; 
            }
        }

        for (int j = 1; j < this.month; j++) {
            totalDays += dayMonth[j - 1];
        }

        totalDays += this.day;

        return totalDays;
    }

    public int diaSemana() {
        int month_ = this.month;
        int year_ = this.year;

        if (month_ < 3) {
            month_ += 12;
            year_ -= 1;
        }

        int tmp1 = year_ % 100;
        int tmp2 = year_ / 100;

        int i = (this.day + (13 * (month_ + 1)) / 5 + tmp1 + (tmp1 / 4) + (tmp2 / 4) - (2 * tmp2)) % 7;

        int wDay = (i + 5) % 7;

        return wDay;
    }

    public void larga(){
        String[] nDays = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String[] nMonths = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
     
        String day_ = nDays[diaSemana()];
        String month_ = nMonths[month - 1];

        System.out.println(day_ + " " + this.day + " de " + month_ + " de " + this.year);

    }

    public void fechaTras(long newDays_) {
        int aYear = 1900;
        int aMonth = 1;
        int aDay = 1;

        while (newDays_ > 0) {
            boolean bisiesto = ((aYear % 4 == 0 && aYear % 100 != 0) || (aYear % 400 == 0));
            int daysInYear = bisiesto ? 366 : 365;

            long restDays = daysInYear - diasTranscurridos();

            if (newDays_ > restDays) {
                newDays_ -= restDays;
                aYear++;
                aMonth = 1;
                aDay = 1;
            } else {
                aDay += newDays_;
                break;
            }
        }

        this.day = aDay;
        this.month = aMonth;
        this.year = aYear;
    }

    public long diasEntre(Fecha dFecha) {
        long diasTranscurridos_ = diasTranscurridos();
        long dFechaDiferente = dFecha.diasTranscurridos();
        
        return Math.abs(diasTranscurridos_ - dFechaDiferente);
    }

    public void siguiente() {
        long diasTranscurridos = diasTranscurridos();
        fechaTras(diasTranscurridos + 1);
    }

    public void anterior() {
        long diasTranscurridos = diasTranscurridos();
        fechaTras(diasTranscurridos - 1);
    }

    public void fechaFutura(long days) {
        fechaTras(diasTranscurridos() + days);
    }

    public Fecha copia() {
        return new Fecha(this.day, this.month, this.year);
    }

    public boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.day == fecha2.day && fecha1.month == fecha2.month && fecha1.year == fecha2.year;
    }

    public boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.year < fecha2.year) {
            return true;
        } else if (fecha1.year > fecha2.year) {
            return false;
        } else {
            if (fecha1.month < fecha2.month) {
                return true;
            } else if (fecha1.month > fecha2.month) {
                return false;
            } else {
                return fecha1.day < fecha2.day;
            }
        }
    }

    public boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.year > fecha2.year) {
            return true;
        } else if (fecha1.year < fecha2.year) {
            return false;
        } else {
            if (fecha1.month > fecha2.month) {
                return true;
            } else if (fecha1.month < fecha2.month) {
                return false;
            } else {
                return fecha1.day > fecha2.day;
            }
        }
    }

}
