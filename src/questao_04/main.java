package questao_04;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Digite um valor: ");
        int valor2 = entrada.nextInt();
        soma.setX(valor1);
        soma.setY(valor2);
        System.out.print("SOMA = " + Soma.somar(soma));
        entrada.close();
    }
}
