package questao_05;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Troco troco = new Troco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a qtd de produtos comprados: ");
        int qtd = entrada.nextInt();
        System.out.println("Digite o valore por unidade: ");
        float vlrUnitario = entrada.nextFloat();
        System.out.println("Digite o valor pago: ");
        float vlrPago = entrada.nextFloat();
        troco.setPrecoUnitario(vlrUnitario);
        troco.setQtdProdutos(qtd);
        troco.setValorPago(vlrPago);
        System.out.println("TROCO = "+Troco.calcularTroco(troco));
        entrada.close();
    }
}
