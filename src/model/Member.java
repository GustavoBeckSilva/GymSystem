package model;

import java.util.ArrayList;

public class Member extends Person {

    // variáveis
    private int registration;
    private ArrayList<PhysicalAssessment> physicalAssessmentList;

    // construtor
    public Member(String name, int registration) {
        super(name);
        this.registration = registration;
        physicalAssessmentList = new ArrayList<>();
    }

    // getters e setters
    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public ArrayList<PhysicalAssessment> getPhysicalAssessmentList() {
        return physicalAssessmentList;
    }

    public void setPhysicalAssessmentList(ArrayList<PhysicalAssessment> physicalAssessmentList) {
        this.physicalAssessmentList = physicalAssessmentList;
    }

    // métodos
    public String showReviewHistory() {
        String informationText = "";

        for (PhysicalAssessment assessment : physicalAssessmentList) {
            informationText += "\n- " + assessment.showAssessment() + "\nAvaliador: " + assessment.getEvaluatorTrainer().getName();
        }

        return informationText;
    }

    public void addPhysicalAssessment(PhysicalAssessment physicalAssessment) {
        physicalAssessmentList.add(physicalAssessment);
        physicalAssessment.setAssessedMember(this);
    }

    @Override
    public String showInformation() {
        String informationText = "";

        informationText += "\nMatricula: " + registration;
        informationText += "\n" + super.showInformation();
        informationText += "\nHistórico de Avaliações: " + showReviewHistory();

        return informationText;
    }

    public void mostraInfo() {
        System.out.println(showInformation());
    }

    @Override
    public void turnMonth(Object pa) {
        addPhysicalAssessment((PhysicalAssessment)pa);
    }

    
}
