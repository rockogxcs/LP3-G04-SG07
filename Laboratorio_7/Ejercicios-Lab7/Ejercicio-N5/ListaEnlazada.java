public class ListaEnlazada {
    private Nodo inicio;

    public ListaEnlazada() {
        inicio = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void eliminar(int dato) {
        if (inicio != null) {
            if (inicio.dato == dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo temp = inicio;
                while (temp.siguiente != null) {
                    if (temp.siguiente.dato == dato) {
                        temp.siguiente = temp.siguiente.siguiente;
                        return;
                    }
                    temp = temp.siguiente;
                }
                assert false : "El elemento no se encuentra en la lista.";
            }
        } else {
            assert false : "La lista está vacía.";
        }
    }

    public void mostrar() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.siguiente;
        }
    }
}