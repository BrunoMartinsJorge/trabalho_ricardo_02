package questao_07;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horas = entrada.nextInt();

        Funcionario f = new Funcionario(nome, valorHora, horas);

        double pagamento = f.calcularPagamento();
        System.out.printf("O pagamento para %s deve ser R$ %.2f\n", f.getNome(), pagamento);

        entrada.close();
    }
}