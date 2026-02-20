import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filas = 3;
        int columnas = 3;

        double[][] temperaturas = new double[filas][columnas];

        System.out.println("=== REGISTRO DE TEMPERATURAS ===");

        // Ingreso de datos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese temperatura Zona " + (i + 1) +
                        ", Sensor " + (j + 1) + ": ");
                temperaturas[i][j] = scanner.nextDouble();
            }
        }

        double sumaGeneral = 0;
        double limiteCritico = 33.0;

        System.out.println("\n=== PROMEDIO POR ZONA ===");

        for (int i = 0; i < filas; i++) {

            double sumaZona = 0;

            for (int j = 0; j < columnas; j++) {
                sumaZona += temperaturas[i][j];
                sumaGeneral += temperaturas[i][j];
            }

            double promedioZona = sumaZona / columnas;
            System.out.println("Zona " + (i + 1) + ": " + promedioZona + " °C");
        }

        double promedioGeneral = sumaGeneral / (filas * columnas);

        System.out.println("\n=== PROMEDIO GENERAL ===");
        System.out.println("Promedio general: " + promedioGeneral + " °C");

        System.out.println("\n=== VALORES CRÍTICOS ===");

        boolean hayCriticos = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (temperaturas[i][j] > limiteCritico) {
                    System.out.println("⚠ Alerta en Zona " + (i + 1) +
                            ", Sensor " + (j + 1) +
                            " → " + temperaturas[i][j] + " °C");
                    hayCriticos = true;
                }
            }
        }

        if (!hayCriticos) {
            System.out.println("No se detectaron valores críticos.");
        }
        scanner.close();
    }
}