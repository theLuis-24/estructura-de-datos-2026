public class Nodo {
    private Jugador data;
    private Nodo siguiente;

    public Nodo(Jugador data) {
        this.data = data;
    }

    public Jugador getData() {
        return data;
    }

    public void setData(Jugador data) {
        this.data = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
