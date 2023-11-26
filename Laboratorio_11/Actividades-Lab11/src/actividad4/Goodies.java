package actividad4;

class Goodies {
    int id;
    String descripcion;
    float precio;

    public Goodies(int id, String descripcion, float precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
}