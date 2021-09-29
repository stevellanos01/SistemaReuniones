package principal;

import modelo.*;

/**
 * @author Esteban Llanos
 */
public class Main {
    public static void main(String [] args){

        //Cuenta c1 = new Cuenta("Esteban" , "e.llanos01@ufromail.cl", "123456789");
        //Cuenta c2 = new Cuenta("Ariel" , "a.gonzales01@ufromail.cl", "123456789");
        //Cuenta c3 = new Cuenta("Felipe" , "f.miranda02@ufromail.cl", "123456789");

        //PROBANDO LAS FUNCIONALIDADES
        Anfitrion a1 = new Anfitrion("Esteban" , "e.llanos01@ufromail.cl", "123456789");
        Participante p1 = new Participante("Ariel" , "a.gonzales01@ufromail.cl", "123456789");
        Participante p2 = new Participante("Felipe" , "f.miranda02@ufromail.cl", "123456789");

        System.out.println("");
        a1.crearReunion("27/09/21", "Clase Programacion" , a1);
        a1.getCalendario().get(0).agregarParticipante(p1);
        a1.agregarParticipante("27/04/21", p2);
        a1.mostrarCalendario();

        System.out.println("");
        a1.crearReunion("30/09/21", "Ayudantia programacion" , a1);
        a1.getCalendario().get(1).agregarParticipante( p2);
        a1.mostrarCalendario();

        System.out.println("");
        a1.crearReunion("05/10/21", "Ayudantia Metodos" , a1);
        a1.getCalendario().get(2).agregarParticipante( p1);
        a1.agregarParticipante("05/10/21", p2);
        a1.mostrarCalendario();

        System.out.println(a1.toString());
        System.out.println(a1.getCalendario().toString());

    }
}
