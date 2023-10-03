import java.util.ArrayList;
import java.util.Collections;

public class Bataille {
    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();

        ArrayList<Carte> cartes = new ArrayList<Carte>();
        for (String couleur : Carte.couleurs) {
            for (int valeur : Carte.valeurs) {
                cartes.add(new Carte(couleur, valeur));
            }
        }

        // Mélanger le paquet
        Collections.shuffle(cartes);

        // Distribuer les cartes
        for (int i = 0; i < cartes.size(); i++) {
            if (i % 2 == 0) {
                j1.ajouteCarte(cartes.get(i));
            } else {
                j2.ajouteCarte(cartes.get(i));
            }
        }

        // Boucle de jeu
        while (j1.aDesCartes() && j2.aDesCartes()) {
            Carte carteJ1 = j1.tireCarte();
            Carte carteJ2 = j2.tireCarte();

            System.out.println(carteJ1+" "+carteJ2);

            // Comparer les cartes et attribuer les points
            if (carteJ1.getValeur() > carteJ2.getValeur()) {
                j1.incrementerCompteur();
            } else if (carteJ2.getValeur() > carteJ1.getValeur()) {
                j2.incrementerCompteur();
            }

            // Afficher les scores
            System.out.println("Score J1: " + j1.getCompteur() + ", Score J2: " + j2.getCompteur());
        }

        // Afficher le vainqueur
        if (j1.getCompteur() > j2.getCompteur()) {
            System.out.println("Joueur 1 gagne!");
        } else if (j2.getCompteur() > j1.getCompteur()) {
            System.out.println("Joueur 2 gagne!");
        } else {
            System.out.println("Égalité!");
        }
    }
}