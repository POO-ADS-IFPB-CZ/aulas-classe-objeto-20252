import model.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Pessoa pessoa = new Aluno(123l,
                "João", LocalDate.now(),
                "ADS", 'M');

    }

}
