package questao_09;

public class Areas {
    private double a, b, c;

    public Areas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Areas(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double areaQuadrado() {
        return a * a;
    }

    public double areaTriangulo() {
        return (a * b) / 2;
    }

    public double areaTrapezio() {
        return ((a + b) * c) / 2;
    }
}

