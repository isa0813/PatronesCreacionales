package domain.Prototype;

import domain.Prototype.Participant;
import domain.Prototype.ConferencePrototype;
import domain.Prototype.Session;
import java.util.ArrayList;

/**
 * La clase {@code Workshop} representa un taller dentro de una conferencia, 
 * extendiendo la funcionalidad de la clase {@link ConferencePrototype}.
 * Un taller contiene un nombre predeterminado y un conjunto de sesiones que 
 * están inicializadas con valores por defecto.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     Workshop workshop = new Workshop();
 *     System.out.println(workshop.getName()); // Imprime "DefaultName"
 *     System.out.println(workshop.getMySessions()); // Imprime las sesiones predeterminadas
 * </pre>
 * </p>
 * 
 * @version 1.0
 */
public class Workshop extends ConferencePrototype {

    /**
     * Constructor por defecto que inicializa un taller con un nombre predeterminado y 
     * una lista de sesiones por defecto.
     * <p>
     * Las sesiones predeterminadas son:
     * <ul>
     *   <li>Sesión "A" con descripción "A description"</li>
     *   <li>Sesión "B" con descripción "B description"</li>
     * </ul>
     * </p>
     */
    public Workshop() {
        name = "DefaultName";
        mySessions = new ArrayList<>();
        mySessions.add(new Session("A", "A description"));
        mySessions.add(new Session("B", "B description"));
        myParticipants= new ArrayList<>();
        myParticipants.add(new Participant("Participant A", "Email A"));
         myParticipants.add(new Participant("Participant B", "Email B "));
    }
}

