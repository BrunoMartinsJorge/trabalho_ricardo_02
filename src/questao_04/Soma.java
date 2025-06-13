package questao_04;

public class Soma {

    private int x;
    private int y;

    public static int somar(Soma valores) {
        return valores.x + valores.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
