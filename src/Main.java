import model.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Professor professor = new Professor(123456l,
                "João", LocalDate.of(2000,2,3),
                2000, LocalDate.of(2020,3,1),
                "POO");
        Professor professor2 = new Professor(123456l,
                "João", LocalDate.of(2000,2,3),
                2000, LocalDate.of(2020,3,1),
                "POO II");

        //Como sobrescrevemos em pessoa, verifica matrícula,nome e nascimento
        System.out.println(professor.equals(professor2));


    }

}
