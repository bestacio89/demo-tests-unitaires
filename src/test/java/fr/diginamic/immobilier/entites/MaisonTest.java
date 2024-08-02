package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaisonTest {

    private Maison maison;

    @BeforeEach
    public void setUp() {
        maison = new Maison();
    }

    @Test
    public void testAjouterPiece() {
        Chambre chambre = new Chambre(1, 15.0);
        maison.ajouterPiece(chambre);
        assertEquals(1, maison.nbPieces());
        assertTrue(maison.getPieces().contains(chambre));
    }

    @Test
    public void testAjouterPieceNull() {
        maison.ajouterPiece(null);
        assertEquals(0, maison.nbPieces());
    }



    @Test
    public void testNbPieces() {
        assertEquals(0, maison.nbPieces());
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(1, 20.0));
        assertEquals(2, maison.nbPieces());
    }

    @Test
    public void testSuperficieEtage() {
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(1, 20.0));
        maison.ajouterPiece(new Chambre(2, 25.0));
        assertEquals(35.0, maison.superficieEtage(1), 0.01);
        assertEquals(25.0, maison.superficieEtage(2), 0.01);
    }

    @Test
    public void testSuperficieTypePiece() {
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(1, 20.0));
        assertEquals(35.0, maison.superficieTypePiece(Piece.TYPE_CHAMBRE), 0.01);
    }

    @Test
    public void testCalculerSurface() {
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(1, 20.0));
        maison.ajouterPiece(new Chambre(2, 25.0));
        assertEquals(60.0, maison.calculerSurface(), 0.01);
    }

    @Test
    public void testGetNombreEtages() {
        assertEquals(0, maison.nbPieces());
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(2, 20.0));
        maison.ajouterPiece(new Chambre(3, 25.0));
        assertEquals(3, maison.nbPieces());
    }
}
