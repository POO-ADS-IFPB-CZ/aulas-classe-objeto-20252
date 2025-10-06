import model.Aluno;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Aluno joao = new Aluno(202012010001l, "João",
                LocalDate.of(2020,2,25),
                "P3 ADS", 'M');
        joao.setNome("João da Silva");
        System.out.println(joao.getNome());

    }

}
