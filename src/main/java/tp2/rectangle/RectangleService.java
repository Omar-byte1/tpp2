package tp2.rectangle;

public class RectangleService {

    public static double surface(Rectangle r) {
        return r.surface();
    }

    public static double perimetre(Rectangle r) {
        return r.perimetre();
    }

    public static boolean estCarre(Rectangle r) {
        return r.estCarre();
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 5.0);
        System.out.println(rect);

        System.out.println("Surface: " + RectangleService.surface(rect));
        System.out.println("Périmètre: " + RectangleService.perimetre(rect));
        System.out.println("Est carré: " + RectangleService.estCarre(rect));
    }

}



