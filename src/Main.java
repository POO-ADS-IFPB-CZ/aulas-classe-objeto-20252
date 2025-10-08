import model.Aluno;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Aluno aluno = new Aluno(202012010001l,
                "João", LocalDate.now(), "ADS", 'M');
        Aluno aluno2 = new Aluno(202012010001l,
                "João", LocalDate.now(), "ADS", 'M');
        Aluno aluno3 = new Aluno(202012010001l,
                "João", LocalDate.now(), "ADS", 'M');

        System.out.println(Aluno.getContador());

    }

}
