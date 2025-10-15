package model;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String turma;
    private char sexo;

    //Construtor com parâmetros
    public Aluno(long matricula, String nome, LocalDate dataNascimento,
                 String turma, char sexo) {
        super(matricula, nome, dataNascimento);
        this.turma = turma;
        this.sexo = sexo;
    }

    public String getTurma(){
        return turma;
    }

    public void setTurma(String turma){
        this.turma = turma;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

}