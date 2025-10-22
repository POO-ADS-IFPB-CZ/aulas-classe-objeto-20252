import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){

        /*
        Folha de pagamento
        Criar superclasse nela colocar método
            calcularPagamento()
            Assalariado - CPF, nome, salario
            Comissionado - CPF, nome, totalVendas,
                porcentagemComissao
         */



        Veiculo moto = new Moto("ABC-3214", "João",
                LocalDateTime.now());
        Veiculo carro = new Carro("XYZ-6593", "Maria",
                LocalDateTime.now(), 7);

        System.out.println(moto.precoEstacionamento());
        System.out.println(carro.precoEstacionamento());

    }

}
