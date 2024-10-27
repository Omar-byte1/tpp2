package tp2.livre;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private double prix;

    public Livre(int id, String titre, String auteur, double prix) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
    }
}
