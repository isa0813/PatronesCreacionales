/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.builder;

import domain.builder.EvaluationBuilder;
import domain.builder.EvaluationBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ismos
 */
public class BasicEvaluation extends EvaluationBuilder{
    public void buildExpertiseLevel() {
        Evaluation.setEvaluatorExpertiseLevel("Nivel Intermedio");
    }


    public void buildAspectScores() {
        // Sin calificaciones específicas
        Evaluation.setAspectScores(null);
    }


    public void buildVerdict() {
        Evaluation.setVerdict("Aceptación Débil");
    }


    public void buildAuthorComments() {
        Evaluation.setAuthorComments("Requiere revisiones significativas");
    }


    public void buildCommitteeComments() {
        Evaluation.setCommitteeComments("Necesita mejoras sustanciales");
    }
    
}
