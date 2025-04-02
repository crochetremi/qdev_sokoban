package jeu;

/**
 * Classe représentant le jeu et décrivant le labyrinthe, le personnage et l'ensemble des caisses et des lieux de dépôt
 */
public class Jeu {

    /**
     * Constante liée aux déplacement vers le haut
     */
    public final static String HAUT = "HAUT";

    /**
     * Constante liée aux déplacement vers le bas
     */
    public final static String BAS = "BAS";

    /**
     * Constante liée aux déplacement vers la gauche
     */
    public final static String GAUCHE = "GAUCHE";

    /**
     * Constante liée aux déplacement vers la droite
     */
    public final static String DROITE = "DROITE";


    /**
     * Le personnage
     */
    private Perso perso;

    /**
     * Les caisses
     */
    private ListeElements caisses;

    /**
     * Le dépot
     */
    private ListeElements depots;

    /**
     * Le labyrinthe
     */
    private Labyrinthe laby;

}
