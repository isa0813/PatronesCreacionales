/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.abstractFactory;

import domain.Prototype.ConferencePrototype;
import domain.Prototype.Participant;
import domain.Prototype.Session;

/**
 *
 * @author ismos
 */
public interface ConferenceTypeFactory {
    /**
     * Creates a conference product
     * @return Abstract conference prototype
     */
    ConferencePrototype createConference();

    /**
     * Creates a session product
     * @return Abstract session
     */
    Session createSession();

    /**
     * Creates a participant product
     * @return Abstract participant
     */
    Participant createParticipant();
}

