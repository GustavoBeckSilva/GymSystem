
package model;

import java.util.ArrayList;
import java.util.Date;

public class Person {

// variáveis
    protected String name;
    private String CPF;
    protected Date dateOfBirth;

// construtor
    public Person(String name) {
        this.name = name;
    }   
    
// getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
// métodos
    @Override
    public String toString(){
        return this.name + (CPF != null ? ": " + getCPF() : "");
    }

    public String showInformation(){
        
        String informationText = "";
        
        informationText += "Nome: " + this.name + "\nData de nascimento: " + this.dateOfBirth + "\nCPF: " + this.CPF;
    
        return informationText;
    
    }
    
}
