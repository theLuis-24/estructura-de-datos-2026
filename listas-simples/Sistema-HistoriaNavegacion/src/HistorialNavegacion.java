public class HistorialNavegacion {

    private NodoPagina cabeza;

    public HistorialNavegacion() {
        cabeza = null;
    }


    public void visitarPagina(String url) {
        NodoPagina nueva = new NodoPagina(url);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            NodoPagina actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nueva;
        }
    }


    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        NodoPagina actual = cabeza;
        while (actual != null) {
            System.out.println("URL: " + actual.url +
                    " | Fecha: " + actual.fecha);
            actual = actual.siguiente;
        }
    }


    public boolean buscarPagina(String url) {
        NodoPagina actual = cabeza;

        while (actual != null) {
            if (actual.url.equals(url)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }


    public void borrarHistorial() {
        cabeza = null;
        System.out.println("Historial eliminado.");
    }
}