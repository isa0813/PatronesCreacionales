/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.abstractFactory;

import domain.Prototype.ConferencePrototype;
import domain.Prototype.Participant;
import domain.Prototype.Session;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ismos
 */
public class SymposiumFactory implements ConferenceTypeFactory {
    @Override
    public ConferencePrototype createConference() {
        ConferencePrototype symposium = new ConferencePrototype();
        symposium.setName("Academic Symposium");
        
        // Create specific symposium sessions
        List<Session> sessions = new ArrayList<>();
        sessions.add(new Session("Keynote Address", "Opening keynote by distinguished speaker"));
        sessions.add(new Session("Research Panel", "Scholarly research presentation panel"));
        symposium.setMySessions(sessions);
        
        return symposium;
    }

    @Override
    public Session createSession() {
        return new Session("Symposium Presentation", "Formal academic presentation session");
    }

    @Override
    public Participant createParticipant() {
        return new Participant("Symposium Speaker", "speaker@academic.edu");
    }
}
