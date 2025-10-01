import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        //Instanciação de objetos
        Aluno joao = new Aluno();
        //Maria é uma instância de aluno
        Aluno maria = new Aluno();

        System.out.println(joao.matricula);
        System.out.println(joao.nome);
        System.out.println(joao.dataNascimento);
        System.out.println(joao.turma);
        System.out.println(joao.sexo);

        joao.nome = "João";
        joao.matricula = 202012010001l;
        joao.dataNascimento = LocalDate
                .of(2000,3,25);
        joao.turma = "P3 ADS";
        joao.sexo = 'M';

        System.out.println(joao.dataNascimento);


    }

}
