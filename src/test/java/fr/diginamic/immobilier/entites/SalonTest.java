package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SalonTest {

    @Test
    public void testConstructorAndGettersValid() {
        int etage = 1;
        double superficie = 25.0;
        Salon salon = new Salon(etage, superficie);

        assertNotNull(salon);
        assertEquals(etage, salon.getNumEtage());
        assertEquals(superficie, salon.getSuperficie(), 0.001);
    }

    @Test
    public void testConstructorInvalidEtage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Salon(-1, 25.0);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testConstructorInvalidSuperficie() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Salon(1, -25.0);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetSuperficieValid() {
        Salon salon = new Salon(1, 25.0);
        salon.setSuperficie(30.0);
        assertEquals(30.0, salon.getSuperficie(), 0.001);
    }

    @Test
    public void testSetSuperficieInvalid() {
        Salon salon = new Salon(1, 25.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            salon.setSuperficie(-30.0);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSetNumEtageValid() {
        Salon salon = new Salon(1, 25.0);
        salon.setNumEtage(2);
        assertEquals(2, salon.getNumEtage());
    }

    @Test
    public void testSetNumEtageInvalid() {
        Salon salon = new Salon(1, 25.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            salon.setNumEtage(-1);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testGetType() {
        Salon salon = new Salon(1, 25.0);
        assertEquals(Piece.TYPE_SALON, salon.getType());
    }
}
