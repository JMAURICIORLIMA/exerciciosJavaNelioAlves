package exerciciopoo01.resolucao_sem_oo;

import java.util.Scanner;

public class AreaTriangulo {

    public double triangulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a área do triângulo");
        System.out.print("A: ");
        double a = input.nextDouble();

        System.out.print("B: ");
        double b = input.nextDouble();

        System.out.print("C: ");
        double c = input.nextDouble();

        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
