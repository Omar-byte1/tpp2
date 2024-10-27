package tp2.rectangle;

public class Rectangle {


        private double largeur;
        private double hauteur;

        public Rectangle(double largeur, double hauteur) {
            this.largeur = largeur;
            this.hauteur = hauteur;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public double getHauteur() {
            return hauteur;
        }

        public void setHauteur(double hauteur) {
            this.hauteur = hauteur;
        }

        public double surface() {
            return largeur * hauteur;
        }

        public double perimetre() {
            return 2 * (largeur + hauteur);
        }

        public boolean estCarre() {
            return largeur == hauteur;
        }

        @Override
        public String toString() {
            return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
        }
    }

