import java.util.Stack;

public class Verificador {

    // Método para verificar equilibrio
    public boolean verificarEquilibrio(String expresion) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {

            char caracter = expresion.charAt(i);

            // Símbolos de apertura
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }

            // Símbolos de cierre
            else if (caracter == ')' || caracter == '}' || caracter == ']') {

                // Si la pila está vacía
                if (pila.isEmpty()) {
                    return false;
                }

                char ultimo = pila.pop();

                // Verificar correspondencia
                if (!esParCorrecto(ultimo, caracter)) {
                    return false;
                }
            }
        }

        // Si la pila queda vacía, está equilibrado
        return pila.isEmpty();
    }

    // Método auxiliar
    private boolean esParCorrecto(char apertura, char cierre) {

        return (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }
}