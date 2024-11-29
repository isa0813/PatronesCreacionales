/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.abstractFactory;

import domain.Prototype.ConferencePrototype;
import domain.Prototype.Participant;
import domain.Prototype.Session;
import domain.Prototype.Workshop;

/**
 *
 * @author ismos
 */
public class WorkshopFactory implements ConferenceTypeFactory {
    @Override
    public ConferencePrototype createConference() {
        ConferencePrototype workshop = new Workshop();
        workshop.setName("Interactive Workshop");
        return workshop;
    }

    @Override
    public Session createSession() {
        return new Session("Workshop Session", "Interactive workshop session");
    }

    @Override
    public Participant createParticipant() {
        return new Participant("Workshop Participant", "workshop.participant@example.com");
    }
}
