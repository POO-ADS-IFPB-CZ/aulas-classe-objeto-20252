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

    //Os professores de POO recebem 20% a mais
    @Override
    public float getSalario(){
        if(disciplina.equals("POO"))
            return salario*1.2f;
        return salario;
    }


        @Override
    public String toString(){
        return "Professor{matricula:"+super.getMatricula()+"," +
                "nome:"+super.getNome()+"," +
                "dataNascimento:"+super.getDataNascimento()+"," +
                "salario:"+getSalario()+"," +
                "dataAdmissao:"+super.getDataAdmissao()+"," +
                "disciplina:"+disciplina+"}";
    }

}