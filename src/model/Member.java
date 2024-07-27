
package model;

import java.util.ArrayList;
import java.util.Date;

public class Member extends Person {
    
    private int registration;
    private ArrayList <PhysicalAssessment> physicalAssessmentList;
    
// construtor
    public Member(String name, int registration){
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
    public String showReviewHistory(){
        
        String informationText = "";
        
        for (int i = 0; i < physicalAssessmentList.size(); i++)
            informationText += "\n- " + physicalAssessmentList.get(i);
        
        return informationText;
        
    }
    
    public void addPhysicalAssessment(PhysicalAssessment physicalAssessment){
        physicalAssessmentList.add(physicalAssessment);
        physicalAssessment.setMember(this); // CRIAR MÉTODO
    }
    
    public void removePhysicalAssessment(PhysicalAssessment physicalAssessment){
        physicalAssessmentList.remove(physicalAssessment);
        physicalAssessment.setMember(null); // CRIAR MÉTODO
    }
    
    @Override
    public String showInformation(){
        String informationText = "";

        informationText += "\nMatricula: " + registration;
        informationText +=  "\n" + super.showInformation();
        informationText += "\nHistórico de Avaliações: " + showReviewHistory();
        
        return informationText;
        
    }

    public void returnBirthDate(){
        super.dateOfBirth = new Date();
    }
 
}
