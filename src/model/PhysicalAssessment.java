package model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhysicalAssessment {

    // variáveis
    private Date date;
    private double weight;
    private double height;
    private double bodyFatPercentage;
    private Member assessedMember;
    private Trainer evaluatorTrainer;
    private SimpleDateFormat formattedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    // construtor
    public PhysicalAssessment(Member assessedMember, Trainer evaluatorTrainer) {
        this.evaluatorTrainer = evaluatorTrainer;
        this.assessedMember = assessedMember;
        this.date = new Date();
    }
    
    public PhysicalAssessment(Trainer evaluatorTrainer) {
        this.evaluatorTrainer = evaluatorTrainer;
        this.date = new Date();
    }

    // getters e setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public void setAssessedMember(Member member){
        this.assessedMember = member;
    }
    
    public Member getAssessedMember() {
        return assessedMember;
    }

    public Trainer getEvaluatorTrainer() {
        return evaluatorTrainer;
    }

    public String showAssessment() {
        DecimalFormat formatoNum = new DecimalFormat("0.0#");
        String informationText = "Data Avaliação: " + formattedDate.format(date);
        informationText += "\nAluno: " + assessedMember.getName();
        informationText += "\nAvaliador: " + evaluatorTrainer.getName();
        informationText += "\nPeso: " + ((weight != 0) ? formatoNum.format(weight) : "Sem informações");
        informationText += "\nAltura: " + ((height != 0) ? formatoNum.format(height) : "Sem informações");
        informationText += "\nPorcentagem de Gordura: " + ((bodyFatPercentage != 0) ? formatoNum.format(bodyFatPercentage) : "Sem informações");

        if (weight != 0 && height != 0) {
            informationText += "\nIMC: " + formatoNum.format(calculateBMI());
        }

        return informationText;
    }

    @Override
    public String toString() {
        return formattedDate.format(date) + " -> " + calculateBMI();
    }

    public double calculateBMI() {
        return weight / Math.pow(height, 2);
    }
}
