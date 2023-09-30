public class Persona{
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Persona(int id, String nombre, String apellido, Cuenta cuenta){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }
    
    // setters y getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    
   @Override
   public String toString(){
       return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Número de cuenta: " + cuenta.getNumero();
   }
}