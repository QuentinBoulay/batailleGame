public class Carte {
    public static String[] couleurs = { "trèfle", "carreau", "cœur", "pique"};
    public static int[] valeurs = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private String couleur;
    private int valeur;

    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public String toString() {
        return this.valeur+" "+this.couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void compareCartes(Joueur j1, Carte carteJ1, Joueur j2, Carte carteJ2) {
        // Comparer les cartes et attribuer les points
        if (carteJ1.getValeur() > carteJ2.getValeur()) {
            j1.compteur += 1;
        } else if (carteJ2.getValeur() > carteJ1.getValeur()) {
            j2.compteur += 1;
        }
    }
}