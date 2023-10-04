public class Persona{
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipo;
    
    public Persona(int id, String nombre, String apellido, Cuenta cuenta, char tipo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.tipo = tipo;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }
    
    public char getTipo(){
        return tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return id == persona.id;
    }


   @Override
   public String toString(){
       return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido 
       + ", Número de cuenta: " + cuenta.getNumero();
   }
}