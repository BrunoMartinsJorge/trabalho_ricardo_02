package questao_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Terreno terreno = new Terreno();
        System.out.print("Digite a largura do terreno: ");
        float largura = entrada.nextFloat();
        System.out.print("Digite a comprimento do terreno: ");
        float comprimento = entrada.nextFloat();
        System.out.print("Digite o valor do metro quadrado do terreno: ");
        float valorPorTerreno = entrada.nextFloat();
        terreno.setLargura(largura);
        terreno.setComprimento(comprimento);
        terreno.setValorPorMetroQuadrado(valorPorTerreno);
        System.out.printf("\nA área do terreno é %f metros quadrados.", terreno.calcularAreaTerreno(terreno));
        System.out.printf("\nO preço do terreno é de %f.", terreno.calcularPrecoTerreno(terreno));
    }
}
