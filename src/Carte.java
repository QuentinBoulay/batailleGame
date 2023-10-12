import java.util.ArrayList;
import java.util.Arrays;

public class Carte {
    public static String[] couleurs = { "trèfle", "carreau", "cœur", "pique"};
    public static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
    private String couleur;
    private String valeur;

    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public String toString() {
        return this.valeur+" "+this.couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void compareCartes(Joueur j1, Carte carteJ1, Joueur j2, Carte carteJ2, ArrayList<Carte> pile) {
        // Comparer les cartes et attribuer les points (on converti notre tableau valeurs en une liste afin de pouvoir récupérer l'index de chaque carte et comparer)
        if (Arrays.asList(valeurs).indexOf(carteJ1.valeur) > Arrays.asList(valeurs).indexOf(carteJ2.valeur)) {
            j1.cartes.add(carteJ2);
            j1.cartes.add(carteJ1);


            if(!pile.isEmpty()) {
                j1.cartes.addAll(pile);
                pile.clear();
            }
            
            System.out.println("Cartes J1 : "+j1.cartes+" "+j1.cartes.size());
            System.out.println("Cartes J2 : "+j2.cartes+" "+j2.cartes.size()+"\n\n");
            j1.compteur += 1;
        } else if (Arrays.asList(valeurs).indexOf(carteJ2.valeur) > Arrays.asList(valeurs).indexOf(carteJ1.valeur)) {

            j2.cartes.add(carteJ1);
            j2.cartes.add(carteJ2);

            if(!pile.isEmpty()) {
                j2.cartes.addAll(pile);
                pile.clear();
            }
            
            System.out.println("Cartes J1 : "+j1.cartes+" "+j1.cartes.size());
            System.out.println("Cartes J2 : "+j2.cartes+" "+j2.cartes.size()+"\n\n");
            j2.compteur += 1;
        }
        else {
            pile.add(carteJ1);
            pile.add(carteJ2);
            System.out.println("Cartes J1 : "+j1.cartes+" "+j1.cartes.size());
            System.out.println("Cartes J2 : "+j2.cartes+" "+j2.cartes.size()+"\n\n");
        }
    }
}