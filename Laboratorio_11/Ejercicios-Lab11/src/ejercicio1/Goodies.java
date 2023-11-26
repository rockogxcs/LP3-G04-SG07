package ejercicio1;

class Goodies implements Contenedora<Integer> {
    int id;
    String description;
    float price;

    @Override
    public boolean contiene(Integer valor) {
        return id == valor;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Goodies goodies = (Goodies) obj;
        return description.equals(goodies.description);
    }

    @Override
    public String toString() {
        return description;
    }
}