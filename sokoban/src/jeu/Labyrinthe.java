package jeu;

/**
 * Classe représentant le labyrinthe et décrivant les murs
 */
public class Labyrinthe {

    /**
     * Pour un x et un y donnés, murs[x][y] vaut true si et seulement si la case (x,y) est un mur.
     */
    boolean[][] murs;

    /**
     * Constante représentant un mur
     */
    public final static char MUR = "#";

    /**
     * Constante représentant une caisse
     */
    public final static char CAISSE = "$";

    /**
     * Constante représentant un personnage
     */
    public final static char PJ = "@";

    /**
     * Constante représentant un dépot
     */
    public final static char DEPOT = ".";

    /**
     * Constante représentant un espace vide
     */
    public final static char VIDE = " ";

}
