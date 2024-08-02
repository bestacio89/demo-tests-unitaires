package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChambreTest {

    @Test
    public void testChambreConstructor() {
        int etage = 2;
        double superficie = 15.5;
        Chambre chambre = new Chambre(etage, superficie);

        Assertions.assertNotNull(chambre);
        assertEquals(etage, chambre.getNumEtage());
        Assertions.assertEquals(superficie, chambre.getSuperficie(), 0.01);
    }

    @Test
    public void testGetType() {
        Chambre chambre = new Chambre(1, 20.0);
        Assertions.assertEquals(Piece.TYPE_CHAMBRE, chambre.getType());
    }
}
