import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NodoPagina {

    String url;
    String fecha;
    NodoPagina siguiente;

    public NodoPagina(String url) {
        this.url = url;


        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        this.fecha = ahora.format(formato);
        this.siguiente = null;
    }
}