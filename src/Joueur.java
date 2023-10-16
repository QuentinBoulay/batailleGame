import java.util.ArrayList;

public class Joueur {
    private ArrayList<Carte> cartes = new ArrayList<Carte>();
    private int compteur = 0;

    public Joueur() {
        this.cartes = new ArrayList<Carte>();
        this.compteur = 0;
    }

    public void ajouteCarte(Carte carte) {
        cartes.add(carte);
    }

    public Carte tireCarte() {
        if (!cartes.isEmpty()) {
            return cartes.remove(0);
        } else {
            return null;
        }
    }

    public ArrayList getPaquet() {
        return cartes;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur() {
        compteur = compteur+1;
    }

}