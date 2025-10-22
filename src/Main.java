import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Circulo circulo = new Circulo(3);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

    }

}
