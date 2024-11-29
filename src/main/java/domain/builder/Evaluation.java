/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.builder;

import java.util.Map;

/**
 *
 * @author ismos
 */
public class Evaluation {
    String evaluatorExpertiseLevel;
    Map<String, Integer> aspectScores;
    String verdict;
    String authorComments;
    String committeeComments;


    // Getters
    public String getEvaluatorExpertiseLevel() {
        return evaluatorExpertiseLevel;
    }

    public Map<String, Integer> getAspectScores() {
        return aspectScores;
    }

    public String getVerdict() {
        return verdict;
    }

    public String getAuthorComments() {
        return authorComments;
    }

    public String getCommitteeComments() {
        return committeeComments;
    }
    // Métodos setter
    public void setEvaluatorExpertiseLevel(String expertiseLevel) {
        this.evaluatorExpertiseLevel = expertiseLevel;
    }

    public void setAspectScores(Map<String, Integer> aspectScores) {
        this.aspectScores = aspectScores;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public void setAuthorComments(String authorComments) {
        this.authorComments = authorComments;
    }

    public void setCommitteeComments(String committeeComments) {
        this.committeeComments = committeeComments;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "evaluatorExpertiseLevel=" + evaluatorExpertiseLevel + ", aspectScores=" + aspectScores + ", verdict=" + verdict + ", authorComments=" + authorComments + ", committeeComments=" + committeeComments + '}';
    }
    
}
