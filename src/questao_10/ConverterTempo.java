package questao_10;

public class ConverterTempo {
    private int segundosTotais;

    public ConverterTempo(int segundosTotais) {
        this.segundosTotais = segundosTotais;
    }

    public ConverterTempo() {
    }

    public int getSegundosTotais() {
        return segundosTotais;
    }

    public void setSegundosTotais(int segundosTotais) {
        this.segundosTotais = segundosTotais;
    }

    public String converter() {
        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
