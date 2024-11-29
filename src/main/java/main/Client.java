package main;

import domain.Prototype.Workshop;
import domain.Prototype.ConferencePrototype;
import domain.Prototype.Participant;
import domain.Prototype.Session;
import domain.abstractFactory.ConferenceTypeFactory;
import domain.abstractFactory.PosterFactory;
import domain.abstractFactory.SymposiumFactory;
import domain.abstractFactory.WorkshopFactory;
import domain.builder.Evaluation;
import domain.builder.BasicEvaluation;
import domain.builder.ComiteEvaluation;
import domain.builder.DetailedEvaluationBuilder;
/**
 * La clase {@code Client} demuestra el uso del patrón de diseño Prototype.
 * <p>
 * En este ejemplo, se crea una instancia de {@code Workshop} (un subtipo de {@code ConferencePrototype}),
 * se realiza una clonación profunda para crear una copia independiente del objeto original y luego 
 * se personaliza el nombre y las sesiones de la copia.
 * </p>
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     ConferencePrototype defaultConference = new Workshop();
 *     ConferencePrototype quality = defaultConference.makeDeepClone();
 *     quality.setName("Third Software Quality Workshop");
 *     quality.getMySessions().add(new Session("C", "C description"));
 * </pre>
 * </p>
 *
 * @version 1.0
 */
public class Client {
    /**
     * Punto de entrada de la aplicación, que muestra cómo utilizar el método de clonación 
     * profunda ({@code makeDeepClone}) para crear una copia independiente de una conferencia.
     *
     * @param args argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        ExamplePrototype();
        ExampleBuilder();
        ExampleAbstractFactory();
    }
     public static void ExamplePrototype(){
        // Se crea un objeto Workshop predeterminado
        ConferencePrototype defaultConference = new Workshop();
         
        // Crear una copia superficial
        ConferencePrototype shallowCopy = defaultConference.makeClone();

        // Crear una copia profunda con sesiones
        ConferencePrototype deepCopySessionsOnly = defaultConference.makeDeepClone(true,false);
        
        // Crear una copia profunda
        ConferencePrototype deepCopyAll = defaultConference.makeDeepClone(true,true);
        
        
         // Modificar las listas en cada clon para observar los efectos
        shallowCopy.getMySessions().get(0).setName("Modified Session A (Shallow Copy)");

        deepCopySessionsOnly.getMySessions().get(0).setName("Deep Modified Session A (Deep Copy)");
        deepCopyAll.getMyParticipants().add(new Participant("Bob", "bob@example.com"));
        deepCopyAll.setName("Third Software Quality Workshop");
        deepCopyAll.setName("Third Software Quality Workshop");
        deepCopyAll.getMySessions().add(new Session("C", "C description"));
        deepCopyAll.getMyParticipants().add(new Participant ("Isabela","isamosquera@gmail.com"));

        // Comparar los resultados
        System.out.println("Original: " + defaultConference.toString());
        System.out.println("Shallow Copy: " + shallowCopy.toString());
        System.out.println("Deep Copy (Sessions Only): " + deepCopySessionsOnly.toString());
        System.out.println("Deep Copy (All): " + deepCopyAll.toString());
    }
     public static void ExampleBuilder(){
           // Crear el director (Comité de Evaluación)
        ComiteEvaluation comite = new ComiteEvaluation();
        
        // Crear un builder detallado
        DetailedEvaluationBuilder detailedBuilder = new DetailedEvaluationBuilder();
        
        // Establecer el builder detallado
        comite.setEvaluationBuilder(detailedBuilder);
        
        // Construir la evaluación
        comite.construirEvaluacion();
        
        // Obtener la evaluación
        Evaluation evaluacionDetallada = comite.getEvaluation();
        
        // Imprimir detalles
        System.out.println("Evaluación Detallada:"+ evaluacionDetallada);

        // Ejemplo con evaluación básica
        BasicEvaluation basicBuilder = new BasicEvaluation();
        comite.setEvaluationBuilder(basicBuilder);
        comite.construirEvaluacion();
        
        Evaluation evaluacionBasica = comite.getEvaluation();
        System.out.println("\nEvaluación Básica:"+ evaluacionBasica);
     }
     public static void ExampleAbstractFactory(){
     
        // Create different conference types using factories
        ConferenceTypeFactory workshopFactory = new WorkshopFactory();
        ConferenceTypeFactory symposiumFactory = new SymposiumFactory();
        ConferenceTypeFactory posterFactory = new PosterFactory();

        // Create conferences
        ConferencePrototype workshop = workshopFactory.createConference();
        ConferencePrototype symposium = symposiumFactory.createConference();
        ConferencePrototype posterConference = posterFactory.createConference();

        // Create individual elements
        Session workshopSession = workshopFactory.createSession();
        Participant symposiumSpeaker = symposiumFactory.createParticipant();
        Participant posterPresenter = posterFactory.createParticipant();

        // Demonstrate the different configurations
        System.out.println("Workshop Conference: " + workshop);
        System.out.println("Symposium Conference: " + symposium);
        System.out.println("Poster Conference: " + posterConference);
        
        System.out.println("\nIndividual Elements:");
        System.out.println("Workshop Session: " + workshopSession);
        System.out.println("Symposium Speaker: " + symposiumSpeaker);
        System.out.println("Poster Presenter: " + posterPresenter);
     }
}

