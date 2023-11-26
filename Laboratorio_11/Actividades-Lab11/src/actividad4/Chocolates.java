package actividad4;

class Chocolates extends Goodies {
    String tipo;

    public Chocolates(int id, String descripcion, float precio, String tipo) {
        super(id, descripcion, precio);
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
}
