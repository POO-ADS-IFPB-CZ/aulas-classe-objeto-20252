package model;

import java.time.LocalDate;

public class Tecnico extends Funcionario{

    private String setor;

    public Tecnico(long matricula, String nome, LocalDate dataNascimento,
                   float salario, LocalDate dataAdmissao, String setor){
        super(matricula, nome, dataNascimento, salario, dataAdmissao);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //Técicos de laboratório recebem 10% de periculosidade
    @Override
    public float getSalario(){
        if(setor.contains("Laboratório"))
            return salario*1.1f;
        return salario;
    }

}
