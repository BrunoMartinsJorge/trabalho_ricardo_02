package questao_09;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite os valores de A, B e C: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        Areas areas = new Areas(a, b, c);

        System.out.printf("Área do quadrado: %.4f\n", areas.areaQuadrado());
        System.out.printf("Área do triângulo retângulo: %.4f\n", areas.areaTriangulo());
        System.out.printf("Área do trapézio: %.4f\n", areas.areaTrapezio());

        entrada.close();
    }
}