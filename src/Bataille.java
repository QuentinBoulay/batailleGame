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
                // méthode get() est utilisée pour renvoyer l'élément à la position spécifiée (donc i) dans la liste
                j1.ajouteCarte(cartes.get(i));
            } else {
                j2.ajouteCarte(cartes.get(i));
            }
        }

        // Boucle de jeu
        while (!j1.cartes.isEmpty() && !j2.cartes.isEmpty()) {
            Carte carteJ1 = j1.tireCarte();
            Carte carteJ2 = j2.tireCarte();

            System.out.println(carteJ1+" "+carteJ2);

            carteJ1.compareCartes(j1, carteJ1, j2, carteJ2);

            // Afficher les scores
            System.out.println("Score J1: " + j1.compteur + ", Score J2: " + j2.compteur);
        }

        // Afficher le vainqueur
        if (j1.compteur > j2.compteur) {
            System.out.println("Joueur 1 gagne!");
        } else if (j2.compteur > j1.compteur) {
            System.out.println("Joueur 2 gagne!");
        } else {
            System.out.println("Égalité!");
        }
    }
}