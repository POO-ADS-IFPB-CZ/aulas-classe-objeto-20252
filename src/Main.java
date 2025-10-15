import model.Funcionario;
import model.Professor;
import model.Tecnico;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Funcionario professor1 = new Professor(123456l,
                "João", LocalDate.of(1996,2,3),
                2000, LocalDate.of(2000,01,01),
                "POO");
        Professor professor2 = new Professor(654321l,
                "Pedro", LocalDate.of(1995,2,6),
                2000, LocalDate.of(2000,01,01),
                "Banco de Dados");
        Funcionario tecnico = new Tecnico(369852l,
                "Maria", LocalDate.of(1996,3,25),
                2000, LocalDate.of(2000,01,01),
                "Laboratório de Química");

        System.out.println(professor1.getSalario());
        System.out.println(professor2.getSalario());
        System.out.println(tecnico.getSalario());

    }

}
