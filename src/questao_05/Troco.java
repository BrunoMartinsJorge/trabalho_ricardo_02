package questao_05;

public class Troco {

    private int qtdProdutos;
    private float precoUnitario;
    private float valorPago;

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public static float calcularTroco(Troco valor){
        return valor.getValorPago() - (valor.getPrecoUnitario()* valor.getQtdProdutos());
    }
}
