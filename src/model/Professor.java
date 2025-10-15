package model;

import java.time.LocalDate;

public class Professor extends Pessoa{
    private LocalDate dataAdmissao;
    private String disciplina;

    public Professor(long matricula, String nome,
                     LocalDate dataNascimento,
                     LocalDate dataAdmissao, String disciplina){
        //Obrigatório chamar o construtor da superclasse
        super(matricula, nome, dataNascimento);
        this.dataAdmissao = dataAdmissao;
        this.disciplina = disciplina;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
