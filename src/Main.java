import model.*;

public class Main {

    public static void main(String[] args){

        Empregado empregado = new Assalariado("111.111.111-01",
            "João", 2000);
        Empregado empregado1 = new Comissionado("222.222.222-02",
                "Maria", 10000, 5);

        System.out.println(empregado.calcularPagamento());
        System.out.println(empregado1.calcularPagamento());

    }

}
