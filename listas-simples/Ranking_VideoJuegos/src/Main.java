public class Main {
    public static void main(String[] args) {

        GestionRanking ranking = new GestionRanking();

        ranking.insertar(new Jugador(1500, "Pro", "Juan"));
        ranking.insertar(new Jugador(3200, "Pro", "Ana"));
        ranking.insertar(new Jugador(2800, "Casual", "Luis"));
        ranking.insertar(new Jugador(3200, "Pro", "Sofia"));
        ranking.insertar(new Jugador(5000, "Elite", "Carlos"));

        System.out.println("Lista original:");
        ranking.mostrar();

        System.out.println("\nMáximo: " + ranking.maximo());
        System.out.println("Total jugadores: " + ranking.contar());

        System.out.println("\nOrdenado:");
        ranking.ordenarDesc();
        ranking.mostrar();

        System.out.println("\nNodo medio:");
        System.out.println(ranking.nodoMedio().getNombre());

        System.out.println("\nRepetidos:");
        ranking.buscarRepetidos();
    }
}