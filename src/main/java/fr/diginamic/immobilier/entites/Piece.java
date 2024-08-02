package fr.diginamic.immobilier.entites;

/** Représente une pièce abstraite
 * @author DIGINAMIC
 */
public abstract class Piece {

    /** superficie : superficie */
    private double superficie;

    /** numEtage : étage où se situe la pièce */
    private int numEtage;

    /** TYPE_CHAMBRE : String */
    public static final String TYPE_CHAMBRE = "Chambre";

    /** TYPE_SALON : String */
    public static final String TYPE_SALON = "Salon";

    /** TYPE_CUISINE : String */
    public static final String TYPE_CUISINE = "Cuisine";

    /** TYPE_WC : String */
    public static final String TYPE_WC = "WC";

    /** TYPE_SDB : String */
    public static final String TYPE_SDB = "Salle de bain";

    /** Constructeur
     * @param etage étage
     * @param superficie superficie
     */
    public Piece(int etage, double superficie) {
        if (etage < 0) {
            throw new IllegalArgumentException("L'étage doit être un nombre positif ou zéro.");
        }
        if (superficie <= 0) {
            throw new IllegalArgumentException("La superficie doit être un nombre positif.");
        }
        this.numEtage = etage;
        this.superficie = superficie;
    }

    /** Retourne le type de la pièce
     * @return String
     */
    public abstract String getType();

    /** Getter
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /** Setter
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        if (superficie <= 0) {
            throw new IllegalArgumentException("La superficie doit être un nombre positif.");
        }
        this.superficie = superficie;
    }

    /** Getter
     * @return the numEtage
     */
    public int getNumEtage() {
        return numEtage;
    }

    /** Setter
     * @param numEtage the numEtage to set
     */
    public void setNumEtage(int numEtage) {
        if (numEtage < 0) {
            throw new IllegalArgumentException("L'étage doit être un nombre positif ou zéro.");
        }
        this.numEtage = numEtage;
    }
}
