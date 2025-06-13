package questao_01;

public class Terreno {

    private Float largura;
    private Float comprimento;
    private Float valorPorMetroQuadrado;

    public Terreno() {
    }

    public Terreno(Float largura, Float comprimento, Float valorPorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorPorMetroQuadrado = valorPorMetroQuadrado;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Float getValorPorMetroQuadrado() {
        return valorPorMetroQuadrado;
    }

    public void setValorPorMetroQuadrado(Float valorPorMetroQuadrado) {
        this.valorPorMetroQuadrado = valorPorMetroQuadrado;
    }

    public Float calcularPrecoTerreno(Terreno terreno) {
        float preco = calcularAreaTerreno(terreno) * terreno.valorPorMetroQuadrado;
        return Math.round(preco * 100) / 100f;
    }

    public Float calcularAreaTerreno(Terreno terreno) {
        float area = terreno.largura * terreno.comprimento;
        return Math.round(area * 100) / 100f;
    }
}
