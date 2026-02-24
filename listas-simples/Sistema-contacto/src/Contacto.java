public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String telefono, String correo, String nombre) {
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
