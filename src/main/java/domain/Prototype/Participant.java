package domain.Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representa un participante en una conferencia con identificación única.
 */
public class Participant {
      // Atributos privados del participante
    private static final AtomicInteger counter = new AtomicInteger(1); // Contador estático
    private int id;          // Identificador único del participante
    private String name;        // Nombre del participante
    private String email;       // Correo electrónico del participante
     
     /**
     * Constructor por defecto.
     * Genera un ID único aleatorio para el participante.
     */
    public Participant() {
        this.id = counter.getAndIncrement();
    }
 /**
     * Constructor parametrizado.
     * Crea un participante con nombre y correo electrónico.
     * Genera un ID único aleatorio.
     *
     * @param name Nombre del participante
     * @param email Correo electrónico del participante
     */
    public Participant(String name, String email) {
        this.id =counter.getAndIncrement();
        this.name = name;
        this.email = email;
    }
 /**
     * Crea un clon del participante actual.
     * Utiliza reflection para instanciar un nuevo objeto.
     * Genera un nuevo ID único para evitar duplicaciones.
     *
     * @return Nuevo objeto Participant clonado
     */
    public Participant makeClone() {
        Participant clon = null;
        try {
            clon = (Participant) this.getClass().newInstance();
            clon.id = counter.getAndIncrement(); // Nuevo ID único
            clon.setName(this.getName());
            clon.setEmail(this.getEmail());
            
        } catch (InstantiationException ex) {
            Logger.getLogger(Participant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Participant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clon;
    }
// Métodos getter y setter estándar para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 /**
     * Representación en cadena del participante.
     * Muestra ID, nombre y correo electrónico.
     *
     * @return Cadena con los datos del participante
     */
    @Override
    public String toString() {
        return "Participant{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
    
}    