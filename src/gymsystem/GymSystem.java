
package gymsystem;

import java.util.Date;
import model.Person;

public class GymSystem {

    public static void main(String[] args) {
        
        Date data = new Date();
        Person teste = new Person();
        
        teste.setCPF("000.000.000-00");
        teste.setDateOfBirth(data);
        teste.setName("Fulano Teste da Silva");
        
        System.out.println(teste.showInformation());
        
    }
    
}
