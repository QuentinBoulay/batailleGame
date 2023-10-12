import java.util.ArrayList;

public class Joueur {
    public ArrayList<Carte> cartes = new ArrayList<Carte>();
    public int compteur = 0;

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

}