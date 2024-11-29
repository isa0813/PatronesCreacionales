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

// Builder Concreto: Evaluación Detallada
public class DetailedEvaluationBuilder extends EvaluationBuilder {
   @Override
    public void buildExpertiseLevel() {
        Evaluation.setEvaluatorExpertiseLevel("Experto en el área");
    }

    @Override
    public void buildAspectScores() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Metodología", 9);
        scores.put("Innovación", 8);
        scores.put("Calidad Técnica", 7);
        Evaluation.setAspectScores(scores);
    }

    @Override
    public void buildVerdict() {
        Evaluation.setVerdict("Aceptación Fuerte");
    }

    @Override
    public void buildAuthorComments() {
        Evaluation.setAuthorComments("Excelente trabajo con algunas sugerencias de mejora");
    }

    @Override
    public void buildCommitteeComments() {
        Evaluation.setCommitteeComments("Investigación de alta calidad que cumple con los estándares");
    }
}