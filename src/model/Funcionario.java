package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private float salario;
    private LocalDate dataAdmissao;

    public Funcionario(long matricula, String nome,
           LocalDate dataNascimento, float salario,
           LocalDate dataAdmissao) {
        super(matricula, nome, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
