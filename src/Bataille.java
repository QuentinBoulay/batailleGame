import java.util.ArrayList;
import java.util.Collections;

public class Bataille {
    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();

        ArrayList<Carte> cartes = new ArrayList<Carte>();
        ArrayList<Carte> pile = new ArrayList<Carte>();

        for (String couleur : Carte.getCouleurs()) {
            for (String valeur : Carte.getValeurs()) {
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

        System.out.println("Taille de départ : "+j1.getPaquet().size());
        System.out.println("Taille de départ : "+j2.getPaquet().size());

        // Boucle de jeu
        while (!j1.getPaquet().isEmpty() && !j2.getPaquet().isEmpty()) {
            Carte carteJ1 = j1.tireCarte();
            Carte carteJ2 = j2.tireCarte();

            System.out.println(carteJ1+" || "+carteJ2);

            carteJ1.compareCartes(j1, carteJ1, j2, carteJ2, pile);

            // Afficher les scores
            System.out.println("Score J1: " + j1.getCompteur() + " || Score J2: " + j2.getCompteur() + "\n");
        }


        if(!pile.isEmpty()) {
            if(j1.getPaquet().isEmpty()) {
                j2.getPaquet().addAll(pile);
            }
            else {
                j1.getPaquet().addAll(pile);
            }
        }

        System.out.println("Cartes J1 : "+j1.getPaquet()+" "+j1.getPaquet().size());
        System.out.println("Cartes J2 : "+j2.getPaquet()+" "+j2.getPaquet().size()+"\n\n");

        // Afficher le vainqueur
        if (j2.getPaquet().isEmpty()) {
            System.out.println("Joueur 1 gagne!");
        } else {
            System.out.println("Joueur 2 gagne!");
        }
    }
}