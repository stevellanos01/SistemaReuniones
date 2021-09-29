package modelo;

import java.util.ArrayList;

/**
 * @author Esteban Llanos
 */
public class Reunion {
    private String fecha; // la fecha no fue manejada como Date sino que como String, para una mayor simpleza
    private String tema;
    private Anfitrion anfitrion;
    private ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();

    /**
     * Constructor de la clase Reunion.
     * @param fecha fecha en la cual se realizara la Reunion.
     * @param tema tema a tratar en la Reunion.
     * @param anfitrion encargado de realizar la Reunion.
     */
    public Reunion(String fecha, String tema, Anfitrion anfitrion) {
        this.fecha = fecha;
        this.tema = tema;
        this.anfitrion = anfitrion;
    }

    /**
     * Construrtor de la clase Reunion.
     * @param fecha fecha en la cual se realizara la Reunion.
     * @param tema tema a tratar en la Reunion.
     * @param anfitrion encargado de realizar la Reunion.
     * @param listaParticipantes listado de Participantes.
     */
    public Reunion(String fecha, String tema,Anfitrion anfitrion, ArrayList<Participante> listaParticipantes) {
        this.fecha = fecha;
        this.tema = tema;
        this.anfitrion = anfitrion;
        this.listaParticipantes = listaParticipantes;
    }

    /**
     * Metodo encargado de agregar un nuevo Participante a la lista de participantes de la Reunion.
     * @param participante nuevo Participante.
     * @return lista de Participantes que incliye al Participante recientemente agregado.
     */
    public ArrayList<Participante> agregarParticipante (Participante participante){
        listaParticipantes.add(participante);
        return this.listaParticipantes;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTema() {
        return tema;
    }

    public Anfitrion getAnfitrion() {
        return anfitrion;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    @Override
    public String toString() {
        return "Reunion{" +
                "fecha='" + fecha + '\'' +
                ", tema='" + tema + '\'' +
                ", anfitrion=" + anfitrion +
                ", listaParticipantes=" + listaParticipantes +
                '}';
    }
}
