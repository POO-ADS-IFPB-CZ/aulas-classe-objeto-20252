package model;

import java.time.LocalDate;

public class Aluno {
    private long matricula;
    private String nome;
    private LocalDate dataNascimento;
    private String turma;
    private char sexo;

    //Construtor sem parâmetros (default)
    public Aluno(){}

    //Inicializa matrícula e o resto atribui 0 ou null
    public Aluno(long matricula){
        this.matricula = matricula;
    }

    //Construtor com parâmetros
    public Aluno(long matricula, String nome, LocalDate dataNascimento,
                 String turma, char sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.sexo = sexo;
    }

    //Método get - retorna o atributo
    public String getNome(){
        return nome;
    }
    //Método set - altera o atributo
    public void setNome(String nome){
        this.nome = nome;
    }

}