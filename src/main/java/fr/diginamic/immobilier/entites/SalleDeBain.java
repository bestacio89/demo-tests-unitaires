package fr.diginamic.immobilier.entites;

/**
 * Pièce de type salle de bain.
 * Représente une salle de bain dans une maison.
 *
 * @author DIGINAMIC
 */
public class SalleDeBain extends Piece {

    /**
     * Constructeur
     *
     * @param etage      étage où se situe la salle de bain
     * @param superficie superficie de la salle de bain
     * @throws IllegalArgumentException if etage is negative or superficie is negative or zero
     */
    public SalleDeBain(int etage, double superficie) {
        super(etage, superficie);
        if (etage < 0 || superficie <= 0) {
            throw new IllegalArgumentException("L'étage ne peut pas être négatif et la superficie doit être positive.");
        }
    }

    @Override
    public String getType() {
        return TYPE_SDB;
    }
}
