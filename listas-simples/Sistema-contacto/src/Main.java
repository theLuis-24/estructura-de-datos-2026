public class Main {
    public static void main(String[] args) {
       ListaContactos lista = new ListaContactos();

       lista.insertarFinal(new Contacto("3184555","luispepe@ufso.edu","JOSE"));

        lista.insertarFinal(new Contacto("3185655","simon@ufso.edu","simon"));

        lista.insertarFinal(new Contacto("3178555","agent7@ufso.edu","baku"));

        lista.insertarFinal(new Contacto("3674555","josejose@ufso.edu","men"));

        System.out.println("La lista Actual");
        lista.listar();

        System.out.println("Buscar baku");
        System.out.println(lista.buscar("baku"));

        System.out.println("eliminar men");
        System.out.println(lista.eliminar("men"));
    }

}