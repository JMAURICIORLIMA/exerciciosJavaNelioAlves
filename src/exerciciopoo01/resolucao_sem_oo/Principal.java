package exerciciopoo01.resolucao_sem_oo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AreaTriangulo trianguloX = new AreaTriangulo();
        System.out.printf("Área triangulo X: %.4f%n", trianguloX.triangulo());

        AreaTriangulo trianguloY = new AreaTriangulo();
        System.out.printf("Área triangulo Y: %.4f%n", trianguloY.triangulo());

    }
}
