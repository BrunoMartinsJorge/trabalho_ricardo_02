package questao_03;

public class Idades {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static String calcularMedia(Idades id1, Idades id2) {
        float media = (float) (id1.getIdade() + id2.getIdade()) / 2;
        return "A idade média de " + id1.nome + " e " + id2.nome + " é de " + Math.round(media * 10) / 10f + " anos.";
    }

    public Idades() {

    }

    public Idades(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
