import model.Aluno;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double ad = 0.1;
        double bd = 0.2;
        double somad = ad + bd;
        System.out.println(somad == 0.3);
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal soma = a.add(b);
        System.out.println(new BigDecimal("0.3").equals(soma));

    }

}
