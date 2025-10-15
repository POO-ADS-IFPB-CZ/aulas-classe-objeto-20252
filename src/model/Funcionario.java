package model;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{

    //Protected = Engloba o pacote + as subclasses
    protected float salario;
    private LocalDate dataAdmissao;

    public Funcionario(long matricula, String nome,
           LocalDate dataNascimento, float salario,
           LocalDate dataAdmissao) {
        super(matricula, nome, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    //Funciona como um contrato
    public abstract float getSalario();

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
