package model;

//Usei esse nome porque já tinha funcionario
public abstract class Empregado {

    private String cpf;
    private String nome;

    public Empregado(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float calcularPagamento();

}
