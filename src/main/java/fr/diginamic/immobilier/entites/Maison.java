package fr.diginamic.immobilier.entites;

import java.util.ArrayList;
import java.util.List;

/** Représente une maison avec toutes ses pièces
 * @autor DIGINAMIC
 *
 */
public class Maison {

    /** pieces : liste de pièces de la maison */
    private List<Piece> pieces;

    /**
     * Constructeur
     */
    public Maison() {
        // Initialisation de la liste de pièces
        pieces = new ArrayList<>();
    }

    /** Ajoute une pièce à la maison
     * @param nvPiece nouvelle pièce à ajouter
     */
    public void ajouterPiece(Piece nvPiece) {
        if (nvPiece != null && nvPiece.getSuperficie() > 0) {
            pieces.add(nvPiece);
        }
    }

    /** Retourne le nombre de pièces
     * @return int
     */
    public int nbPieces() {
        return pieces.size();
    }

    /** Retourne la superficie d'un étage
     * @param choixEtage choix de l'étage
     * @return double
     */
    public double superficieEtage(int choixEtage) {
        double superficieEtage = 0;

        for (Piece piece : pieces) {
            if (choixEtage == piece.getNumEtage()) {
                superficieEtage += piece.getSuperficie();
            }
        }

        return superficieEtage;
    }

    /** Retourne la superficie totale pour un type de pièce donné
     * @param typePiece type de pièce
     * @return double
     */
    public double superficieTypePiece(String typePiece) {
        double superficie = 0;

        for (Piece piece : pieces) {
            if (typePiece != null && typePiece.equals(piece.getType())) {
                superficie += piece.getSuperficie();
            }
        }

        return superficie;
    }

    /** Retourne la surface totale
     * @return double
     */
    public double calculerSurface() {
        double superficieTot = 0;

        for (Piece piece : pieces) {
            superficieTot += piece.getSuperficie();
        }

        return superficieTot;
    }

    /** Getter pour l'attribut pieces
     * @return the pieces
     */
    public List<Piece> getPieces() {
        return pieces;
    }
}
