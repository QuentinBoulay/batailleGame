public class Carte {
    public static String[] couleurs = { "trèfle", "carreau", "cœur", "pique"};
    public static int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
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
}