import model.Aluno;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Aluno aluno = new Aluno(202122010023l);
        aluno.setNome("João");
        aluno.setDataNascimento(
                LocalDate.of(2004,2,4));
        aluno.setTurma("P3 ADS");
        aluno.setSexo('M');
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getDataNascimento());
        System.out.println(aluno.getTurma());
        System.out.println(aluno.getSexo());

    }

}
