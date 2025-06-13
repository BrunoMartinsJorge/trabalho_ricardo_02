package questao_02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        Float base = entrada.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        Float altura = entrada.nextFloat();
        retangulo.setBase(base);
        retangulo.setAltura(altura);
        System.out.printf("\nA área do retangulo é de %f", retangulo.calcularArea(retangulo));
        System.out.printf("\nA área do retangulo é de %f", retangulo.calcularArea(retangulo));
        System.out.printf("\nA área do retangulo é de %f", retangulo.calcularArea(retangulo));
    }
}
