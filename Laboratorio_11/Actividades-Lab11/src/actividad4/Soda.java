package actividad4;

class Soda extends Biscuits {
    String marca;

    public Soda(int id, String descripcion, float precio, String sabor, String marca) {
        super(id, descripcion, precio, sabor);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
