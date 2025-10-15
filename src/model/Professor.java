package model;

import java.time.LocalDate;

public class Professor extends Funcionario{

    private String disciplina;

    public Professor(long matricula, String nome,
                     LocalDate dataNascimento,
                     float salario, LocalDate dataAdmissao,
                     String disciplina){
        //Obrigatório chamar o construtor da superclasse
        super(matricula, nome, dataNascimento, salario, dataAdmissao);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}