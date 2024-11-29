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
public class PosterFactory implements ConferenceTypeFactory {
    @Override
    public ConferencePrototype createConference() {
        ConferencePrototype posterConference = new ConferencePrototype();
        posterConference.setName("Research Poster Conference");
        
        // Create specific poster sessions
        List<Session> sessions = new ArrayList<>();
        sessions.add(new Session("Poster Setup", "Poster board arrangement and preparation"));
        sessions.add(new Session("Poster Presentation", "Research poster presentation and discussion"));
        posterConference.setMySessions(sessions);
        
        return posterConference;
    }

    @Override
    public Session createSession() {
        return new Session("Poster Session", "Research poster display and discussion");
    }

    @Override
    public Participant createParticipant() {
        return new Participant("Poster Presenter", "poster.researcher@example.com");
    }
}

