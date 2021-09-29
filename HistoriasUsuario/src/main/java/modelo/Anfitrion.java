package modelo;

import java.util.ArrayList;

/**
 * @author Esteban Llanos
 */
public class Anfitrion extends Cuenta{

    private ArrayList<Reunion> calendario = new ArrayList<Reunion>();

    public Anfitrion(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    /**
     * Metodo encargado de crear una nueva Reunion.
     * @param fecha fecha en la cual se realizara la Reunion.
     * @param tema tema o asunto a tratar en la Reunion.
     * @param anfitrion encargado de realizar la Reunion.
     */
    public void crearReunion(String fecha, String tema, Anfitrion anfitrion){
        Reunion reunion = new Reunion(fecha, tema, anfitrion);
        aregarReunion(reunion);
    }

    /**
     * Metodo encargado de agregar una nueva Reunion a la lista de Reuniones.
     * @param reunion nueva Reunion.
     * @return lista de Reuniones.
     */
    public ArrayList<Reunion> aregarReunion(Reunion reunion){
        calendario.add(reunion);
        return this.calendario;
    }

    /**
     * Metodo encargado de mostrar por consola todas las reuniones almacenadas.
     */
    public void mostrarCalendario(){
        for(int i = 0;i<getCalendario().size();i++) {
            System.out.println("["+i+"] " + getCalendario().get(i).toString());
        }
    }

    /**
     * Metodo encargado de agregar nuevos participantes a una reunion especifica.
     * Se busca dentro de la lista de Reuniones o calendario, por la fecha de la Reunion.
     * @param fecha fecha de la reunion a buscar, es utilizada para buscar la reunion almacenada en la lista de Reuniones.
     * @param participante nuevo participante que se agregara a la reunion.
     */
    public void agregarParticipante(String fecha, Participante participante){
        for(int i = 0;i<getCalendario().size();i++) {
            if(getCalendario().get(i).getFecha() == fecha){
                getCalendario().get(i).agregarParticipante(participante);
            }
        }
    }

    /**
     * Metodo encargado de modificar la fecha de una Reunion.
     * @param fecha fecha de la reunion a modificar, es utilizada para buscar la reunion almacenada en la lista de Reuniones.
     * @param nuevaFecha nueva fecha que tendra la Reunion.
     */
    public void modificarFecha(String fecha, String nuevaFecha){
        for(int i = 0;i<getCalendario().size();i++) {
            if(getCalendario().get(i).getFecha() == fecha){
                getCalendario().get(i).setFecha(nuevaFecha);
            }
        }
    }

    /**
     * Metodo encargado de modificar el tema de una Reunion.
     * @param fecha fecha de la reunion a modificar, es utilizada para buscar la reunion almacenada en la lista de Reuniones.
     * @param tema nuevo tema que tendra la Reunion.
     */
    public void modificarTema(String fecha, String tema){
        for(int i = 0;i<getCalendario().size();i++) {
            if(getCalendario().get(i).getFecha() == fecha){
                getCalendario().get(i).setTema(tema);
            }
        }
    }

    public ArrayList<Reunion> getCalendario() {
        return calendario;
    }

    public void setCalendario(ArrayList<Reunion> calendario) {
        this.calendario = calendario;
    }

    @Override
    public String toString() {
        return "Anfitrion{" + super.toString() + "}";
    }
}
