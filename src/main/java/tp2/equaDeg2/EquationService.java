package tp2.equaDeg2;

import java.util.Scanner;

public class EquationService {

    public static Equa2Deg createEquation(Scanner clavier) {
        System.out.println("Création d'équation : aX^2 + bX + c = 0");
        System.out.print("Entrez la valeur de a : ");
        double a = clavier.nextDouble();
        System.out.print("Entrez la valeur de b : ");
        double b = clavier.nextDouble();
        System.out.print("Entrez la valeur de c : ");
        double c = clavier.nextDouble();

        return new Equa2Deg(a, b, c);
    }

    public static void resoudre() {
        Scanner clavier = new Scanner(System.in);
        Equa2Deg eq = createEquation(clavier);

        if (eq.getA() == 0) {
            if (eq.getB() == 0) {
                if (eq.getC() == 0) {
                    System.out.println("IR (Infinite solutions)");
                } else {
                    System.out.println("Impossible");
                }
            } else {
                double x = -eq.getC() / eq.getB();
                System.out.println("Solution simple x = " + x);
            }
        } else {
            double delta = eq.getDelta();
            if (delta == 0) {
                double x = -eq.getB() / (2 * eq.getA());
                System.out.println("Solution réelle double x = " + x);
            } else if (delta > 0) {
                double x1 = (-eq.getB() - Math.sqrt(delta)) / (2 * eq.getA());
                double x2 = (-eq.getB() + Math.sqrt(delta)) / (2 * eq.getA());
                System.out.println("Deux solutions réelles : x1 = " + x1 + ", x2 = " + x2);
            } else {
                System.out.println("Solutions complexes.");
                // Implement complex number solution if needed
            }
        }

        clavier.close();
    }

    public static void main(String[] args) {
        resoudre();
    }
}
