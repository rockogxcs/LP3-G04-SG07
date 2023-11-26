package actividad3;

class IsFull extends Exception {
    public IsFull() {
        super("La bolsa esta llena.");
    }
}