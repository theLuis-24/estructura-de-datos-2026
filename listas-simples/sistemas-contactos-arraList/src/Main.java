import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto> lista = new ArrayList<>();
        GestionContactos gestion = new GestionContactos(lista);

        gestion.insertar(new Contacto("33254555","pepe@gmail.","PEPE" ));


        gestion.insertar(new Contacto("3184555","luispepe@ufso.edu","JOSE"));

        gestion.insertar(new Contacto("3185655","simon@ufso.edu","simon"));

        gestion.insertar(new Contacto("3178555","agent7@ufso.edu","baku"));

        gestion.insertar(new Contacto("3674555","josejose@ufso.edu","men"));

        System.out.println("Lista contactos");
        gestion.listar();

        System.out.println("Buscar PEPE");
        System.out.println(gestion.buscar("PEPE"));

        System.out.println("eliminar JOSE");
        System.out.println(gestion.eliminar("JOSE"));

        System.out.println("Lista de contactos final");
        gestion.listar();
    }

}