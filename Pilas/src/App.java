import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        Stack<String> historial = new Stack<>();

        // Visitar páginas
        historial.push("google.com");
        historial.push("youtube.com");
        historial.push("github.com");

        System.out.println("Historial actual: " + historial);

        // Página actual
        System.out.println("Página actual: " + historial.peek());

        // Ir atrás
        historial.pop();
        System.out.println("\nDespués de presionar 'Atrás':");
        System.out.println("Página actual: " + historial.peek());

        // Nueva página
        historial.push("stackoverflow.com");
        System.out.println("\nNueva página visitada");
        System.out.println("Página actual: " + historial.peek());
    }
}