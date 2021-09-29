package modelo;

/**
 * @author Esteban Llanos
 */
public class Cuenta {

    private String nombre;
    private String correo;
    private String contrasena;

    /**
     * Constructor de la clase Cuenta
     * @param nombre nombre del usuario
     * @param correo correo electronico del usuario
     * @param contrasena contrasena de acceso
     */
    public Cuenta(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
