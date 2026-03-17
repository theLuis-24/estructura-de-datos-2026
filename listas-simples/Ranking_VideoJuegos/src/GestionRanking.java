public class GestionRanking {
    private Nodo cabeza;

    // 🔹 Insertar al final
    public void insertar(Jugador jugador) {
        Nodo nuevo = new Nodo(jugador);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    // 🔹 Buscar jugador por nombre
    public Jugador buscar(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getData().getNombre().equals(nombre)) {
                return actual.getData();
            }
            actual = actual.getSiguiente();
        }

        return null;
    }

    // 🔹 Contar nodos
    public int contar() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    // 🔹 Encontrar puntaje máximo
    public int maximo() {
        if (cabeza == null) return -1;

        int max = cabeza.getData().getPosicion();
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getData().getPosicion() > max) {
                max = actual.getData().getPosicion();
            }
            actual = actual.getSiguiente();
        }

        return max;
    }

    // 🔹 Ordenar de mayor a menor (burbuja)
    public void ordenarDesc() {
        if (cabeza == null) return;

        boolean cambio;

        do {
            cambio = false;
            Nodo actual = cabeza;

            while (actual.getSiguiente() != null) {
                Jugador j1 = actual.getData();
                Jugador j2 = actual.getSiguiente().getData();

                if (j1.getPosicion() < j2.getPosicion()) {
                    // intercambiar datos
                    actual.setData(j2);
                    actual.getSiguiente().setData(j1);
                    cambio = true;
                }

                actual = actual.getSiguiente();
            }
        } while (cambio);
    }

    // 🔹 Encontrar nodo medio
    public Jugador nodoMedio() {
        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        while (rapido != null && rapido.getSiguiente() != null) {
            lento = lento.getSiguiente();
            rapido = rapido.getSiguiente().getSiguiente();
        }

        return (lento != null) ? lento.getData() : null;
    }

    // 🔹 Mostrar lista
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(
                    actual.getData().getNombre() + " - " +
                            actual.getData().getPosicion()
            );
            actual = actual.getSiguiente();
        }
    }

    // 🔹 Buscar repetidos (puntajes iguales)
    public void buscarRepetidos() {
        Nodo actual = cabeza;

        while (actual != null) {
            Nodo comparador = actual.getSiguiente();

            while (comparador != null) {
                if (actual.getData().getPosicion() ==
                        comparador.getData().getPosicion()) {

                    System.out.println("Repetido: " +
                            actual.getData().getPosicion());
                }
                comparador = comparador.getSiguiente();
            }

            actual = actual.getSiguiente();
        }
    }
}