package gymsystem;

import java.util.Date;
import model.Member;
import model.PhysicalAssessment;
import model.Trainer;

public class GymSystem {

    public static void main(String[] args) {

        Member aluno1 = new Member("João Silva", 12345);
        Member aluno2 = new Member("Maria Santos", 67890);

        Trainer professor1 = new Trainer("Carlos Sousa", new Date(), 50.0);
        Trainer professor2 = new Trainer("Ana Paula", new Date(), 55.0);

        PhysicalAssessment avaliacao1 = new PhysicalAssessment(professor1);
        avaliacao1.setWeight(75.0);
        avaliacao1.setHeight(1.80);
        aluno1.addPhysicalAssessment(avaliacao1);

        PhysicalAssessment avaliacao2 = new PhysicalAssessment(professor2);
        avaliacao2.setWeight(76.0);
        avaliacao2.setHeight(1.81);
        aluno1.addPhysicalAssessment(avaliacao2);

        PhysicalAssessment avaliacao3 = new PhysicalAssessment(professor1);
        avaliacao2.setWeight(80.0);
        avaliacao2.setHeight(1.90);
        aluno2.addPhysicalAssessment(avaliacao2);
        
        aluno1.mostraInfo();
        System.out.println("\n\n\n");
        aluno2.mostraInfo();
        
        professor1.turnMonth((Object)40);
        professor2.turnMonth((Object) 40);
        
    }
}
