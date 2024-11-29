/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.builder;

/**
 *
 * @author ismos
 */
public class ComiteEvaluation {
    private EvaluationBuilder evaluationBuilder;
    public void setEvaluationBuilder(EvaluationBuilder builder) {
        this.evaluationBuilder = builder;
    }

    public Evaluation getEvaluation() {
        return evaluationBuilder.getEvaluation();
    }

    public void construirEvaluacion() {
        evaluationBuilder.createNewEvaluation();
        evaluationBuilder.buildExpertiseLevel();
        evaluationBuilder.buildAspectScores();
        evaluationBuilder.buildVerdict();
        evaluationBuilder.buildAuthorComments();
        evaluationBuilder.buildCommitteeComments();
    }
}
