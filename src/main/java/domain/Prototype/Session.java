package domain.Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase {@code Session} representa una sesión dentro de una conferencia, 
 * que contiene un nombre y una descripción de la sesión.
 * Proporciona métodos para clonar la sesión y gestionar sus atributos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     Session session = new Session("Keynote", "Sesión principal de apertura");
 *     Session clonedSession = session.makeClone();
 * </pre>
 * </p>
 * 
 * @version 1.0
 */
public class Session {
    /**
     * Nombre de la sesión.
     */
    private String name;

    /**
     * Descripción de la sesión.
     */
    private String description;

    /**
     * Constructor por defecto que inicializa los atributos de la sesión a valores vacíos.
     */
    public Session() {
        this.name = "";
        this.description = "";
    }

    /**
     * Constructor que inicializa la sesión con un nombre y una descripción específicos.
     * 
     * @param name el nombre de la sesión
     * @param description la descripción de la sesión
     */
    public Session(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Crea una copia superficial de la instancia actual de {@code Session}.
     * La copia mantiene el mismo nombre y descripción que la sesión original.
     * 
     * @return un nuevo {@code Session} con los mismos valores de nombre y descripción
     */
    Session makeClone() {
        Session clon = null;
        try {
            clon = (Session) this.getClass().newInstance();
            clon.setName(this.getName());
            clon.setDescription(this.getDescription());
        } catch (InstantiationException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clon;
    }

    /**
     * Devuelve el nombre de la sesión.
     * 
     * @return el nombre de la sesión
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la sesión.
     * 
     * @param name el nombre de la sesión
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la descripción de la sesión.
     * 
     * @return la descripción de la sesión
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la sesión.
     * 
     * @param description la descripción de la sesión
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Devuelve una representación en cadena de la instancia de {@code Session},
     * incluyendo el nombre y la descripción.
     * 
     * @return una representación en cadena de la sesión
     */
    @Override
    public String toString() {
        return "Session{" + "name=" + name + ", description=" + description + '}';
    }
}

