import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leer expresión
        System.out.print("Ingrese una expresión: ");
        String expresion = entrada.nextLine();

        // Crear objeto de variables generales
        VariablesGenerales vg = new VariablesGenerales(expresion);

        // Crear objeto verificador
        Verificador verificador = new Verificador();

        // Verificar expresión
        boolean resultado = verificador.verificarEquilibrio(vg.getExpresion());

        // Mostrar resultado
        if (resultado) {
            System.out.println("La expresión está equilibrada.");
        } else {
            System.out.println("La expresión NO está equilibrada.");
        }

        entrada.close();
    }
}