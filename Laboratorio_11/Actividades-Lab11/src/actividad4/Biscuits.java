package actividad4;

class Biscuits extends Goodies {
    String sabor;

    public Biscuits(int id, String descripcion, float precio, String sabor) {
        super(id, descripcion, precio);
        this.sabor = sabor;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
}

