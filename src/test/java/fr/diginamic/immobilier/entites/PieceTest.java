package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PieceTest {

    @Test
    public void testConstructorAndGettersValid() {
        int etage = 2;
        double superficie = 15.5;
        Piece piece = new Cuisine(etage, superficie);

        assertNotNull(piece);
        assertEquals(etage, piece.getNumEtage());
        assertEquals(superficie, piece.getSuperficie(), 0.001);
    }

    @Test
    public void testConstructorInvalidEtage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cuisine(-1, 15.5);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testConstructorInvalidSuperficie() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cuisine(2, -15.5);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetSuperficieValid() {
        Piece piece = new Cuisine(2, 15.5);
        piece.setSuperficie(20.0);
        assertEquals(20.0, piece.getSuperficie(), 0.001);
    }

    @Test
    public void testSetSuperficieInvalid() {
        Piece piece = new Cuisine(2, 15.5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            piece.setSuperficie(-20.0);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetNumEtageValid() {
        Piece piece = new Cuisine(2, 15.5);
        piece.setNumEtage(3);
        assertEquals(3, piece.getNumEtage());
    }

    @Test
    public void testSetNumEtageInvalid() {
        Piece piece = new Cuisine(2, 15.5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            piece.setNumEtage(-1);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testGetType() {
        Piece piece = new Cuisine(2, 15.5);
        assertEquals(Piece.TYPE_CUISINE, piece.getType());
    }
}
