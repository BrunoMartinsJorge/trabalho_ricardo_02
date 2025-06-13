package questao_10;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int totalSegundos = entrada.nextInt();

        ConverterTempo tempo = new ConverterTempo(totalSegundos);
        System.out.println("Tempo formatado: " + tempo.converter());

        entrada.close();
    }
}
