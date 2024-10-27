package tp2.livre;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Biblio {
    private List<Livre> livres;

    public Biblio() {
        this.livres = new ArrayList<>();
    }

    public List<Livre> getLivres() {
        return livres;
    }
    public void addLivre(Livre livre) {
        livres.add(livre);
    }
    public Livre getLivre(int id) {
        for (Livre livre : livres) {
            if (livre.getId() == id) {
                return livre;
            }
        }
        return null;
    }


    }



