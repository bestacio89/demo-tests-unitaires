package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalleDeBainTest {

    @Test
    public void testSalleDeBainConstructor() {
        SalleDeBain salleDeBain = new SalleDeBain(1, 10.5);
        assertEquals(1, salleDeBain.getNumEtage());
        assertEquals(10.5, salleDeBain.getSuperficie());
        assertEquals(Piece.TYPE_SDB, salleDeBain.getType());
    }

    @Test
    public void testSalleDeBainNegativeEtage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new SalleDeBain(-1, 10.5);
        });
        assertEquals("L'étage doit être un nombre positif ou zéro.", exception.getMessage());
    }

    @Test
    public void testSalleDeBainZeroSuperficie() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new SalleDeBain(1, 0);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }

    @Test
    public void testSalleDeBainNegativeSuperficie() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new SalleDeBain(1, -10.5);
        });
        assertEquals("La superficie doit être un nombre positif.", exception.getMessage());
    }
}
