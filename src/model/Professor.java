package model;

import java.time.LocalDate;

public class Professor {
    private long matricula;
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private String disciplina;

    public Professor(long matricula, String nome,
                     LocalDate dataNascimento,
                     LocalDate dataAdmissao, String disciplina){
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.disciplina = disciplina;
    }

    public long getMatricula(){
        return matricula;
    }

    public void setMatricula(long matricula){
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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
