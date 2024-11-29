package domain.Prototype;

import domain.Prototype.Participant;
import domain.Prototype.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase {@code ConferencePrototype} representa un prototipo de conferencia que puede clonarse superficial o profundamente.
 * Contiene información sobre el nombre de la conferencia y las sesiones asociadas.
 * Esta clase implementa el patrón Prototype para la creación de copias de instancias de conferencias.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     ConferencePrototype conference = new ConferencePrototype();
 *     conference.setName("Conference 2024");
 *     conference.setMySessions(sessions);
 *     ConferencePrototype shallowCopy = conference.makeClone();
 *     ConferencePrototype deepCopy = conference.makeDeepClone();
 * </pre>
 * </p>
 * 
 * @version 1.0
 */
public class ConferencePrototype {
    /**
     * Nombre de la conferencia.
     */
    protected String name;

    /**
     * Lista de sesiones que pertenecen a esta conferencia.
     */
    protected List<Session> mySessions;
     
      /**
     * Lista de participantes que pertenecen a esta conferencia.
     */
     protected List<Participant> myParticipants;
     
    /**
     * Devuelve el nombre de la conferencia.
     * 
     * @return el nombre de la conferencia
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la conferencia.
     * 
     * @param name el nombre de la conferencia
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la lista de sesiones de la conferencia.
     * 
     * @return la lista de sesiones asociadas a la conferencia
     */
    public List<Session> getMySessions() {
        return mySessions;
    }

    /**
     * Establece la lista de sesiones de la conferencia.
     * 
     * @param mySessions la lista de sesiones a asociar con la conferencia
     */
    public void setMySessions(List<Session> mySessions) {
        this.mySessions = mySessions;
    }
     
    /**
     * Devuelve la lista de participantes de la conferencia.
     * 
     * @return la lista de participantes asociadas a la conferencia
     */
    public List<Participant> getMyParticipants() {
        return myParticipants;
    }

    /**
     * Establece la lista de participantes de la conferencia.
     * 
     * @param myParticipants la lista de participantes a asociar con la conferencia
     */
    public void setMyParticipants(List<Participant> myParticipants) {
        this.myParticipants = myParticipants;
    }
    /**
     * Crea una copia superficial de la instancia actual de {@code ConferencePrototype}.
     * La copia superficial mantiene referencias a las mismas instancias de objetos en la lista de sesiones.
     * 
     * @return un nuevo {@code ConferencePrototype} con los mismos valores en sus atributos
     */
    public ConferencePrototype makeClone() {
        ConferencePrototype clon = null;
        try {
            clon = (ConferencePrototype) this.getClass().newInstance();
            clon.setName(this.name);
            clon.setMySessions(this.getMySessions());
            clon.setMyParticipants(this.getMyParticipants());
        } catch (InstantiationException ex) {
            Logger.getLogger(ConferencePrototype.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConferencePrototype.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clon;
    }

   /**
 * Crea una copia profunda de la instancia actual de {@code ConferencePrototype},
 * permitiendo seleccionar qué elementos clonar profundamente.
 *
 * @param cloneSessions indica si se deben clonar las sesiones profundamente
 * @param cloneParticipants indica si se deben clonar los participantes profundamente
 * @return un nuevo {@code ConferencePrototype} con las opciones de clonación seleccionadas
 */
public ConferencePrototype makeDeepClone(boolean cloneSessions, boolean cloneParticipants) {
    ConferencePrototype clon = null;
    try {
        clon = (ConferencePrototype) this.getClass().newInstance();
        clon.setName(this.name);

        // Clonar sesiones si se seleccionó
        if (cloneSessions) {
            List<Session> clonedSessions = new ArrayList<>();
            for (Session session : this.mySessions) {
                clonedSessions.add(session.makeClone());
            }
            clon.setMySessions(clonedSessions);
        } else {
            clon.setMySessions(this.mySessions); // Copiar la referencia
        }

        // Clonar participantes si se seleccionó
        if (cloneParticipants) {
            List<Participant> clonedParticipants = new ArrayList<>();
            for (Participant participant : this.myParticipants) {
                clonedParticipants.add(participant.makeClone());
            }
            clon.setMyParticipants(clonedParticipants);
        } else {
            clon.setMyParticipants(this.myParticipants); // Copiar la referencia
        }

    } catch (InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(ConferencePrototype.class.getName()).log(Level.SEVERE, null, ex);
    }
    return clon;
}

      /**
     * Devuelve una representación en cadena de la instancia de {@code ConferencePrototype},
     * incluyendo el nombre ,la lista de sesiones, la lista de conferencias.
     * 
     * @return una representación en cadena de la conferencia
     */
    @Override
    public String toString() {
        return "ConferencePrototype{" + "name=" + name + ", mySessions=" + mySessions + ", myParticipants=" + myParticipants + '}';
    }

  
    
}
