package questao_06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);
        double area = circulo.calcularArea();

        System.out.printf("Área = %.3f\n", area);

        scanner.close();
    }
}
