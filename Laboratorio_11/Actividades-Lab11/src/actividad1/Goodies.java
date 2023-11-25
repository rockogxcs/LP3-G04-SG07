package actividad1;

class Goodies implements Contenedora<Integer> {
    int id;
    String description;
    float price;

    @Override
    public boolean contiene(Integer valor) {
        return id == valor;
    }
}