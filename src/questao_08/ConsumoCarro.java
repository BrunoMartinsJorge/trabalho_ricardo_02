package questao_08;

public class ConsumoCarro {
    private double km;
    private double litros;

    public ConsumoCarro(double km, double litros) {
        this.km = km;
        this.litros = litros;
    }

    public ConsumoCarro(){

    }

    public double calcularConsumo() {
        return km / litros;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
