package questao_02;

public class Retangulo {
    private Float base;
    private Float altura;

    public Retangulo() {
    }

    public Retangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public double calcularArea(Retangulo retangulo) {
        float area = retangulo.getBase() * retangulo.getAltura();
        return Math.round(area * 400) / 400d;
    }

    public double calcularPerimetro(Retangulo retangulo) {
        float perimetro = 2 * (retangulo.getBase() + retangulo.getAltura());
        return Math.round(perimetro * 400) / 400d;
    }

    public double calcularDiagonal(Retangulo retangulo) {
        double diagonal = Math.sqrt(Math.pow(retangulo.getBase(), 2)+Math.pow(retangulo.getAltura(), 2));
        return Math.round(diagonal * 400) / 400d;

    }
}
