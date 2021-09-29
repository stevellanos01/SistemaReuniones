package modelo;

/**
 * @author Esteban Llanos
 */
public class Participante extends Cuenta{

    public Participante(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    @Override
    public String toString() {
        return "Participante{" + super.toString() +
                "}";
    }
}
