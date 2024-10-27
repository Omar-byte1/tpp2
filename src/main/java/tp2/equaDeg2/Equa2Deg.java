package tp2.equaDeg2;

public class Equa2Deg {

    private double a, b, c, delta;

    public Equa2Deg(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = calculateDelta();
    }

    private double calculateDelta() {
        return b * b - 4 * a * c;
    }

    public double getDelta() {
        return delta;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Equation : " + a + " * X'2 + " + b + "* X + " + c + " = 0 ";
    }
}
