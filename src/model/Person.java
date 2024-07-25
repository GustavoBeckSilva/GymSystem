
package model;

import java.util.ArrayList;
import java.util.Date;

public class Person {

// variáveis
    String name;
    String CPF;
    Date dateOfBirth;
    
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
    
        return "test";
    }

    public String showInformation(){
        
        String informationText = "";
        
        informationText += "Nome: " + this.name + "\nData de nascimento: " + this.dateOfBirth + "\nCPF: " + this.CPF;
    
        return informationText;
    
    }
    
}
