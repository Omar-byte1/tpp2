package tp2.livre;

import java.util.Scanner;

public class BiblioService {
    public static void ajouter(Livre livre, Biblio bibliotheque) {
        bibliotheque.getLivres().add(livre);
    }

    public static void supprimer(Livre livre, Biblio bibliotheque) {
        bibliotheque.getLivres().remove(livre);
    }

    public static Livre chercher(int id, Biblio bibliotheque) {
        for (Livre livre : bibliotheque.getLivres()) {
            if (livre.getId() == id) {
                return livre;
            }
        }
        return null;
    }
    public class TestBibliotheque {
        public static void main(String[] args) {
            Biblio bibliotheque = new Biblio();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez l'ID du livre : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Entrez le titre du livre : ");
            String titre = scanner.nextLine();

            System.out.print("Entrez l'auteur du livre : ");
            String auteur = scanner.nextLine();

            System.out.print("Entrez le prix du livre : ");
            double prix = scanner.nextDouble();

            Livre livre = new Livre(id, titre, auteur, prix);
            BiblioService.ajouter(livre, bibliotheque);

            System.out.println("Livre ajouté : " + livre);

            System.out.print("Entrez l'ID du livre à chercher : ");
            int searchId = scanner.nextInt();
            Livre found = BiblioService.chercher(searchId, bibliotheque);

            if (found != null) {
                System.out.println("Livre trouvé : " + found);
            } else {
                System.out.println("Livre non trouvé." );
            }

            scanner.close();
        }
    }
}
