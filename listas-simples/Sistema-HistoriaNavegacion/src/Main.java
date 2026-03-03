public class Main {

    public static void main(String[] args) {


        HistorialNavegacion historial = new HistorialNavegacion();

        historial.visitarPagina("https://www.google.com/webhp?hl=es&sa=X&ved=0ahUKEwihsrKf3oOTAxVTTTABHdDlBPYQPAgJ");
        historial.visitarPagina("https://youtu.be/dQw4w9WgXcQ?si=0cj5tZpXxA2gZl9l");
        historial.visitarPagina("https://github.com/theLuis-24/estructura-de-datos-2026");

        historial.mostrarHistorial();

        System.out.println("=== HISTORIAL ===");
        historial.mostrarHistorial();

        System.out.println("Buscar www.youtube.com:");
        System.out.println(historial.buscarPagina("https://youtu.be/dQw4w9WgXcQ?si=0cj5tZpXxA2gZl9l"));

        System.out.println("Borrando historial...");
        historial.borrarHistorial();

        historial.mostrarHistorial();
    }
}