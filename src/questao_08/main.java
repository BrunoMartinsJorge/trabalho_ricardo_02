package questao_08;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Distância percorrida (Km): ");
        double km = entrada.nextDouble();

        System.out.print("Combustível gasto (L): ");
        double litros = entrada.nextDouble();

        ConsumoCarro carro = new ConsumoCarro(km, litros);

        System.out.printf("Consumo médio = %.3f km/l\n", carro.calcularConsumo());

        entrada.close();
    }
}