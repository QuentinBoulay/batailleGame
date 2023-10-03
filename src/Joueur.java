import java.util.ArrayList;
import java.util.Collections;
public class Joueur {
    private ArrayList<Carte> cartes = new ArrayList<Carte>();
    private int compteur = 0;

    public void ajouteCarte(Carte carte) {
        cartes.add(carte);
    }

    public Carte tireCarte() {
        if (cartes.size() > 0) {
            return cartes.remove(0);
        } else {
            return null;
        }
    }

    public boolean aDesCartes() {
        return !cartes.isEmpty();
    }

    public void incrementerCompteur() {
        compteur++;
    }

    public int getCompteur() {
        return compteur;
    }
}