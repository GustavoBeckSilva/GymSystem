
package model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhysicalAssessment {
    
// variáveis
    private Date date;
    private double weigth;
    private double height;
    private double bodyFatPercentage;
    private Person member;
    private SimpleDateFormat formattedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
// construtor
    public PhysicalAssessment() {
        date = new Date();
    }
    
// getters e setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
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

    public Person getMember() {
        return member;
    }

    public void setMember(Person member) {
        this.member = member;
    }

    public SimpleDateFormat getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(SimpleDateFormat formattedDate) {
        this.formattedDate = formattedDate;
    }
    
// métodos
    public double calculateBMI() {
        return weigth / Math.pow(height, 2);
    }

    public String showAssessment() {
        
        DecimalFormat formatoNum = new DecimalFormat("0.0#");

        String informationText = "";
        
        informationText = "Data Avaliação: " + formattedDate.format(date);
        informationText += "\nAluno: "+ member;
        informationText += "\nPeso: " + ((weigth != 0) ? formatoNum.format(weigth) : "Sem informações");
        informationText += "\nAltura: " + ((height != 0) ? formatoNum.format(height) : "Sem informações");
        informationText += "\nPorcentagem de Gordura: " + ((bodyFatPercentage != 0) ? formatoNum.format(bodyFatPercentage) : "Sem informações");

        if (weigth != 0 && height != 0){
            informationText += "\nIMC: " + formatoNum.format(calculateBMI());
        }

        return informationText;
    }

    @Override
    public String toString() {
        return formattedDate.format(date) + " -> " + calculateBMI();
    }
}
