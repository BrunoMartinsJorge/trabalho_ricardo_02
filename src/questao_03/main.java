package questao_03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Idades idade1 = new Idades();
        Idades idade2 = new Idades();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome1 = entrada.next();
        idade1.setNome(nome1);
        System.out.print("Digite a idade da pessoa: ");
        int idade_01 = entrada.nextInt();
        idade1.setIdade(idade_01);
        System.out.print("Digite o nome da pessoa: ");
        String nome2 = entrada.next();
        idade2.setNome(nome2);
        System.out.print("Digite a idade da pessoa: ");
        int idade_02 = entrada.nextInt();
        idade2.setIdade(idade_02);
        System.out.println(Idades.calcularMedia(idade1, idade2));
        entrada.close();
    }
}
