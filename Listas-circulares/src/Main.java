import control.CircularLinkedList;
import model.Contact;

public class Main {
    static int N=1_000_000;
    static long durationNanoSecs = 1_000_000_000;

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        long start = System.nanoTime();//Inicio de la ejercucion

        for (int i=0; i<N; i++){
            list.add(new Contact("ziri"+i,"32067345"));
        }

        long end = System.nanoTime();//fin de ejecucion
        System.out.println("List add() time: "+ (double) (end -start)/durationNanoSecs);

        start = System.nanoTime();
        System.out.println("lista inicial");
        System.out.println("tamaño: "+list.getSize());

        //list.listAll();
        end = System.nanoTime();//fin de ejecucion
        System.out.println("List add() time: "+ (double) (end -start)/durationNanoSecs);

        start = System.nanoTime();
        System.out.println("\nBuscar a ziri");
        System.out.println(list.findByName("ziri"));

        System.out.println("\nEliminar a pepe");
        list.deleteByName("pepe");
        end = System.nanoTime();//fin de ejecucion
        System.out.println("List add() time: "+ (double) (end -start)/durationNanoSecs);

        System.out.println("lista final");
        System.out.println("tamaño: "+list.getSize());


        //list.listAll();
    }
}