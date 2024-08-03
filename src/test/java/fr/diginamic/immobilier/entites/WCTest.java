package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WCTest {

    @Test
    public void testConstructorAndGettersValid() {
        int etage = 1;
        double superficie = 2.5;
        WC wc = new WC(etage, superficie);

        assertNotNull(wc);
        assertEquals(etage, wc.getNumEtage());
        assertEquals(superficie, wc.getSuperficie(), 0.001);
    }

    @Test
    public void testConstructorInvalidEtage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new WC(-1, 2.5);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testConstructorInvalidSuperficie() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new WC(1, -2.5);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetSuperficieValid() {
        WC wc = new WC(1, 2.5);
        wc.setSuperficie(3.0);
        assertEquals(3.0, wc.getSuperficie(), 0.001);
    }

    @Test
    public void testSetSuperficieInvalid() {
        WC wc = new WC(1, 2.5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wc.setSuperficie(-3.0);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetNumEtageValid() {
        WC wc = new WC(1, 2.5);
        wc.setNumEtage(2);
        assertEquals(2, wc.getNumEtage());
    }

    @Test
    public void testSetNumEtageInvalid() {
        WC wc = new WC(1, 2.5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wc.setNumEtage(-1);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testGetType() {
        WC wc = new WC(1, 2.5);
        assertEquals(Piece.TYPE_WC, wc.getType());
    }
}
