import java.util.ArrayList;
import java.util.Collections;

public class Bataille {
    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();

        ArrayList<Carte> cartes = new ArrayList<Carte>();
        ArrayList<Carte> pile = new ArrayList<Carte>();

        for (String couleur : Carte.couleurs) {
            for (String valeur : Carte.valeurs) {
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

        System.out.println("Taille de départ : "+j1.cartes.size());
        System.out.println("Taille de départ : "+j2.cartes.size());

        // Boucle de jeu
        while (!j1.cartes.isEmpty() && !j2.cartes.isEmpty()) {
            Carte carteJ1 = j1.tireCarte();
            Carte carteJ2 = j2.tireCarte();

            System.out.println(carteJ1+" || "+carteJ2);

            carteJ1.compareCartes(j1, carteJ1, j2, carteJ2, pile);

            // Afficher les scores
            System.out.println("Score J1: " + j1.compteur + " || Score J2: " + j2.compteur);
        }


        if(!pile.isEmpty()) {
            if(j1.cartes.isEmpty()) {
                j2.cartes.addAll(pile);
            }
            else {
                j1.cartes.addAll(pile);
            }
        }

        System.out.println("Cartes J1 : "+j1.cartes+" "+j1.cartes.size());
        System.out.println("Cartes J2 : "+j2.cartes+" "+j2.cartes.size()+"\n\n");

        // Afficher le vainqueur
        if (j2.cartes.isEmpty()) {
            System.out.println("Joueur 1 gagne!");
        } else {
            System.out.println("Joueur 2 gagne!");
        }
    }
}