/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.builder;

import domain.builder.Evaluation;
import java.util.Map;

/**
 *
 * @author ismos
 */
abstract class EvaluationBuilder {
    protected Evaluation Evaluation;

    public Evaluation getEvaluation() {
        return Evaluation;
    }

    public void createNewEvaluation() {
        Evaluation = new Evaluation();
    }

    public abstract void buildExpertiseLevel();
    public abstract void buildAspectScores();
    public abstract void buildVerdict();
    public abstract void buildAuthorComments();
    public abstract void buildCommitteeComments();
}

